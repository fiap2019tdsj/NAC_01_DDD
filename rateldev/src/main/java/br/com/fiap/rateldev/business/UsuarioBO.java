package br.com.fiap.rateldev.business;

import java.util.regex.Pattern;

import br.com.fiap.rateldev.beans.Usuario;
import br.com.fiap.rateldev.dao.UsuarioDAO;

public class UsuarioBO {
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern padrao = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return padrao.matcher(email).matches(); 
    } 
	
	public static boolean cadastrar(String nome, String email, String senha, String confirmarSenha) throws Exception  {
		UsuarioDAO udao = new UsuarioDAO();
		String exceptionMsg = "";
		email = email.toLowerCase();
		
		if (email.equals("") && exceptionMsg == "")
			exceptionMsg = "Email não pode estar em branco";
		
		if (email.length() < 7 && exceptionMsg == "")
			exceptionMsg = "Email deve ter no mínimo 7 caracteres";
		
		if (email.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Email deve ter no máximo 100 caracteres";
		
		if (!isValid(email) && exceptionMsg == "")
			exceptionMsg = "Email inválido";
		
		if (nome.equals("") && exceptionMsg == "")
			exceptionMsg = "Nome não pode estar em branco";
		
		if (nome.length() < 4 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no mínimo 4 caracteres";
		
		if (nome.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no máximo 100 caracteres";
		
		if (senha.equals("") && exceptionMsg == "")
			exceptionMsg = "Senha não pode estar em branco";
		
		if (senha.length() < 8 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no mínimo 8 caracteres";
		
		if (senha.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Senha deve ter no máximo 100 caracteres";
		
		if (!senha.equals(confirmarSenha) && exceptionMsg == "")
			exceptionMsg = "Senhas não conferem";
		
		if (udao.buscarUsuarioPorEmail(email) != null && exceptionMsg == "") {
			exceptionMsg = "Email já está em uso";
		}
		
		if (exceptionMsg != "") {
			udao.fecharConexao();
			throw new Exception(exceptionMsg);
		}
		
		boolean retorno = udao.cadastrar(nome, email, senha);
		udao.fecharConexao();
		return retorno;
	}
	
	public static boolean alterar(int id, String nome, String senha, String confirmarSenha) throws Exception {
		UsuarioDAO udao = new UsuarioDAO();
		String exceptionMsg = "";
		
		if (nome.equals("") && exceptionMsg == "")
			exceptionMsg = "Nome não pode estar em branco";
		
		if (nome.length() < 4 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no mínimo 4 caracteres";
		
		if (nome.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no máximo 100 caracteres";
		
		if (senha.equals("") && exceptionMsg == "")
			exceptionMsg = "Senha não pode estar em branco";
		
		if (senha.length() < 8 && exceptionMsg == "")
			exceptionMsg = "Senha deve ter no mínimo 8 caracteres";
		
		if (senha.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Senha deve ter no máximo 100 caracteres";
		
		if (!senha.equals(confirmarSenha) && exceptionMsg == "")
			exceptionMsg = "Senhas não conferem";
		
		if (udao.buscarUsuarioPorId(id) == null && exceptionMsg == "")
			exceptionMsg = "Usuário não existe";
		
		if (exceptionMsg != "") {
			udao.fecharConexao();
			throw new Exception(exceptionMsg);
		}
		
		boolean retorno = udao.alterar(id, nome, senha);
		udao.fecharConexao();
		return retorno;
	}
	
	public static Usuario login(String email, String senha) throws Exception {
		UsuarioDAO udao = new UsuarioDAO();
		String exceptionMsg = "";
		email = email.toLowerCase();
		
		if (email.equals("") && exceptionMsg == "")
			exceptionMsg = "Email não pode estar em branco";
		
		if (email.length() < 7 && exceptionMsg == "")
			exceptionMsg = "Email deve ter no mínimo 7 caracteres";
		
		if (email.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Emails têm no máximo 100 caracteres";
		
		if (!isValid(email) && exceptionMsg == "")
			exceptionMsg = "Email inválido";
		
		if (senha.equals("") && exceptionMsg == "")
			exceptionMsg = "Senha não pode estar em branco";
		
		if (senha.length() < 8 && exceptionMsg == "")
			exceptionMsg = "Email deve ter no mínimo 8 caracteres";
		
		if (senha.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Senhas têm no máximo 100 caracteres";
		
		if (exceptionMsg != "") {
			udao.fecharConexao();
			throw new Exception(exceptionMsg);
		}
		
		Usuario retorno = udao.login(email, senha);
		udao.fecharConexao();
		return retorno;
	}
}

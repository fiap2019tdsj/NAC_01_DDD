package br.com.fiap.rateldev.test;

import br.com.fiap.rateldev.beans.Usuario;
import br.com.fiap.rateldev.business.UsuarioBO;

public class Teste {

	public static void main(String[] args) {
		//Cadastro de Usuário: correto
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldevd@gmail.com", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: senhas não conferem
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldev@gmail.com", "xablau973164", "osasco");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: nome em branco
		try {
			boolean retorno = UsuarioBO.cadastrar("", "rateldev@gmail.com", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: email em branco
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: senha em branco
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldev@gmail.com", "", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: confirmar senha em branco (deve retornar senha não confere)
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldev@gmail.com", "xablau973164", "");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: email inválido
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldevgmail.com", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: email em uso (seguindo que o primeiro passo já foi cadastrado)
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldev@gmail.com", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: nome mínimo caracteres
		try {
			boolean retorno = UsuarioBO.cadastrar("Abu", "rateldev@gmail.com", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: nome máximo caracteres
		try {
			boolean retorno = UsuarioBO.cadastrar("ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar", "rateldev@gmail.com", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: email mínimo caracteres
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "a@a.br", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: email máximo caracteres
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar@bla.com", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: senha mínimo caracteres
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldev@gmail.com", "narnia", "narnia");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Cadastro de Usuário: senha máximo caracteres
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldev@gmail.com", "ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar", "ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: correto
		try {
			boolean retorno = UsuarioBO.alterar(1, "RatelDev", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: id inexistente
		try {
			boolean retorno = UsuarioBO.alterar(1000, "RatelDev", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: nome em branco
		try {
			boolean retorno = UsuarioBO.alterar(1, "", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: senha em branco
		try {
			boolean retorno = UsuarioBO.alterar(1, "RatelDev", "", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: confirmar senha em branco (deve retornar que senha não confere)
		try {
			boolean retorno = UsuarioBO.alterar(1, "RatelDev", "xablau973164", "");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: nome mínimo caracteres
		try {
			boolean retorno = UsuarioBO.alterar(1, "Ra", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: nome máximo caracteres
		try {
			boolean retorno = UsuarioBO.alterar(1, "ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: senha mínimo caracteres
		try {
			boolean retorno = UsuarioBO.alterar(1, "RatelDev", "xablau", "xablau");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Alteração de usuário: senha máximo caracteres
		try {
			boolean retorno = UsuarioBO.alterar(1, "RatelDev", "ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar", "ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar");
			
			if (retorno == true)
				System.out.println("Usuário alterado com sucesso");
			else
				System.out.println("Erro ao alterar usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: correto
		try {
			Usuario retorno = UsuarioBO.login("rateldev@gmail.com", "xablau973164");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: login errado
		try {
			Usuario retorno = UsuarioBO.login("ratel@gmail.com", "xablau789654");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: email em branco
		try {
			Usuario retorno = UsuarioBO.login("", "xablau973164");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: email mínimo caracteres
		try {
			Usuario retorno = UsuarioBO.login("a@a.br", "xablau973164");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: email máximo caracteres
		try {
			Usuario retorno = UsuarioBO.login("ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar@bla.com", "xablau973164");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: email inválido
		try {
			Usuario retorno = UsuarioBO.login("rateldevgmail.com", "xablau973164");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: senha em branco
		try {
			Usuario retorno = UsuarioBO.login("rateldev@gmail.com", "");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: senha mínimo caracteres
		try {
			Usuario retorno = UsuarioBO.login("rateldev@gmail.com", "xablau");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login: senha máximo caracteres
		try {
			Usuario retorno = UsuarioBO.login("rateldev@gmail.com", "ShimbalaiequandovejoosolbeijandoomarShimbalaietodavezqueelevairepousarShimbalaiequandovejoosolbeijandoomar");
			
			if (retorno != null) {
				System.out.println("Usuário logado: " + retorno.getNome());
			} else {
				System.out.println("Falha na autenticação do usuário.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import javax.faces.application.FacesMessage;
  import javax.faces.bean.ManagedBean;
  import javax.faces.bean.ViewScoped;
  import javax.faces.context.FacesContext;
   
  import br.data.crud.UsuarioLogin;
  import br.data.entity.Usuario;

/**
 *
 * @author Cristiano
 */
@ManagedBean
//@ViewScoped  LoginMB
public class JsfLogin {
    private Usuario usuario = new Usuario();

  public String doEfetuarLogin() {
    if("cristiano".equals(usuario.getLogin()) &&
       "123".equals(usuario.getSenha())) {
      /* Se escrever o login e senha correto então vai para a tela principal do sistema. */
      return "index.xhtml";
    }

    //Caso erre o login ou senha fica na mesma tela.
    return null;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Creates a new instance of JsfLogin
     
    public JsfLogin() {
    }
    private UsuarioLogin usuarioLogin = new UsuarioLogin();
        private Usuario usuario = new Usuario();
        
        public String envia() {
              
              usuario = usuarioLogin.getUsuario(usuario.getLogin(), usuario.getSenha());
              if (usuario == null) {
                    usuario = new Usuario();
                    FacesContext.getCurrentInstance().addMessage(
                               null,
                               new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                                           "Erro no Login!"));
                    return null;
              } else {
                    return "/main";
              }
              
              
        }
   
        public Usuario getUsuario() {
              return usuario;
        }
   
        public void setUsuario(Usuario usuario) {
              this.usuario = usuario;
        }*/
}

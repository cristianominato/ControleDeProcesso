package br.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class JsfUsuario {
    
    private String login;
    private String senha;
    private String permissao;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    
    public JsfUsuario() {
    }
    
    public java.util.Collection<br.data.entity.Usuario>getAll(){
        return new br.data.crud.CrudUsuario().getAll();
    }
    
    public void persist(){
        br.data.entity.Usuario usu;
        usu = new br.data.entity.Usuario();
        usu.setLogin(login);
        usu.setSenha(senha);
        usu.setPermissao(permissao);
        new br.data.crud.CrudUsuario().persist(usu);
    }

    public void remove(br.data.entity.Usuario usu){
        new br.data.crud.CrudUsuario().remove(usu);
    }

    public void show(br.data.entity.Usuario usu){
        this.login = usu.getLogin();
        this.senha = usu.getSenha();
        this.permissao = usu.getPermissao();
    }

    public void merge(){
        br.data.entity.Usuario usu;
        usu = new br.data.crud.CrudUsuario().find(login);
        usu.setSenha(senha);
        usu.setPermissao(permissao);
        new br.data.crud.CrudUsuario().merge(usu);
    }

}


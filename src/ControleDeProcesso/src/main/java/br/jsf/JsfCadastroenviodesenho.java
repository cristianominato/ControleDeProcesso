package br.jsf;

import br.data.entity.Cadastroenviodesenho;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.websocket.Session;

@ManagedBean
@RequestScoped
public class JsfCadastroenviodesenho {

    private String nome;
    private String enviar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnviar() {
        return enviar;
    }

    public void setEnviar(String enviar) {
        this.enviar = enviar;
    }
    
    public JsfCadastroenviodesenho() {
    }
      
    public java.util.Collection<br.data.entity.Cadastroenviodesenho>getAll(){
        return new br.data.crud.CrudCadastroenviodesenho().getAll();
    }
    
    public void persist(){
        br.data.entity.Cadastroenviodesenho env;
        env = new br.data.entity.Cadastroenviodesenho();
        env.setNome(nome);
        env.setEnviar(enviar);
        new br.data.crud.CrudCadastroenviodesenho().persist(env);
    }
    
    public void remove(br.data.entity.Cadastroenviodesenho env){
        new br.data.crud.CrudCadastroenviodesenho().remove(env);
    }

    public void show(br.data.entity.Cadastroenviodesenho env){
        this.nome = env.getNome();
        this.enviar = env.getEnviar();
    }

    public void merge(){
        br.data.entity.Cadastroenviodesenho env;
        env = new br.data.crud.CrudCadastroenviodesenho().find(nome);
        env.setEnviar(enviar);
        new br.data.crud.CrudCadastroenviodesenho().merge(env);
    }
    
    public void novo(){
        this.nome = null;
        this.enviar = null;
    }

}

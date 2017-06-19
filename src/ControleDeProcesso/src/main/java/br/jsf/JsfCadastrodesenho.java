package br.jsf;

import br.data.entity.Cadastrodesenho;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.websocket.Session;

@ManagedBean
@RequestScoped
public class JsfCadastrodesenho {

    private String desenho;
    private String revisao;
    private String fkcadastroenviodesenho;

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

    public String getRevisao() {
        return revisao;
    }

    public void setRevisao(String revisao) {
        this.revisao = revisao;
    }
    
    public String getFkcadastroenviodesenho() {
        return fkcadastroenviodesenho;
    }

    public void setFkcadastroenviodesenho(String fkcadastroenviodesenho) {
        this.fkcadastroenviodesenho = fkcadastroenviodesenho;
    }
    
    public JsfCadastrodesenho() {
    }
      
    public java.util.Collection<br.data.entity.Cadastrodesenho>getAll(){
        return new br.data.crud.CrudCadastrodesenho().getAll();
    }
    
    public void persist(){
        br.data.entity.Cadastrodesenho des;
        des = new br.data.entity.Cadastrodesenho();
        des.setDesenho(desenho);
        des.setRevisao(revisao);
        //des.setCadastroenviodesenho(new br.data.crud.CrudCadastroenviodesenho().find(desenho));
        //des.setFkcadastroenviodesenho(fkcadastroenviodesenho);
        des.setCadastroenviodesenho(fkcadastroenviodesenho);
        new br.data.crud.CrudCadastrodesenho().persist(des);
    }  
    
    
    public void remove(br.data.entity.Cadastrodesenho des){
        new br.data.crud.CrudCadastrodesenho().remove(des);
    }

    public void show(br.data.entity.Cadastrodesenho des){
        this.desenho = des.getDesenho();
        this.revisao = des.getRevisao();
        //this.fkcadastroenviodesenho = des.getFkcadastroenviodesenho();
    }
    

    public void merge(){
        br.data.entity.Cadastrodesenho des;
        des = new br.data.crud.CrudCadastrodesenho().find(desenho);
        des.setRevisao(revisao);
        //des.setCadastroenviodesenho(new br.data.crud.CrudCadastroenviodesenho().find(desenho));
        //des.setFkcadastroenviodesenho(fkcadastroenviodesenho);
        new br.data.crud.CrudCadastrodesenho().merge(des);
    }
}

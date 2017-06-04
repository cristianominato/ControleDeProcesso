package br.jsf;

import br.data.entity.Cadastroestrutura;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.websocket.Session;

@ManagedBean
@RequestScoped
public class JsfCadastroestrutura {
    private String nome;
    private String estrutura;
    private String pedido;
    private String potencia;
    private String altatensao;
    private String baixatensao;
    private String tipoconstrutivo;
    private String estiloconstrutivo;
    private String statusprojeto;
    private String statusnucleo;
    private String statusparteativa;
    private String statuscaldeiraria;
    private String statuspintura;
    private String statusfechamento;
    private String statuslaboratorio;
    private String statusexpedicao;
    private String statusmarcenaria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getAltatensao() {
        return altatensao;
    }

    public void setAltatensao(String altatensao) {
        this.altatensao = altatensao;
    }

    public String getBaixatensao() {
        return baixatensao;
    }

    public void setBaixatensao(String baixatensao) {
        this.baixatensao = baixatensao;
    }

    public String getTipoconstrutivo() {
        return tipoconstrutivo;
    }

    public void setTipoconstrutivo(String tipoconstrutivo) {
        this.tipoconstrutivo = tipoconstrutivo;
    }

    public String getEstiloconstrutivo() {
        return estiloconstrutivo;
    }

    public void setEstiloconstrutivo(String estiloconstrutivo) {
        this.estiloconstrutivo = estiloconstrutivo;
    }

    public String getStatusprojeto() {
        return statusprojeto;
    }

    public void setStatusprojeto(String statusprojeto) {
        this.statusprojeto = statusprojeto;
    }

    public String getStatusnucleo() {
        return statusnucleo;
    }

    public void setStatusnucleo(String statusnucleo) {
        this.statusnucleo = statusnucleo;
    }

    public String getStatusparteativa() {
        return statusparteativa;
    }

    public void setStatusparteativa(String statusparteativa) {
        this.statusparteativa = statusparteativa;
    }

    public String getStatuscaldeiraria() {
        return statuscaldeiraria;
    }

    public void setStatuscaldeiraria(String statuscaldeiraria) {
        this.statuscaldeiraria = statuscaldeiraria;
    }

    public String getStatuspintura() {
        return statuspintura;
    }

    public void setStatuspintura(String statuspintura) {
        this.statuspintura = statuspintura;
    }

    public String getStatusfechamento() {
        return statusfechamento;
    }

    public void setStatusfechamento(String statusfechamento) {
        this.statusfechamento = statusfechamento;
    }

    public String getStatuslaboratorio() {
        return statuslaboratorio;
    }

    public void setStatuslaboratorio(String statuslaboratorio) {
        this.statuslaboratorio = statuslaboratorio;
    }

    public String getStatusexpedicao() {
        return statusexpedicao;
    }

    public void setStatusexpedicao(String statusexpedicao) {
        this.statusexpedicao = statusexpedicao;
    }

    public String getStatusmarcenaria() {
        return statusmarcenaria;
    }

    public void setStatusmarcenaria(String statusmarcenaria) {
        this.statusmarcenaria = statusmarcenaria;
    }

    public JsfCadastroestrutura() {
    }
    
    public java.util.Collection<br.data.entity.Cadastroestrutura>getAll(){
        return new br.data.crud.CrudCadastroestrutura().getAll();
    }
    
    
    
    public void persist(){
        br.data.entity.Cadastroestrutura est;
        est = new br.data.entity.Cadastroestrutura();
        est.setNome(nome);
        est.setEstrutura(estrutura);
        est.setPedido(pedido);
        est.setPotencia(potencia);
        est.setAltatensao(altatensao);
        est.setBaixatensao(baixatensao);
        est.setTipoconstrutivo(tipoconstrutivo);
        est.setEstiloconstrutivo(estiloconstrutivo);
        est.setStatusprojeto(statusprojeto);
        est.setStatusnucleo(statusnucleo);
        est.setStatusparteativa(statusparteativa);
        est.setStatuscaldeiraria(statuscaldeiraria);
        est.setStatuspintura(statuspintura);
        est.setStatusfechamento(statusfechamento);
        est.setStatuslaboratorio(statuslaboratorio);
        est.setStatusexpedicao(statusexpedicao);
        est.setStatusmarcenaria(statusmarcenaria);
        new br.data.crud.CrudCadastroestrutura().persist(est);
    }
    
    public void remove(br.data.entity.Cadastroestrutura est){
        new br.data.crud.CrudCadastroestrutura().remove(est);
    }
    
    public void show(br.data.entity.Cadastroestrutura est){
        this.nome = est.getNome();
        this.estrutura = est.getEstrutura();
        this.pedido = est.getPedido();
        this.potencia = est.getPotencia();
        this.altatensao = est.getAltatensao();
        this.baixatensao = est.getBaixatensao();
        this.tipoconstrutivo = est.getTipoconstrutivo();
        this.estiloconstrutivo = est.getEstiloconstrutivo();
        this.statusprojeto = est.getStatusprojeto();
        this.statusnucleo = est.getStatusnucleo();
        this.statusparteativa = est.getStatusparteativa();
        this.statuscaldeiraria = est.getStatuscaldeiraria();
        this.statuspintura = est.getStatuspintura();
        this.statusfechamento = est.getStatusfechamento();
        this.statuslaboratorio = est.getStatuslaboratorio();
        this.statusexpedicao = est.getStatusexpedicao();
        this.statusmarcenaria = est.getStatusmarcenaria();
        
    }
    
    public void merge(){
        br.data.entity.Cadastroestrutura est;
        est = new br.data.crud.CrudCadastroestrutura().find(estrutura);
        est.setNome(nome);
        est.setPedido(pedido);
        est.setPotencia(potencia);
        est.setAltatensao(altatensao);
        est.setBaixatensao(baixatensao);
        est.setTipoconstrutivo(tipoconstrutivo);
        est.setEstiloconstrutivo(estiloconstrutivo);
        est.setStatusprojeto(statusprojeto);
        est.setStatusnucleo(statusnucleo);
        est.setStatusparteativa(statusparteativa);
        est.setStatuscaldeiraria(statuscaldeiraria);
        est.setStatuspintura(statuspintura);
        est.setStatusfechamento(statusfechamento);
        est.setStatuslaboratorio(statuslaboratorio);
        est.setStatusexpedicao(statusexpedicao);
        est.setStatusmarcenaria(statusmarcenaria);
        new br.data.crud.CrudCadastroestrutura().merge(est);
    }
}
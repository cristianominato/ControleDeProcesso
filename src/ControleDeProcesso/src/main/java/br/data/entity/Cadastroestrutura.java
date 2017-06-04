/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cristiano
 */
@Entity
@Table(name = "cadastroestrutura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastroestrutura.findAll", query = "SELECT c FROM Cadastroestrutura c")
    , @NamedQuery(name = "Cadastroestrutura.findByNome", query = "SELECT c FROM Cadastroestrutura c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cadastroestrutura.findByEstrutura", query = "SELECT c FROM Cadastroestrutura c WHERE c.estrutura = :estrutura")
    , @NamedQuery(name = "Cadastroestrutura.findByPedido", query = "SELECT c FROM Cadastroestrutura c WHERE c.pedido = :pedido")
    , @NamedQuery(name = "Cadastroestrutura.findByPotencia", query = "SELECT c FROM Cadastroestrutura c WHERE c.potencia = :potencia")
    , @NamedQuery(name = "Cadastroestrutura.findByAltatensao", query = "SELECT c FROM Cadastroestrutura c WHERE c.altatensao = :altatensao")
    , @NamedQuery(name = "Cadastroestrutura.findByBaixatensao", query = "SELECT c FROM Cadastroestrutura c WHERE c.baixatensao = :baixatensao")
    , @NamedQuery(name = "Cadastroestrutura.findByTipoconstrutivo", query = "SELECT c FROM Cadastroestrutura c WHERE c.tipoconstrutivo = :tipoconstrutivo")
    , @NamedQuery(name = "Cadastroestrutura.findByEstiloconstrutivo", query = "SELECT c FROM Cadastroestrutura c WHERE c.estiloconstrutivo = :estiloconstrutivo")
    , @NamedQuery(name = "Cadastroestrutura.findByStatusprojeto", query = "SELECT c FROM Cadastroestrutura c WHERE c.statusprojeto = :statusprojeto")
    , @NamedQuery(name = "Cadastroestrutura.findByStatusnucleo", query = "SELECT c FROM Cadastroestrutura c WHERE c.statusnucleo = :statusnucleo")
    , @NamedQuery(name = "Cadastroestrutura.findByStatusparteativa", query = "SELECT c FROM Cadastroestrutura c WHERE c.statusparteativa = :statusparteativa")
    , @NamedQuery(name = "Cadastroestrutura.findByStatuscaldeiraria", query = "SELECT c FROM Cadastroestrutura c WHERE c.statuscaldeiraria = :statuscaldeiraria")
    , @NamedQuery(name = "Cadastroestrutura.findByStatuspintura", query = "SELECT c FROM Cadastroestrutura c WHERE c.statuspintura = :statuspintura")
    , @NamedQuery(name = "Cadastroestrutura.findByStatusfechamento", query = "SELECT c FROM Cadastroestrutura c WHERE c.statusfechamento = :statusfechamento")
    , @NamedQuery(name = "Cadastroestrutura.findByStatuslaboratorio", query = "SELECT c FROM Cadastroestrutura c WHERE c.statuslaboratorio = :statuslaboratorio")
    , @NamedQuery(name = "Cadastroestrutura.findByStatusexpedicao", query = "SELECT c FROM Cadastroestrutura c WHERE c.statusexpedicao = :statusexpedicao")
    , @NamedQuery(name = "Cadastroestrutura.findByStatusmaercenaria", query = "SELECT c FROM Cadastroestrutura c WHERE c.statusmaecenaria = :statusmarcenaria")})
public class Cadastroestrutura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "estrutura")
    private String estrutura;
    @Size(max = 10)
    @Column(name = "pedido")
    private String pedido;
    @Size(max = 10)
    @Column(name = "potencia")
    private String potencia;
    @Size(max = 15)
    @Column(name = "altatensao")
    private String altatensao;
    @Size(max = 15)
    @Column(name = "baixatensao")
    private String baixatensao;
    @Size(max = 15)
    @Column(name = "tipoconstrutivo")
    private String tipoconstrutivo;
    @Size(max = 15)
    @Column(name = "estiloconstrutivo")
    private String estiloconstrutivo;
    @Size(max = 15)
    @Column(name = "statusprojeto")
    private String statusprojeto;
    @Size(max = 15)
    @Column(name = "statusnucleo")
    private String statusnucleo;
    @Size(max = 15)
    @Column(name = "statusparteativa")
    private String statusparteativa;
    @Size(max = 15)
    @Column(name = "statuscaldeiraria")
    private String statuscaldeiraria;
    @Size(max = 15)
    @Column(name = "statuspintura")
    private String statuspintura;
    @Size(max = 15)
    @Column(name = "statusfechamento")
    private String statusfechamento;
    @Size(max = 15)
    @Column(name = "statuslaboratorio")
    private String statuslaboratorio;
    @Size(max = 15)
    @Column(name = "statusexpedicao")
    private String statusexpedicao;
    @Size(max = 15)
    @Column(name = "statusmarcenaria")
    private String statusmarcenaria;
    @OneToMany(mappedBy = "fKcadastroestrutura")
    private Collection<Cadastrodesenho> cadastrodesenhoCollection;
    @JoinColumn(name = "FK_cadastrodesenho", referencedColumnName = "desenho")
    @ManyToOne
    private Cadastrodesenho fKcadastrodesenho;

    public Cadastroestrutura() {
    }

    public Cadastroestrutura(String estrutura) {
        this.estrutura = estrutura;
    }

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

    @XmlTransient
    public Collection<Cadastrodesenho> getCadastrodesenhoCollection() {
        return cadastrodesenhoCollection;
    }

    public void setCadastrodesenhoCollection(Collection<Cadastrodesenho> cadastrodesenhoCollection) {
        this.cadastrodesenhoCollection = cadastrodesenhoCollection;
    }

    public Cadastrodesenho getFKcadastrodesenho() {
        return fKcadastrodesenho;
    }

    public void setFKcadastrodesenho(Cadastrodesenho fKcadastrodesenho) {
        this.fKcadastrodesenho = fKcadastrodesenho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estrutura != null ? estrutura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastroestrutura)) {
            return false;
        }
        Cadastroestrutura other = (Cadastroestrutura) object;
        if ((this.estrutura == null && other.estrutura != null) || (this.estrutura != null && !this.estrutura.equals(other.estrutura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.Cadastroestrutura[ estrutura=" + estrutura + " ]";
    }
    
}

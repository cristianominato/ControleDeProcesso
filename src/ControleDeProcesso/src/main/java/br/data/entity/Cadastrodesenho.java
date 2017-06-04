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
@Table(name = "cadastrodesenho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastrodesenho.findAll", query = "SELECT c FROM Cadastrodesenho c")
    , @NamedQuery(name = "Cadastrodesenho.findByDesenho", query = "SELECT c FROM Cadastrodesenho c WHERE c.desenho = :desenho")
    , @NamedQuery(name = "Cadastrodesenho.findByRevisao", query = "SELECT c FROM Cadastrodesenho c WHERE c.revisao = :revisao")
    , @NamedQuery(name = "Cadastrodesenho.findByCadastroenviodesenho", query = "SELECT c FROM Cadastrodesenho c WHERE c.cadastroenviodesenho = :cadastroenviodesenho")})
public class Cadastrodesenho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "desenho")
    private String desenho;
    @Column(name = "revisao")
    private Integer revisao;
    @Size(max = 50)
    @Column(name = "cadastroenviodesenho")
    private String cadastroenviodesenho;
    @JoinColumn(name = "FK_cadastroenviodesenho", referencedColumnName = "nome")
    @ManyToOne
    private Cadastroenviodesenho fKcadastroenviodesenho;
    @JoinColumn(name = "FK_cadastroestrutura", referencedColumnName = "estrutura")
    @ManyToOne
    private Cadastroestrutura fKcadastroestrutura;
    @OneToMany(mappedBy = "fKcadastrodesenho")
    private Collection<Cadastroestrutura> cadastroestruturaCollection;

    public Cadastrodesenho() {
    }

    public Cadastrodesenho(String desenho) {
        this.desenho = desenho;
    }

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

    public Integer getRevisao() {
        return revisao;
    }

    public void setRevisao(Integer revisao) {
        this.revisao = revisao;
    }

    public String getCadastroenviodesenho() {
        return cadastroenviodesenho;
    }

    public void setCadastroenviodesenho(String cadastroenviodesenho) {
        this.cadastroenviodesenho = cadastroenviodesenho;
    }

    public Cadastroenviodesenho getFKcadastroenviodesenho() {
        return fKcadastroenviodesenho;
    }

    public void setFKcadastroenviodesenho(Cadastroenviodesenho fKcadastroenviodesenho) {
        this.fKcadastroenviodesenho = fKcadastroenviodesenho;
    }

    public Cadastroestrutura getFKcadastroestrutura() {
        return fKcadastroestrutura;
    }

    public void setFKcadastroestrutura(Cadastroestrutura fKcadastroestrutura) {
        this.fKcadastroestrutura = fKcadastroestrutura;
    }

    @XmlTransient
    public Collection<Cadastroestrutura> getCadastroestruturaCollection() {
        return cadastroestruturaCollection;
    }

    public void setCadastroestruturaCollection(Collection<Cadastroestrutura> cadastroestruturaCollection) {
        this.cadastroestruturaCollection = cadastroestruturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (desenho != null ? desenho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastrodesenho)) {
            return false;
        }
        Cadastrodesenho other = (Cadastrodesenho) object;
        if ((this.desenho == null && other.desenho != null) || (this.desenho != null && !this.desenho.equals(other.desenho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.Cadastrodesenho[ desenho=" + desenho + " ]";
    }
    
}

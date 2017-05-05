/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cristiano
 */
@Entity
@Table(name = "cadastroenviodesenho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastroenviodesenho.findAll", query = "SELECT c FROM Cadastroenviodesenho c")
    , @NamedQuery(name = "Cadastroenviodesenho.findByNome", query = "SELECT c FROM Cadastroenviodesenho c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cadastroenviodesenho.findByEnviar", query = "SELECT c FROM Cadastroenviodesenho c WHERE c.enviar = :enviar")})
public class Cadastroenviodesenho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nome")
    private String nome;
    @Size(max = 20)
    @Column(name = "enviar")
    private String enviar;

    public Cadastroenviodesenho() {
    }

    public Cadastroenviodesenho(String nome) {
        this.nome = nome;
    }

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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nome != null ? nome.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastroenviodesenho)) {
            return false;
        }
        Cadastroenviodesenho other = (Cadastroenviodesenho) object;
        if ((this.nome == null && other.nome != null) || (this.nome != null && !this.nome.equals(other.nome))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.Cadastroenviodesenho[ nome=" + nome + " ]";
    }
    
}
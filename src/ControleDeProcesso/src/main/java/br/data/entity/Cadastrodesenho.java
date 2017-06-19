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

@Entity
@Table(name = "cadastrodesenho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastrodesenho.findAll", query = "SELECT c FROM Cadastrodesenho c")
    , @NamedQuery(name = "Cadastrodesenho.findByDesenho", query = "SELECT c FROM Cadastrodesenho c WHERE c.desenho = :desenho")
    , @NamedQuery(name = "Cadastrodesenho.findByCadastroenviodesenho", query = "SELECT c FROM Cadastrodesenho c WHERE c.cadastroenviodesenho = :cadastroenviodesenho")
    , @NamedQuery(name = "Cadastrodesenho.findByRevisao", query = "SELECT c FROM Cadastrodesenho c WHERE c.revisao = :revisao")})
public class Cadastrodesenho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "desenho")
    private String desenho;
    @Size(max = 50)
    @Column(name = "cadastroenviodesenho")
    private String cadastroenviodesenho;
    @Size(max = 10)
    @Column(name = "revisao")
    private String revisao;
    @OneToMany(mappedBy = "fkcadastrodesenho")
    private Collection<Cadastroenviodesenho> cadastroenviodesenhoCollection;
    @JoinColumn(name = "fkcadastroenviodesenho", referencedColumnName = "nome")
    @ManyToOne
    private Cadastroenviodesenho fkcadastroenviodesenho;
    @JoinColumn(name = "fkcadastroestrutura", referencedColumnName = "estrutura")
    @ManyToOne
    private Cadastroestrutura fkcadastroestrutura;
    @OneToMany(mappedBy = "fkcadastrodesenho")
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

    public String getCadastroenviodesenho() {
        return cadastroenviodesenho;
    }

    public void setCadastroenviodesenho(String cadastroenviodesenho) {
        this.cadastroenviodesenho = cadastroenviodesenho;
    }

    public String getRevisao() {
        return revisao;
    }

    public void setRevisao(String revisao) {
        this.revisao = revisao;
    }

    @XmlTransient
    public Collection<Cadastroenviodesenho> getCadastroenviodesenhoCollection() {
        return cadastroenviodesenhoCollection;
    }

    public void setCadastroenviodesenhoCollection(Collection<Cadastroenviodesenho> cadastroenviodesenhoCollection) {
        this.cadastroenviodesenhoCollection = cadastroenviodesenhoCollection;
    }

    public Cadastroenviodesenho getFkcadastroenviodesenho() {
        return fkcadastroenviodesenho;
    }

    public void setFkcadastroenviodesenho(Cadastroenviodesenho fkcadastroenviodesenho) {
        this.fkcadastroenviodesenho = fkcadastroenviodesenho;
    }

    public Cadastroestrutura getFkcadastroestrutura() {
        return fkcadastroestrutura;
    }

    public void setFkcadastroestrutura(Cadastroestrutura fkcadastroestrutura) {
        this.fkcadastroestrutura = fkcadastroestrutura;
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

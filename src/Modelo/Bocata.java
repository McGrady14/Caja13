
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que define los atributos y metodos de los bocatas.
 * 
 */
@Entity
@Table(name = "bocata")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bocata.findAll", query = "SELECT b FROM Bocata b")
    , @NamedQuery(name = "Bocata.findByIdBocata", query = "SELECT b FROM Bocata b WHERE b.idBocata = :idBocata")
    , @NamedQuery(name = "Bocata.findByEtiqueta", query = "SELECT b FROM Bocata b WHERE b.etiqueta = :etiqueta")})
public class Bocata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_bocata")
    private Integer idBocata;
    @Column(name = "etiqueta")
    private String etiqueta;
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne
    private Articulo idArticulo;

    public Bocata() {
    }

    public Bocata(Integer idBocata) {
        this.idBocata = idBocata;
    }

    public Bocata(Integer idBocata, String etiqueta, Articulo idArticulo) {
        this.idBocata = idBocata;
        this.etiqueta = etiqueta;
        this.idArticulo = idArticulo;
    }

    public Integer getIdBocata() {
        return idBocata;
    }

    public void setIdBocata(Integer idBocata) {
        this.idBocata = idBocata;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Articulo getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Articulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBocata != null ? idBocata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bocata)) {
            return false;
        }
        Bocata other = (Bocata) object;
        if ((this.idBocata == null && other.idBocata != null) || (this.idBocata != null && !this.idBocata.equals(other.idBocata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Bocata[ idBocata=" + idBocata + " ]";
    }
    
}

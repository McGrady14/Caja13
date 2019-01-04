/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author lafuente
 */
@Entity
@Table(name = "mojito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mojito.findAll", query = "SELECT m FROM Mojito m")
    , @NamedQuery(name = "Mojito.findByIdMojito", query = "SELECT m FROM Mojito m WHERE m.idMojito = :idMojito")
    , @NamedQuery(name = "Mojito.findByEtiqueta", query = "SELECT m FROM Mojito m WHERE m.etiqueta = :etiqueta")})
public class Mojito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_mojito")
    private Integer idMojito;
    @Column(name = "etiqueta")
    private String etiqueta;
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne
    private Articulo idArticulo;

    public Mojito() {
    }

    public Mojito(Integer idMojito) {
        this.idMojito = idMojito;
    }

    public Mojito(Integer idMojito, String etiqueta, Articulo idArticulo) {
        this.idMojito = idMojito;
        this.etiqueta = etiqueta;
        this.idArticulo = idArticulo;
    }

    public Integer getIdMojito() {
        return idMojito;
    }

    public void setIdMojito(Integer idMojito) {
        this.idMojito = idMojito;
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
        hash += (idMojito != null ? idMojito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mojito)) {
            return false;
        }
        Mojito other = (Mojito) object;
        if ((this.idMojito == null && other.idMojito != null) || (this.idMojito != null && !this.idMojito.equals(other.idMojito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Mojito[ idMojito=" + idMojito + " ]";
    }
    
}

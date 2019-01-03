/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "bebida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bebida.findAll", query = "SELECT b FROM Bebida b")
    , @NamedQuery(name = "Bebida.findByIdBebida", query = "SELECT b FROM Bebida b WHERE b.idBebida = :idBebida")
    , @NamedQuery(name = "Bebida.findByEtiqueta", query = "SELECT b FROM Bebida b WHERE b.etiqueta = :etiqueta")
    , @NamedQuery(name = "Bebida.findByExistencias", query = "SELECT b FROM Bebida b WHERE b.existencias = :existencias")})
public class Bebida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_bebida")
    private Integer idBebida;
    @Column(name = "etiqueta")
    private String etiqueta;
    @Column(name = "existencias")
    private BigInteger existencias;
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne
    private Articulo idArticulo;

    public Bebida() {
    }

    public Bebida(Integer idBebida) {
        this.idBebida = idBebida;
    }

    public Integer getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(Integer idBebida) {
        this.idBebida = idBebida;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public BigInteger getExistencias() {
        return existencias;
    }

    public void setExistencias(BigInteger existencias) {
        this.existencias = existencias;
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
        hash += (idBebida != null ? idBebida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bebida)) {
            return false;
        }
        Bebida other = (Bebida) object;
        if ((this.idBebida == null && other.idBebida != null) || (this.idBebida != null && !this.idBebida.equals(other.idBebida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Bebida[ idBebida=" + idBebida + " ]";
    }
    
}

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
@Table(name = "montado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Montado.findAll", query = "SELECT m FROM Montado m")
    , @NamedQuery(name = "Montado.findByIdMontado", query = "SELECT m FROM Montado m WHERE m.idMontado = :idMontado")
    , @NamedQuery(name = "Montado.findByEtiqueta", query = "SELECT m FROM Montado m WHERE m.etiqueta = :etiqueta")})
public class Montado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_montado")
    private Integer idMontado;
    @Column(name = "etiqueta")
    private String etiqueta;
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne
    private Articulo idArticulo;

    public Montado() {
    }

    public Montado(Integer idMontado) {
        this.idMontado = idMontado;
    }

    public Montado(Integer idMontado, String etiqueta, Articulo idArticulo) {
        this.idMontado = idMontado;
        this.etiqueta = etiqueta;
        this.idArticulo = idArticulo;
    }

    public Integer getIdMontado() {
        return idMontado;
    }

    public void setIdMontado(Integer idMontado) {
        this.idMontado = idMontado;
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
        hash += (idMontado != null ? idMontado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Montado)) {
            return false;
        }
        Montado other = (Montado) object;
        if ((this.idMontado == null && other.idMontado != null) || (this.idMontado != null && !this.idMontado.equals(other.idMontado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Montado[ idMontado=" + idMontado + " ]";
    }
    
}

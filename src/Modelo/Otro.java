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
 * Clase que define los atributos y metodos de los otros.
 * 
 */

@Entity
@Table(name = "otro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Otro.findAll", query = "SELECT o FROM Otro o")
    , @NamedQuery(name = "Otro.findByIdOtro", query = "SELECT o FROM Otro o WHERE o.idOtro = :idOtro")
    , @NamedQuery(name = "Otro.findByEtiqueta", query = "SELECT o FROM Otro o WHERE o.etiqueta = :etiqueta")})
public class Otro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_otro")
    private Integer idOtro;
    @Column(name = "etiqueta")
    private String etiqueta;
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne
    private Articulo idArticulo;

    public Otro() {
    }

    public Otro(Integer idOtro) {
        this.idOtro = idOtro;
    }

    public Otro(Integer idOtro, String etiqueta, Articulo idArticulo) {
        this.idOtro = idOtro;
        this.etiqueta = etiqueta;
        this.idArticulo = idArticulo;
    }

    public Integer getIdOtro() {
        return idOtro;
    }

    public void setIdOtro(Integer idOtro) {
        this.idOtro = idOtro;
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
        hash += (idOtro != null ? idOtro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Otro)) {
            return false;
        }
        Otro other = (Otro) object;
        if ((this.idOtro == null && other.idOtro != null) || (this.idOtro != null && !this.idOtro.equals(other.idOtro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Otro[ idOtro=" + idOtro + " ]";
    }
    
}

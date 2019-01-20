/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Clase que define los atributos y metodos de las lineas de ticket.
 * 
 */

@Entity
@Table(name = "lineaticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lineaticket.findAll", query = "SELECT l FROM Lineaticket l")
    , @NamedQuery(name = "Lineaticket.findByIdLinea", query = "SELECT l FROM Lineaticket l WHERE l.idLinea = :idLinea")
    , @NamedQuery(name = "Lineaticket.findByNombre", query = "SELECT l FROM Lineaticket l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "Lineaticket.findByPrecio", query = "SELECT l FROM Lineaticket l WHERE l.precio = :precio")})
public class Lineaticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_linea")
    private Integer idLinea;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private BigDecimal precio;
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne
    private Articulo idArticulo;
    @JoinColumn(name = "id_ticket", referencedColumnName = "id_ticket")
    @ManyToOne
    private Ticket idTicket;

    public Lineaticket() {
    }

    public Lineaticket(Integer idLinea) {
        this.idLinea = idLinea;
    }

    public Lineaticket(Integer idLinea, String nombre, BigDecimal precio, Articulo idArticulo, Ticket idTicket) {
        this.idLinea = idLinea;
        this.nombre = nombre;
        this.precio = precio;
        this.idArticulo = idArticulo;
        this.idTicket = idTicket;
    }

    public Integer getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(Integer idLinea) {
        this.idLinea = idLinea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Articulo getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Articulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Ticket getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Ticket idTicket) {
        this.idTicket = idTicket;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLinea != null ? idLinea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lineaticket)) {
            return false;
        }
        Lineaticket other = (Lineaticket) object;
        if ((this.idLinea == null && other.idLinea != null) || (this.idLinea != null && !this.idLinea.equals(other.idLinea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Lineaticket[ idLinea=" + idLinea + " ]";
    }
    
}

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
@Table(name = "lineaticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lineaticket.findAll", query = "SELECT l FROM Lineaticket l")
    , @NamedQuery(name = "Lineaticket.findByIdLinea", query = "SELECT l FROM Lineaticket l WHERE l.idLinea = :idLinea")
    , @NamedQuery(name = "Lineaticket.findByTipo", query = "SELECT l FROM Lineaticket l WHERE l.tipo = :tipo")})
public class Lineaticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_linea")
    private Integer idLinea;
    @Column(name = "tipo")
    private String tipo;
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

    public Integer getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(Integer idLinea) {
        this.idLinea = idLinea;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lafuente
 */
@Entity
@Table(name = "caja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c")
    , @NamedQuery(name = "Caja.findByIdCaja", query = "SELECT c FROM Caja c WHERE c.idCaja = :idCaja")
    , @NamedQuery(name = "Caja.findByFecha", query = "SELECT c FROM Caja c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Caja.findByRecaudacion", query = "SELECT c FROM Caja c WHERE c.recaudacion = :recaudacion")})
public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_caja")
    private Integer idCaja;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "recaudacion")
    private BigInteger recaudacion;

    public Caja() {
    }

    public Caja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigInteger getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigInteger recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaja != null ? idCaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.idCaja == null && other.idCaja != null) || (this.idCaja != null && !this.idCaja.equals(other.idCaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Caja[ idCaja=" + idCaja + " ]";
    }
    
}

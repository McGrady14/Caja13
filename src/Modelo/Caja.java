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
    , @NamedQuery(name = "Caja.findByFechaExtraccion", query = "SELECT c FROM Caja c WHERE c.fechaExtraccion = :fechaExtraccion")
    , @NamedQuery(name = "Caja.findByC200", query = "SELECT c FROM Caja c WHERE c.c200 = :c200")
    , @NamedQuery(name = "Caja.findByC100", query = "SELECT c FROM Caja c WHERE c.c100 = :c100")
    , @NamedQuery(name = "Caja.findByC50", query = "SELECT c FROM Caja c WHERE c.c50 = :c50")
    , @NamedQuery(name = "Caja.findByC20", query = "SELECT c FROM Caja c WHERE c.c20 = :c20")
    , @NamedQuery(name = "Caja.findByC10", query = "SELECT c FROM Caja c WHERE c.c10 = :c10")
    , @NamedQuery(name = "Caja.findByC5", query = "SELECT c FROM Caja c WHERE c.c5 = :c5")
    , @NamedQuery(name = "Caja.findByC2", query = "SELECT c FROM Caja c WHERE c.c2 = :c2")
    , @NamedQuery(name = "Caja.findByC1", query = "SELECT c FROM Caja c WHERE c.c1 = :c1")
    , @NamedQuery(name = "Caja.findByC05", query = "SELECT c FROM Caja c WHERE c.c05 = :c05")
    , @NamedQuery(name = "Caja.findByC02", query = "SELECT c FROM Caja c WHERE c.c02 = :c02")
    , @NamedQuery(name = "Caja.findByC01", query = "SELECT c FROM Caja c WHERE c.c01 = :c01")
    , @NamedQuery(name = "Caja.findByC005", query = "SELECT c FROM Caja c WHERE c.c005 = :c005")})
public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_caja")
    private Integer idCaja;
    @Column(name = "fecha_extraccion")
    @Temporal(TemporalType.DATE)
    private Date fechaExtraccion;
    @Column(name = "c200")
    private BigInteger c200;
    @Column(name = "c100")
    private BigInteger c100;
    @Column(name = "c50")
    private BigInteger c50;
    @Column(name = "c20")
    private BigInteger c20;
    @Column(name = "c10")
    private BigInteger c10;
    @Column(name = "c5")
    private BigInteger c5;
    @Column(name = "c2")
    private BigInteger c2;
    @Column(name = "c1")
    private BigInteger c1;
    @Column(name = "c05")
    private BigInteger c05;
    @Column(name = "c02")
    private BigInteger c02;
    @Column(name = "c01")
    private BigInteger c01;
    @Column(name = "c005")
    private BigInteger c005;

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

    public Date getFechaExtraccion() {
        return fechaExtraccion;
    }

    public void setFechaExtraccion(Date fechaExtraccion) {
        this.fechaExtraccion = fechaExtraccion;
    }

    public BigInteger getC200() {
        return c200;
    }

    public void setC200(BigInteger c200) {
        this.c200 = c200;
    }

    public BigInteger getC100() {
        return c100;
    }

    public void setC100(BigInteger c100) {
        this.c100 = c100;
    }

    public BigInteger getC50() {
        return c50;
    }

    public void setC50(BigInteger c50) {
        this.c50 = c50;
    }

    public BigInteger getC20() {
        return c20;
    }

    public void setC20(BigInteger c20) {
        this.c20 = c20;
    }

    public BigInteger getC10() {
        return c10;
    }

    public void setC10(BigInteger c10) {
        this.c10 = c10;
    }

    public BigInteger getC5() {
        return c5;
    }

    public void setC5(BigInteger c5) {
        this.c5 = c5;
    }

    public BigInteger getC2() {
        return c2;
    }

    public void setC2(BigInteger c2) {
        this.c2 = c2;
    }

    public BigInteger getC1() {
        return c1;
    }

    public void setC1(BigInteger c1) {
        this.c1 = c1;
    }

    public BigInteger getC05() {
        return c05;
    }

    public void setC05(BigInteger c05) {
        this.c05 = c05;
    }

    public BigInteger getC02() {
        return c02;
    }

    public void setC02(BigInteger c02) {
        this.c02 = c02;
    }

    public BigInteger getC01() {
        return c01;
    }

    public void setC01(BigInteger c01) {
        this.c01 = c01;
    }

    public BigInteger getC005() {
        return c005;
    }

    public void setC005(BigInteger c005) {
        this.c005 = c005;
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

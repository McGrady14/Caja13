
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Clase que define los atributos y metodos de los articulos.
 * 
 */
@Entity
@Table(name = "articulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a")
    , @NamedQuery(name = "Articulo.findByIdArticulo", query = "SELECT a FROM Articulo a WHERE a.idArticulo = :idArticulo")
    , @NamedQuery(name = "Articulo.findByNombre", query = "SELECT a FROM Articulo a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Articulo.findByPrecio", query = "SELECT a FROM Articulo a WHERE a.precio = :precio")})
public class Articulo implements Serializable {

    @Column(name = "precio")
    private BigDecimal precio;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_articulo")
    private Integer idArticulo;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idArticulo")
    private List<Montado> montadoList;
    @OneToMany(mappedBy = "idArticulo")
    private List<Mojito> mojitoList;
    @OneToMany(mappedBy = "idArticulo")
    private List<Otro> otroList;
    @OneToMany(mappedBy = "idArticulo")
    private List<Lineaticket> lineaticketList;
    @OneToMany(mappedBy = "idArticulo")
    private List<Bocata> bocataList;
    @OneToMany(mappedBy = "idArticulo")
    private List<Bebida> bebidaList;

    public Articulo() {
    }

    public Articulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Articulo(Integer idArticulo, String nombre, BigDecimal precio) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @XmlTransient
    public List<Montado> getMontadoList() {
        return montadoList;
    }

    public void setMontadoList(List<Montado> montadoList) {
        this.montadoList = montadoList;
    }

    @XmlTransient
    public List<Mojito> getMojitoList() {
        return mojitoList;
    }

    public void setMojitoList(List<Mojito> mojitoList) {
        this.mojitoList = mojitoList;
    }

    @XmlTransient
    public List<Otro> getOtroList() {
        return otroList;
    }

    public void setOtroList(List<Otro> otroList) {
        this.otroList = otroList;
    }

    @XmlTransient
    public List<Lineaticket> getLineaticketList() {
        return lineaticketList;
    }

    public void setLineaticketList(List<Lineaticket> lineaticketList) {
        this.lineaticketList = lineaticketList;
    }

    @XmlTransient
    public List<Bocata> getBocataList() {
        return bocataList;
    }

    public void setBocataList(List<Bocata> bocataList) {
        this.bocataList = bocataList;
    }

    @XmlTransient
    public List<Bebida> getBebidaList() {
        return bebidaList;
    }

    public void setBebidaList(List<Bebida> bebidaList) {
        this.bebidaList = bebidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticulo != null ? idArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.idArticulo == null && other.idArticulo != null) || (this.idArticulo != null && !this.idArticulo.equals(other.idArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Articulo[ idArticulo=" + idArticulo + " ]";
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
}

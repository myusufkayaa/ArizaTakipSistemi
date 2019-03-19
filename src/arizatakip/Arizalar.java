/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arizatakip;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author myusu
 */
@Entity
@Table(name = "ARIZALAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arizalar.findAll", query = "SELECT a FROM Arizalar a")
    , @NamedQuery(name = "Arizalar.findByArizaId", query = "SELECT a FROM Arizalar a WHERE a.arizaId = :arizaId")
    , @NamedQuery(name = "Arizalar.findByAriza", query = "SELECT a FROM Arizalar a WHERE a.ariza = :ariza")
    , @NamedQuery(name = "Arizalar.findByDurumu", query = "SELECT a FROM Arizalar a WHERE a.durumu = :durumu")
    , @NamedQuery(name = "Arizalar.findByMarka", query = "SELECT a FROM Arizalar a WHERE a.marka = :marka")
    , @NamedQuery(name = "Arizalar.findByModel", query = "SELECT a FROM Arizalar a WHERE a.model = :model")
    , @NamedQuery(name = "Arizalar.findByMusteriId", query = "SELECT a FROM Arizalar a WHERE a.musteriId = :musteriId")})
public class Arizalar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ARIZA_ID")
    private Integer arizaId;
    @Column(name = "ARIZA")
    private String ariza;
    @Column(name = "DURUMU")
    private Integer durumu;
    @Column(name = "MARKA")
    private String marka;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "MUSTERI_ID")
    private Integer musteriId;

    public Arizalar() {
    }

    public Arizalar(Integer arizaId) {
        this.arizaId = arizaId;
    }

    public Integer getArizaId() {
        return arizaId;
    }

    public void setArizaId(Integer arizaId) {
        this.arizaId = arizaId;
    }

    public String getAriza() {
        return ariza;
    }

    public void setAriza(String ariza) {
        this.ariza = ariza;
    }

    public Integer getDurumu() {
        return durumu;
    }

    public void setDurumu(Integer durumu) {
        this.durumu = durumu;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Integer musteriId) {
        this.musteriId = musteriId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arizaId != null ? arizaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arizalar)) {
            return false;
        }
        Arizalar other = (Arizalar) object;
        if ((this.arizaId == null && other.arizaId != null) || (this.arizaId != null && !this.arizaId.equals(other.arizaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arizatakip.Arizalar[ arizaId=" + arizaId + " ]";
    }
    
}

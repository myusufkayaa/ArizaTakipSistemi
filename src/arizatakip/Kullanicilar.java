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
@Table(name = "KULLANICILAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kullanicilar.findAll", query = "SELECT k FROM Kullanicilar k")
    , @NamedQuery(name = "Kullanicilar.findByKullaniciId", query = "SELECT k FROM Kullanicilar k WHERE k.kullaniciId = :kullaniciId")
    , @NamedQuery(name = "Kullanicilar.findByAdi", query = "SELECT k FROM Kullanicilar k WHERE k.adi = :adi")
    , @NamedQuery(name = "Kullanicilar.findBySifre", query = "SELECT k FROM Kullanicilar k WHERE k.sifre = :sifre")
    , @NamedQuery(name = "Kullanicilar.findByBirimId", query = "SELECT k FROM Kullanicilar k WHERE k.birimId = :birimId")})
public class Kullanicilar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KULLANICI_ID")
    private Integer kullaniciId;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SIFRE")
    private String sifre;
    @Column(name = "BIRIM_ID")
    private Integer birimId;

    public Kullanicilar() {
    }

    public Kullanicilar(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public Integer getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Integer getBirimId() {
        return birimId;
    }

    public void setBirimId(Integer birimId) {
        this.birimId = birimId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kullaniciId != null ? kullaniciId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kullanicilar)) {
            return false;
        }
        Kullanicilar other = (Kullanicilar) object;
        if ((this.kullaniciId == null && other.kullaniciId != null) || (this.kullaniciId != null && !this.kullaniciId.equals(other.kullaniciId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arizatakip.Kullanicilar[ kullaniciId=" + kullaniciId + " ]";
    }
    
}

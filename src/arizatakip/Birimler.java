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
@Table(name = "BIRIMLER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Birimler.findAll", query = "SELECT b FROM Birimler b")
    , @NamedQuery(name = "Birimler.findByBirimadi", query = "SELECT b FROM Birimler b WHERE b.birimadi = :birimadi")
    , @NamedQuery(name = "Birimler.findByBirimId", query = "SELECT b FROM Birimler b WHERE b.birimId = :birimId")})
public class Birimler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "BIRIMADI")
    private String birimadi;
    @Id
    @Basic(optional = false)
    @Column(name = "BIRIM_ID")
    private Integer birimId;

    public Birimler() {
    }

    public Birimler(Integer birimId) {
        this.birimId = birimId;
    }

    public String getBirimadi() {
        return birimadi;
    }

    public void setBirimadi(String birimadi) {
        this.birimadi = birimadi;
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
        hash += (birimId != null ? birimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Birimler)) {
            return false;
        }
        Birimler other = (Birimler) object;
        if ((this.birimId == null && other.birimId != null) || (this.birimId != null && !this.birimId.equals(other.birimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arizatakip.Birimler[ birimId=" + birimId + " ]";
    }
    
}

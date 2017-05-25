/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author LapasovFG.VCRP
 */
@Entity
public class Locoinf implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idinfo;

    private int numloco;

    private Long lat;

    private Long lon;

    private Timestamp time;

    /**
     * Get the value of time
     *
     * @return the value of time
     */
    public Timestamp getTime() {
        return time;
    }

    /**
     * Set the value of time
     *
     * @param time new value of time
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }

    /**
     * Get the value of lon
     *
     * @return the value of lon
     */
    public Long getLon() {
        return lon;
    }

    /**
     * Set the value of lon
     *
     * @param lon new value of lon
     */
    public void setLon(Long lon) {
        this.lon = lon;
    }

    /**
     * Get the value of lat
     *
     * @return the value of lat
     */
    public Long getLat() {
        return lat;
    }

    /**
     * Set the value of lat
     *
     * @param lat new value of lat
     */
    public void setLat(Long lat) {
        this.lat = lat;
    }

    /**
     * Get the value of numloco
     *
     * @return the value of numloco
     */
    public int getNumloco() {
        return numloco;
    }

    /**
     * Set the value of numloco
     *
     * @param numloco new value of numloco
     */
    public void setNumloco(int numloco) {
        this.numloco = numloco;
    }

    public Long getId() {
        return idinfo;
    }

    public void setId(Long id) {
        this.idinfo = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinfo != null ? idinfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locoinf)) {
            return false;
        }
        Locoinf other = (Locoinf) object;
        if ((this.idinfo == null && other.idinfo != null) || (this.idinfo != null && !this.idinfo.equals(other.idinfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.model.Locoinf[ id=" + idinfo + " ]";
    }
    
}

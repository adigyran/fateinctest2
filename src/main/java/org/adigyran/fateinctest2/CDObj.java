/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adigyran.fateinctest2;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author adigyran
 */
@Entity
public class CDObj implements Serializable{
    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    @Id
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", unique=true, nullable=false)
    private long id;
  
    private String Title;
    private String Artist;
    private String Country;
    private String Company;
    private Double Price;
    private int Year;

    public CDObj( String Title, String Artist, String Country, String Company, Double Price, int Year) {
        //this.id = id;
        this.Title = Title;
        this.Artist = Artist;
        this.Country = Country;
        this.Company = Company;
        this.Price = Price;
        this.Year = Year;
    }

    public CDObj() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getArtist() {
        return Artist;
    }

    public String getCountry() {
        return Country;
    }

    public String getCompany() {
        return Company;
    }

    public Double getPrice() {
        return Price;
    }

    public int getYear() {
        return Year;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public void setYear(short Year) {
        this.Year = Year;
    }
        
   
    
}

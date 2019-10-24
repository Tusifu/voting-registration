/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Edison
 */
@Entity
public class Citizen implements Serializable {
    @Id
    private String nationalId;
    private String firstName;
    private String lastName;
    private String sex;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfBirth;
    @ManyToOne (cascade=CascadeType.ALL)
    private District district;

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Citizen() {
    }

    public Citizen(String nationalId, String firstName, String lastName, String sex, Date dateOfBirth, District district) {
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.district = district;
    }
    
    
}

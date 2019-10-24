/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Edison
 */
@Entity
public class District implements Serializable {
    
    @Id 
    private String id;
    private String name;
    @OneToMany (mappedBy = "district")
    private List<Citizen> citizen;

    public District() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Citizen> getCitizen() {
        return citizen;
    }

    public void setCitizen(List<Citizen> citizen) {
        this.citizen = citizen;
    }

    public District(String id, String name, List<Citizen> citizen) {
        this.id = id;
        this.name = name;
        this.citizen = citizen;
    }

  
    
}

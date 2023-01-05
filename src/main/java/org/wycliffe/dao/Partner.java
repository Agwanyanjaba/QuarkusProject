package org.wycliffe.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partners")
public class Partner {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    //constructor
    public Partner(Long id, String partnerName){
        this.id = id;
        this.name = partnerName;
    }

    public Partner() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

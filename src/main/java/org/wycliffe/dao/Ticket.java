package org.wycliffe.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name="Tickets")
public class Ticket extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(length=30, unique = true)
    public String name;

    @Column(length = 10, unique = true)
    public String seat;

    @Column()
    public String created_at;

    //constructor
    public Ticket(){

    }

    public Ticket(Long id, String name, String seat, String created_at) {
        this.id = id;
        this.name = name;
        this.seat = seat;
        this.created_at = created_at;
    }
    //constructor
//    public Ticket(String name, String seat){
//        this.name = name;
//        this.seat = seat;
//
//    }


}

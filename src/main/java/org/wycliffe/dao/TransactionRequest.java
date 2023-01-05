package org.wycliffe.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.*;

@Entity
@Table(name="transactions")

@ApplicationScoped
public class TransactionRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String transaction_reference_id;

    @OneToOne()
    private Partner partner;
    private double amount;
    //private String transaction_type;
    private String currency;

    private double extra_charges=90.09;


    //constructor
    public TransactionRequest() {

    }
     public TransactionRequest(String transactionRef, Partner partner, double amount,
                              String transactionType, String currency){
        this.transaction_reference_id = transactionRef;
        this.partner = partner;
        this.amount = amount;
        //this.transaction_type = transactionType;
        this.currency = currency;
    }

    public String getTransaction_reference_id() {
        return transaction_reference_id;
    }

    public void setTransaction_reference_id(String transaction_reference_id) {
        this.transaction_reference_id = transaction_reference_id;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getExtra_charges() {
        return extra_charges;
    }

    public void setExtra_charges(double extra_charges) {
        this.extra_charges = extra_charges;
    }
}

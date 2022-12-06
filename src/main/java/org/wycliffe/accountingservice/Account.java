
package org.wycliffe.accountingservice;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Account {

    @JsonProperty("name")
    String name;
    @JsonProperty("type")
    AccountType type;// USER_ACCOUNT
    @JsonProperty("product")
    AccountProduct product; // FULFILLMENT
    @JsonProperty("productUserId")
    String productUserId;
    @JsonProperty("globalUserId")
    String globalUserId;
    @JsonProperty("currency")
    String currency="KES";


    public Account(String name, AccountType type, AccountProduct product, String productUserId, String globalUserId, String currency) {
        this.name = name;
        this.type = type;
        this.product = product;
        this.productUserId = productUserId;
        this.globalUserId = globalUserId;
        this.currency = currency;
    }

    public Account(){

    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Object getGlobalUserId() {
        return globalUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductUserId() {
        return productUserId;
    }

    public void setProductUserId(String productUserId) {
        this.productUserId = productUserId;
    }



}

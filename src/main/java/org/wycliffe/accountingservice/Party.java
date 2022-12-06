
package org.wycliffe.accountingservice;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;


public class Party {

//    PartiesAccount partiesAccount = new PartiesAccount();

    @JsonProperty("account")
    private PartiesAccount account = new PartiesAccount(getAccount().partyAccountName, getAccount().accountNumber, getAccount().accountType);

    public PartiesAccount getAccount() {
        return account;
    }

    public void setAccount(PartiesAccount account) {
        this.account = account;
    }

}

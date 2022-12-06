
package org.wycliffe.accountingservice;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;

@ApplicationScoped
public class Taxes {

    @JsonProperty
    private String vat="60";

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

}

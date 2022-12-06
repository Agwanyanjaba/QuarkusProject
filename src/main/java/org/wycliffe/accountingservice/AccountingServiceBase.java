
package org.wycliffe.accountingservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.wycliffe.utils.UUIDGenerator;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AccountingServiceBase {


    UUIDGenerator uuidGenerator = new UUIDGenerator();
    //Account account = new Account();


    @JsonProperty("description")
    private String description;

    @JsonProperty("sourceProduct")
    private String sourceProduct = String.valueOf(AccountProduct.LOAN);
    @JsonProperty("sourceReferenceId")
    private String sourceReferenceId = uuidGenerator.generateUUID();
    @JsonProperty("transactionDate")
    private String transactionDate;
    @JsonProperty("account")

    String partnerName = "Wycliffe Test"; //should come from external service/event
    String partnerID = "140";//should come from external service/event
    private Account account = new Account(partnerName, AccountType.USER_ACCOUNT, AccountProduct.FULFILLMENT, partnerID, null, "KES");
    @JsonProperty("currency")
    private String currency="KES";
    @JsonProperty("items")

    private List<Item> items;// = new ArrayList<>();

    //getters ahd setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSourceProduct() {
        return sourceProduct;
    }

    public void setSourceProduct(String sourceProduct) {
        this.sourceProduct = sourceProduct;
    }

    public String getSourceReferenceId() {
        return sourceReferenceId;
    }

    public void setSourceReferenceId(String sourceReferenceId) {
        this.sourceReferenceId = sourceReferenceId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }



}

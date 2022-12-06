
package org.wycliffe.accountingservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.wycliffe.utils.UUIDGenerator;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class Item {

    UUIDGenerator uuidGenerator = new UUIDGenerator();

    @JsonProperty
    private List<Adjustment> adjustments;
    @JsonProperty
    private Long amountCharged;
    @JsonProperty
    private String category;
    @JsonProperty
    private String description;
    @JsonProperty
    private Meta meta;
    @JsonProperty("parties")
    private List<Party> parties;
    @JsonProperty("quantity")
    private Long quantity=1L;
    @JsonProperty//("sourceReferenceId")
    private String sourceReferenceId = uuidGenerator.generateUUID();
    @JsonProperty("taxes")
    private List<Taxes> taxes;
    @JsonProperty("transactionType")
    private String transactionType;
    @JsonProperty("unitPrice")
    private Long unitPrice=240L;
    @JsonProperty
    private String units="1";



    public List<Adjustment> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
    }

    public Long getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(Long amountCharged) {
        this.amountCharged = amountCharged;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Party> getParties() {
        return parties;
    }

    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getSourceReferenceId() {
        return sourceReferenceId;
    }

    public void setSourceReferenceId(String sourceReferenceId) {
        this.sourceReferenceId = sourceReferenceId;
    }

    public List<Taxes> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Taxes> taxes) {
        this.taxes = taxes;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

}

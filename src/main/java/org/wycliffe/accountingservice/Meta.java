
package org.wycliffe.accountingservice;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Meta {

    @Expose
    private BusinessDetails businessDetails;
    @Expose
    private OrderDetails orderDetails;

    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

}

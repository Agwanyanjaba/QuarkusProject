
package org.wycliffe.accountingservice;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Adjustment {

    @Expose
    private Long laonApplicationFee;

    public Long getLaonApplicationFee() {
        return laonApplicationFee;
    }

    public void setLaonApplicationFee(Long laonApplicationFee) {
        this.laonApplicationFee = laonApplicationFee;
    }

}

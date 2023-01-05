package org.wycliffe.accountingservice.responses;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TicketResponse {
    String responseMessage;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}

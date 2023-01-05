package org.wycliffe.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.wycliffe.dao.TransactionRequest;
import org.wycliffe.service.TransactionService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.logging.Logger;

@Path("/v1/transactions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class TransactionController {
    private static final Logger LOGGER = Logger.getLogger(TransactionController.class);
    @Inject
    TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @POST
    @Path("/credit")
    public Response addTransaction(TransactionRequest request) throws JsonProcessingException {

        //JSON String
        ObjectMapper mapper = new ObjectMapper();
        String response = mapper.writeValueAsString(request);
         LOGGER.info("==================[Payload"+response);

        if (request == null) {
            // return an error response if the request object is null
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {

            //Build request payload
            transactionService.saveTransaction(request);

            return Response.ok("Request Success").build();
        }

    }
}

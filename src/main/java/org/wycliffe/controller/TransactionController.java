package org.wycliffe.controller;

import org.wycliffe.dao.TransactionRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/transactions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class TransactionController {
    @POST
    @Path("/credit")
    public Response addTransaction(TransactionRequest request){

        request = new TransactionRequest()

        return Response.ok(requset).build();

    }
}

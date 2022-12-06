package org.wycliffe.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;
import org.jdbi.v3.core.statement.UnableToExecuteStatementException;
import org.wycliffe.accountingservice.AccountingServiceBase;
import org.wycliffe.dao.Users;
import org.wycliffe.service.UsersUpdateService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;


@Path("/users")
@ApplicationScoped
@Produces("application/json")

public class UsersController {
    private static final Logger LOGGER = Logger.getLogger(UsersController.class);
    @Inject
    UsersUpdateService usersUpdateService;

    @Inject
    AccountingServiceBase accountingServiceBase;
    @PUT
    @Path("/update-users")
    public Response updateUsers( ){
        Map<String, Object> responseMap = new HashMap<>();
        //return response to client
        try {
            int response = usersUpdateService.updateEmails();
            responseMap.put("UpdateStatus", "Success");
            responseMap.put("RowsUpdated", response);
            return Response.accepted(responseMap).build();
        }
        catch(UnableToExecuteStatementException e){
            LOGGER.error("==========================[UnableToExecuteStatementException:: "+e.getMessage());
            responseMap.put("UpdateStatus", "Failed");
            responseMap.put("RowsUpdated", "No rows Updated");
            return Response.accepted(responseMap).build();
        }
    }

    @PUT
    @Path("/update-account")
    @Produces("application/json")
    public Response returnAccountingDetails() throws JsonProcessingException {
        LOGGER.info("==========================[Accounting Service Details:: "+accountingServiceBase.toString());
        //serialize to json
//        Gson accountingJson = new Gson();
//
        ObjectMapper mapper = new ObjectMapper();
        String response = mapper.writeValueAsString(accountingServiceBase);
        return Response.ok(response).build();
    }


}

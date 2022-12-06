package org.wycliffe.service;

import org.jboss.logging.Logger;
import org.hibernate.exception.ConstraintViolationException;
import org.wycliffe.dao.Ticket;


import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Path("/tickets")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")

//calculate price of a ticket
//check if user data is valid and issue a ticket

public class TicketService {
    //logger
    private static final Logger LOGGER = Logger.getLogger(TicketService.class);

    @GET
    public List<Ticket> getTickets(){
        List<Ticket> listAll = Ticket.findAll().list();
        return listAll.stream().map(ie -> {
                    return new Ticket(ie.id, ie.name, ie.seat, ie.created_at);
                }).collect(Collectors.toList());
    }

    //get specific ticket
    @GET
    @Path("{id}")
    public Ticket getTicket(@PathParam(value="id") Long id){
        Ticket entity =  Ticket.findById(id);
        if(entity==null){
            throw new WebApplicationException("Ticket with" + id + "not found", 404);
        }

        return entity;
    }

    //POST a ticket
    @POST()
    @Path("/create-ticket")
    @Transactional
    public Response postTicket(Ticket ticket){
        if(ticket.id !=null){
            throw new WebApplicationException ("Ticket id was invalidly set", 402);

        }
        try{
            ticket.persist();
            LOGGER.info("==============["+"Ticket created successfully");
            return Response.ok(ticket).build();
        }
        catch(ConstraintViolationException e){
            Map<String, String> errorMap = new LinkedHashMap<>();
            errorMap.put("ResponseStatus","Failed");
            errorMap.put("ResponseCode", "40003");

            return null;

        }

    }

}

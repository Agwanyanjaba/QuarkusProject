package org.wycliffe;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.wycliffe.dao.Ticket;

import javax.ws.rs.core.MediaType;
import java.util.Date;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.StringContains.containsString;

@QuarkusTest
public class MyServiceTest {

    @Test
    public void testListAllTicket() {
        given()
          .when().get("/tickets")
          .then()
             .statusCode(200)
             .body(
                     containsString("Phantom of the Opera"),
                     containsString("Chorus Line"),
                     containsString("Mamma mia")
             );
    }
    @Test
    public void testGetTickets() {
        // call the getTickets method and verify that it returns a list of tickets
        Ticket[] tickets = given()
                .when().get("/tickets")
                .then()
                .statusCode(200)
                .extract().as(Ticket[].class);

        assertThat(tickets.length, is(greaterThan(0)));
    }

    @Test
    public void testGetTicket() {
        // call the getTicket method and verify that it returns a single ticket
        Ticket ticket = given()
                .pathParam("id", 1)
                .when().get("/tickets/{id}")
                .then()
                .statusCode(200)
                .extract().as(Ticket.class);

        assertThat(ticket.id, is(1L));
    }

    @Test
    public void testPostTicket() {
        // create a ticket object and call the postTicket method
        Ticket ticket = new Ticket();
        ticket.name = "Test Ticket";
        ticket.seat = "A1";
        ticket.created_at ="2022-12-06 13:10:21";
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body(ticket)
                .when().post("/tickets/create-ticket")
                .then()
                .statusCode(200);

        // verify that the ticket was created by calling the getTicket method
//        Ticket createdTicket = given()
//                .pathParam("id", 4)
//                .when().get("/tickets/{id}")
//                .then()
//                .statusCode(200)
//                .extract().as(Ticket.class);

//        assertThat(200, is(equalTo(ticket.)));
    }

}
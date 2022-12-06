package org.wycliffe.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jdbi.v3.core.Jdbi;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class DatabaseConnectorConfig {
    @ConfigProperty(name="quarkus.datasource.jdbc.url")
    String url;
    //username property
    @ConfigProperty(name="quarkus.datasource.username")
    String username;

    //password
    @ConfigProperty(name="quarkus.datasource.password")
    String password;




    public Jdbi establishConnection(){
        Jdbi jdbi = null;
        try{
             jdbi = Jdbi.create(url,username, password);

        }catch(Exception e){
            e.printStackTrace();

        }

        return jdbi;

    }

}

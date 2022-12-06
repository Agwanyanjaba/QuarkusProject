package org.wycliffe.service;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.wycliffe.config.DatabaseConnectorConfig;
import org.wycliffe.config.StatementsConfig;
import org.wycliffe.dao.Users;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

@ApplicationScoped
public class UsersUpdateService {
    private static final Logger LOGGER = Logger.getLogger(UsersUpdateService.class);
    @Inject
    StatementsConfig statementsConfig;
    //should update the email addresses

    @Inject
    DatabaseConnectorConfig databaseConnectorConfig;


    public int updateEmails(){
        //no checks needed
        //open connection
        Jdbi jdbi = databaseConnectorConfig.establishConnection();

        int result = 0;
        try(Handle handle = jdbi.open()){
            result = handle.execute(statementsConfig.getUpdateuser());
            handle.close();
        }
        LOGGER.info("======================[Number of records updated: "+result);
        //return update number
        return result;

    }
}

package org.wycliffe.service;

import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.DataException;
import org.jboss.logging.Logger;
import org.jboss.logmanager.LogManager;
import org.wycliffe.dao.TransactionRequest;
import org.wycliffe.repositories.TransactionRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionService {

    private static final Logger LOGGER = Logger.getLogger(TransactionService.class);

    //call transaction repository
    @Inject
    TransactionRepository transactionRepository;

    @Transactional
    public void saveTransaction(TransactionRequest transactionRequest){
        try{
            transactionRepository.persist(transactionRequest);
        }
        catch(PersistenceException e){
            LOGGER.errorf("ERROR OCCURRED %s", e.getMessage());
        }

    }

}

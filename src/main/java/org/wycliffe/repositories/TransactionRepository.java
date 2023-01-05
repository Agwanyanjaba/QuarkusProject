package org.wycliffe.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.wycliffe.dao.TransactionRequest;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransactionRepository implements PanacheRepository<TransactionRequest> {
}

package org.wycliffe.utils;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped

public class UUIDGenerator {
    public String generateUUID(){
        UUID loansUUID = UUID.randomUUID();
        return String.valueOf(loansUUID);
    }
}

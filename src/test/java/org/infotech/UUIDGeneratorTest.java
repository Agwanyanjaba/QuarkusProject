package org.infotech;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.wycliffe.utils.UUIDGenerator;

import static io.smallrye.common.constraint.Assert.assertTrue;

@QuarkusTest
public class UUIDGeneratorTest {

    @Test
    public void testGenerateUUID() {
        // create an instance of the UUIDGenerator class
        UUIDGenerator generator = new UUIDGenerator();

        // call the generateUUID method and verify that it returns a valid UUID string
        String uuid = generator.generateUUID();
        assertTrue(uuid.matches("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$"));
    }
}

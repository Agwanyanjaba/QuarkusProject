package org.infotech;

import io.quarkus.test.junit.QuarkusTest;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

@QuarkusTest
public class TestReader {
    @Test
    public void testReader() throws FileNotFoundException {
        JSONObject jsonObject = new JSONObject(new FileReader("/Users/wycliffe/DevSpace/product-ticket/src/test/java/org/infotech/testpackage/sanctions.json"));
        System.out.println("Current working directory: " + System.getProperty("user.dir"));

        // Print the file path
        String filePath = "/Users/wycliffe/DevSpace/product-ticket/src/test/java/org/infotech/testpackage/sanctions.json";
        System.out.println("File path: " + filePath);

        // Attempt to read the file
        try {
            FileReader reader = new FileReader(new File(filePath));

            // ...
        } catch (FileNotFoundException e) {
            // ...
        }

        System.out.println(jsonObject);
         //Access the data in the JSON object
        String name = jsonObject.getString("sanctionReasonId");
        int age = jsonObject.getInt("comment");
    }
}

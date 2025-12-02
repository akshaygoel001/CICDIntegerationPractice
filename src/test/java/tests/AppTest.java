package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
    public String environment;
    public String browser;

    @BeforeMethod
    public void setup() {
        // Access parameters
        environment = System.getProperty("environment"); // "staging"
        browser = System.getProperty("browser"); // "chrome"
    }

    @Test
    public void sampleTest() {
        System.out.println("Environment : "+environment+" , Browser : "+browser);
    }
}

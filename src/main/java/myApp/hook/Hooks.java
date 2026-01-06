package myApp.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Hooks {
    public static WebDriver driver;
    Properties prop;


    @Before
    public void setUp() throws IOException {
        // Automatically download and set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        prop.load(fis);

        // 2. Get the URL from the file
//        String appUrl = prop.getProperty("url");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
    @Before(order = 1) // Ensures database reset runs before other setup (like opening browser)
    public void resetDatabase() throws IOException, InterruptedException {
        // Detect OS to use correct command prefix
        String os = System.getProperty("os.name").toLowerCase();
        String command = os.contains("win") ? "cmd /c npm run reset:fresh" : "npm run reset:fresh";

        ProcessBuilder pb = new ProcessBuilder(command.split(" "));
        pb.directory(new File("C:\\Users\\purushottam.dey\\Desktop\\demo\\backend")); // Point to where package.json is
        pb.inheritIO(); // View npm output in your Java console

        Process process = pb.start();
        int exitCode = process.waitFor();

        if (exitCode != 0) {
            throw new RuntimeException("Database reset failed with exit code: " + exitCode);
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Capture the screenshot as bytes
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

                // Attach the screenshot bytes to the Cucumber report
                scenario.attach(screenshot, "image/png", "FailedScenario_" + scenario.getName());
                System.out.println("Screenshot attached to report for failed scenario: " + scenario.getName());

            } catch (Exception e) {
                System.err.println("Failed to capture screenshot: " + e.getMessage());
            }
        }

        if (driver != null) {
            driver.quit();
        }

    }
}

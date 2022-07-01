package vyTrackProject.Project;
import vyTrackProject.utilities.ConfigurationReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import vyTrackProject.utilities.Driver;
public abstract class TestBase {
    @BeforeMethod
    public void setUp() {
        // Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        System.out.println("Test is started");
    }
    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}

package cucumber.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE,
        features = "features",
        glue = "StepsDefinitions",
        tags = {"@Login"})

public class CucumberRunnerTest {

    @BeforeClass
    public static void tearUp() {
    //    DriverFactoryManager.startDriverByMavenParameter(System.getProperty("environment"));
    }

    @AfterClass
    public static void tearDown() {
    //    DriverFactoryManager.quitDriver();
    }
}


package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Backup//Selenium - Workspace//IdeaProjects//CucumberConfig//Features//OrangeHRM.feature",
        glue = "stepDefinitions")





public class TestRunnerClass
{

}

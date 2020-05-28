package stepDefinitions;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstStepClass
{

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser()
    {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
    }
    @When("I launch OrangeHRM Home page")
    public void i_launch_OrangeHRM_Home_page()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    @Then("I verify that the logo present on that page")
    public void i_verify_that_the_logo_present_on_that_page()
    {
       boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);


    }

    @And("close the browser.")
    public void close_the_browser()
    {
        driver.close();


    }
}

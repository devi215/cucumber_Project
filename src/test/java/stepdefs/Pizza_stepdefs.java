package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pizza_stepdefs {
	WebDriver driver = Hooks.driver;
	private CharSequence location;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.pizzahut.co.in");
	}

	@When("I enter the location as {string}")
	public void i_enter_the_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		  WebElement fromlocation=driver.findElement(By.xpath("//input[@role=\"combobox\"]"));
	        fromlocation.sendKeys("Pune");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
	      
      }
         
	@When("I select the very first suggestion from the list")
	public void i_select_the_very_first_suggestion_from_the_list() {
	    // Write code here that turns the phrase above into concrete actions
		  WebElement location= driver.findElement(By.xpath("//input[@role=\"combobox\"]"));
	       
	       location.click();
	       
	       for(int i=0;i<=2;i++) {
	      	 Actions act=new Actions(driver); 
	      	 act.sendKeys(Keys.DOWN).build().perform();
	      	 Actions act1=new Actions(driver); 
	      	 act1.sendKeys(Keys.ENTER).build().perform(); 
	      
	       }      	
	}

	@Then("I should land on the Deals page with page url {string}")
	public void i_should_land_on_the_Deals_page_with_page_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
//		driver.get("https://www.pizzahut.co.in/order/deals/");
	    	}

	@Then("I select the tab as {string}")
	public void i_select_the_tab_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		  WebElement pizzatab=driver.findElement(By.linkText("Pizzas"));
	       pizzatab.click();
	}

	@Then("I add {string} to the basket")
	public void i_add_to_the_basket(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement add=driver.findElement(By.xpath("//span[text()=\"Add\"]"));
		add.click();
	}

	@Then("I note down the price displayed on the screen")
	public void i_note_down_the_price_displayed_on_the_screen() {
	    // Write code here that turns the phrase above into concrete actions
//		WebElement price= driver.findElement(By.xpath("//span[@class=\"w-auto ml-3\"]"));
//		Assert.assertEquals(price.getText(),"249");
	    	}

	@Then("I should see the pizza {string} is added to the cart")
	public void i_should_see_the_pizza_is_added_to_the_cart(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("price is also displayed correctly")
	public void price_is_also_displayed_correctly() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I click on the Checkout button")
	public void i_click_on_the_Checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement checkout=driver.findElement(By.xpath("//span[text()=\"Checkout\"]"));
		checkout.click();
	}

	@Then("I should be landed on the secured checkout page with url {string}")
	public void i_should_be_landed_on_the_secured_checkout_page_with_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    String Expected_title="https://www.pizzahut.co.in/order/checkout/";
	    String actual_title="driver.getTitle()";
	    Assert.assertEquals("Titles match",Expected_title,actual_title);
	}

	

	@Then("I enter the First Name {string}")
	public void i_enter_the_First_Name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement name=driver.findElement(By.xpath("//input[@id=\"checkout__name\"]"));
		name.sendKeys("Rajesh");
	}

	@Then("I enter the Mobile  {string}")
	public void i_enter_the_Mobile(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement mobileno=driver.findElement(By.xpath("//input[@id=\"checkout__phone\"]"));
		 mobileno.sendKeys("9999999999");
	}

	@Then("I enter the email {string}")
	public void i_enter_the_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement email=driver.findElement(By.xpath("//input[@id=\"checkout__email\"]"));
		 email.sendKeys("Rajesh@yopmail.com");
		
	}

}

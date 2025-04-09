package Tests;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.baseclass;
import PAGES.LoginPage;
import PAGES.ProductSearch;
import PAGES.RegistrationPage;

public class login extends baseclass{
	@Test(priority = 1)
    public void testLogin() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("pavanprince7962@gmail.com");
        loginPage.enterPassword("Pavan@132");
        loginPage.clickLoginButton();

        // Assertion for successful login
        Assert.assertTrue(driver.getTitle().contains("My Account"), "Login failed!");
    }
	
	 @Test(priority = 2)
    public void testProductSearch() {
        driver.get("https://tutorialsninja.com/demo/");
        ProductSearch searchPage = new ProductSearch(driver);
        searchPage.enterSearchKeyword("Laptop");
        searchPage.clickSearchButton();
        // Add assertions here
    }
//	
		@Test(priority = 0)
	public void testRegistration() {        
		 driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		    
		    RegistrationPage registrationPage = new RegistrationPage(driver);
		    registrationPage.enterFirstName("Gandla");
		    registrationPage.enterLastName("Pavan");
		    registrationPage.enterEmail("pavanprince7962@gmail.com");
		    registrationPage.enterTelephone("6281172690");
		    registrationPage.enterPassword("Pavan@132");
		    registrationPage.confirmPassword("Pavan@132");
		    registrationPage.clickRegisterButton();
		    // Add assertions here
		
//

}
}

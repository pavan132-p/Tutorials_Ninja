
package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	 WebDriver driver;

	    @FindBy(xpath = "//input[@id='input-firstname']")
	    WebElement firstNameField;

	    @FindBy(xpath = "//input[@id='input-lastname']")
	    WebElement lastNameField;

	    @FindBy(xpath = "//input[@id='input-email']")
	    WebElement emailField;

	    @FindBy(xpath = "//input[@id='input-telephone']")
	    WebElement telephoneField;

	    @FindBy(xpath = "//input[@id='input-password']")
	    WebElement passwordField;

	    @FindBy(xpath = "//input[@id='input-confirm']")
	    WebElement confirmPasswordField;

	    @FindBy(xpath = "//input[@value='Continue']")
	    WebElement registerButton;

	    public RegistrationPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterFirstName(String firstName) {
	        firstNameField.sendKeys(firstName);
	    }

	    public void enterLastName(String lastName) {
	        lastNameField.sendKeys(lastName);
	    }

	    public void enterEmail(String email) {
	        emailField.sendKeys(email);
	    }

	    public void enterTelephone(String telephone) {
	        telephoneField.sendKeys(telephone);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void confirmPassword(String confirmPassword) {
	        confirmPasswordField.sendKeys(confirmPassword);
	    }

	    public void clickRegisterButton() {
	        registerButton.click();
	    }
	}



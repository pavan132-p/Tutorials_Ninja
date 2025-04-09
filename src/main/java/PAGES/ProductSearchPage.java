package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage {
	 WebDriver driver;

	    @FindBy(name = "search")
	    WebElement searchBox;

	    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	    WebElement searchButton;

	    public ProductSearchPage(WebDriver driver) {   
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterSearchKeyword(String keyword) {
	        searchBox.sendKeys(keyword);
	    }

	    public void clickSearchButton() {
	        searchButton.click();
	    }

}

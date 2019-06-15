package com.pageObject;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*import org.openqa.selenium.support.PageFactory;
*/


public class facebook {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Ashish']")
	WebElement profile;
  	
	public facebook(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	
    
    public void navigateToProfile(){
    	
    	WebDriverWait wait = new WebDriverWait(driver,20);
    	
    	WebElement w = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Ashish']")));
    	
    	w.click();
    	
    }
	

}

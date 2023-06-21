package BeCognizant;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class UserDetails extends BaseClass{
	WebDriver driver;
	public UserDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id="mectrl_headerPicture")
	WebElement namelogo;
	public void nameLogo() {
		namelogo.click();
	}
	
	@FindBy(id="mectrl_currentAccount_primary")
	WebElement name;
	
	@FindBy(id="mectrl_currentAccount_secondary")
	WebElement email;
	
	public void info() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("User Informations are: ");
		System.out.println(name.getText());
		System.out.println(email.getText());
	}
	
	@FindBy(xpath="//div[@title='OneCognizant']")
	WebElement onecognizant;
	public void clickOn1C() throws InterruptedException {
		onecognizant.click();
		Thread.sleep(4000);
	}
	
	public void windowHandle() throws InterruptedException {
		Set<String> windowIDs = driver.getWindowHandles();
		for(String handles:windowIDs)
		{
			driver.switchTo().window(handles);
		}
		Thread.sleep(4000);
	}
}

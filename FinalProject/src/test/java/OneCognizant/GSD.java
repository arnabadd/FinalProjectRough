package OneCognizant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Base.BaseClass;

public class GSD extends BaseClass{
	WebDriver driver;
	public GSD(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id="oneC_searchAutoComplete")
	WebElement ele1;
	public void clickOnSearchBar() {
		ele1.sendKeys("gsd");
	}
	
	@FindBy(xpath="//div[@aria-label='Live Support - GSD']")
	WebElement ele2;
	public void clickOnGsd() {
		ele2.click();
	}
	
	@FindBy(className = "Welcome-automated-text")
	WebElement title1;
	public void verifyTitle1() {
		System.out.println(title1.getText());
	}
	
	@FindBy(className = "LiSA-help-text")
	WebElement title2;
	public void verifyTitle2() {
		System.out.println(title2.getText());
	}
	
	@FindBy(css = "button#menu3")
	WebElement language;
	public void selectLanguage() {
		Select select = new Select(language);
		List actualdropdownvalues = new ArrayList();
		for(WebElement element:select.getOptions()) {
			actualdropdownvalues.add(element.getText());
		}
		
		List expecteddropdownvalues = new ArrayList();
		expecteddropdownvalues.add("English");
		expecteddropdownvalues.add("Portuguese");
		
		for(int i=0; i<actualdropdownvalues.size(); i++) {
			Assert.assertTrue(actualdropdownvalues.get(i).equals(expecteddropdownvalues.get(i)));
		}
	}
	
	@FindBy(css = "button#menu4")
	WebElement dropDownCountries;
	
//	public void verifyCountryList() throws InterruptedException {
//		Thread.sleep(2000);
//		Boolean found = false;
//		Select select = new Select(countries);
//		List<WebElement> allOptions = select.getOptions();
//		for(int i=0; i<allOptions.size(); i++) {
//			if(allOptions[i].Equals("")) {
//				found = true;
//				break;
//			}
//		}
//		if(found) {
//			System.out.println("Country names exists");
//		}
//	}
	
	@FindBy(xpath="//*[@id='hamBarCollapseContainer']/div/div/div[2]/ul/li")
	List<WebElement> list;
//	WebElement list;
	
	public void countrySelect1() throws InterruptedException {
		
		Select select = new Select(dropDownCountries);
//		list = select.getOptions();
//		int count = list.size();
//		Random num = new Random();
//		int a = num.nextInt(count);
		
		int dropDownValuesCount = list.size();
		Random random = new Random();
		int index = random.nextInt(dropDownValuesCount);
		select.selectByIndex(index);
		
		Thread.sleep(6000);
		//Selecting value from drop-down menu
//		select.selectByIndex(a);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@role='link']"));
		for(int i=2; i<list1.size(); i++) {
			System.out.println(list1.get(i).getText());
		}
	}
	
	
	
	public void countrySelect2() throws InterruptedException {
		
		Select select = new Select(dropDownCountries);
//		list = select.getOptions();
//		int count = list.size();
//		Random num = new Random();
//		int a = num.nextInt(count);
		
		//Selecting value from drop-down menu
//		select.selectByIndex(a);
		
		int dropDownValuesCount = list.size();
		Random random = new Random();
		int index = random.nextInt(dropDownValuesCount);
		select.selectByIndex(index);
		
		Thread.sleep(6000);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@role='link']"));
		for(int i=2; i<list1.size(); i++) {
			System.out.println(list1.get(i).getText());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy(xpath="//div[@role='link']")
//	List<WebElement> list;
//	public void listItems() {
//		for(int i=2; i<list.size(); i++) {
//			WebElement e = list.get(i);
//			System.out.println(e.getText());
//		}
//	}
	
}

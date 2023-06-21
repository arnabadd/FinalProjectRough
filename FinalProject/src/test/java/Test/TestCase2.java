package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseClass;
import OneCognizant.GSD;

public class TestCase2 extends BaseClass{
	WebDriver driver;
	GSD gsd;
	
	@BeforeClass
	public void initialize() {
		gsd = new GSD(driver);
	}
	
	@Test(priority=0)
	public void test1() {
		gsd.clickOnSearchBar();
	}
	
	@Test(priority=0)
	public void test2() {
		gsd.clickOnGsd();
	}
	
	@Test(priority=1)
	public void test3() {
		gsd.verifyTitle1();
	}
	
	@Test(priority=2)
	public void test4() {
		gsd.verifyTitle2();
	}
	
	@Test(priority=3)
	public void test5() {
		gsd.selectLanguage();
	}
	
	@Test(priority=4)
	public void test6() throws InterruptedException{
		gsd.countrySelect1();
	}
	
	@Test(priority=5)
	public void test7() throws InterruptedException{
		gsd.countrySelect2();
	}
}

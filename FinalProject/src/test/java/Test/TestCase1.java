package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseClass;
import BeCognizant.UserDetails;

public class TestCase1 extends BaseClass{
	WebDriver driver;
	UserDetails ud;
	@BeforeClass
	public void initialize() {
		ud = new UserDetails(driver);
	}
	
	@Test(priority=0)
	public void test1() {
		ud.nameLogo();
	}
	
	@Test(priority=1)
	public void test2() throws InterruptedException{
		ud.info();
	}
	
	@Test(priority=2)
	public void test3() throws InterruptedException{
		ud.clickOn1C();
	}
	
	@Test(priority=3)
	public void test4() throws InterruptedException{
		ud.windowHandle();
	}
	
}

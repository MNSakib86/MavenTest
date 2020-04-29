package GTPLBank.MavenTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Resources.Base;


public class LoginPageTest extends Base {
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider = "getTestData")
	public void LoginTest(String userName, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.getuserID().clear();
		lp.getuserID().sendKeys(userName);
		lp.getpassword().clear();
		lp.getpassword().sendKeys(password);
		lp.getLogin().click();
		
}

	@AfterMethod
	public void tearDown() {
		driver.quit();
}
}
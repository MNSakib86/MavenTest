package GTPLBank.MavenTest;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import Resources.Base;

public class ValidTitleTest extends Base {

	@Test
	public void basePageTitle() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
HomePage home = new HomePage(driver);
AssertJUnit.assertEquals(home.getTitle().getText(), "Gtpl Bank");
System.out.println(home.getTitle().getText());
	}
	@AfterMethod

	public void teardown() {
		driver.quit();
		driver= null;
	}
	
	
}

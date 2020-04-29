package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By userId = By.xpath("//input[@type='text']");
	By password = By.xpath("//input[@type='password']");
	By login = By.name("btnLogin");
	By reset = By.name("btnReset");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getuserID() {
		return driver.findElement(userId);
	}

	public WebElement getpassword() {
		return driver.findElement(password);

	}

	public WebElement getLogin() {
		return driver.findElement(login);

	}

	public WebElement getReset() {
		return driver.findElement(reset);
	}
}

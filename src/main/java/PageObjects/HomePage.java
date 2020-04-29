package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By title = By.xpath("//h2[@class = 'barone']");
	By manager = By.xpath("//a[text()='Manager']");
	By newCustomer = By.xpath("//a[text() = 'New Customer']");
	By editCustomer = By.xpath("//a[text()='Edit Customer']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}
}
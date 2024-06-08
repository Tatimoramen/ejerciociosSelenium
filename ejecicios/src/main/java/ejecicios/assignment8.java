package ejecicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		WebElement autocompleteField = driver.findElement(By.id("autocomplete"));
		autocompleteField.sendKeys("ind");
		Thread.sleep(2000);
		autocompleteField.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);

		System.out.println(autocompleteField.getAttribute("value"));

		driver.quit();
	}
}

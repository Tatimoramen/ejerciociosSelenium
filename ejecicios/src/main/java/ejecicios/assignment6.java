package ejecicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input"));
		checkbox.click();

		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropdown);
		select.selectByVisibleText(opt);

		driver.findElement(By.name("enter-name")).sendKeys(opt);

		driver.findElement(By.id("alertbtn")).click();

		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(opt)) {
			System.out.println("Mensaje de alerta correcto");
		} else {
			System.out.println("Algo salió mal durante la ejecución");
		}

		driver.quit();
	}
}

package ejecicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		WebElement table = driver.findElement(By.id("product"));

		System.out.println("Número de lineas en tabla: " + table.findElements(By.tagName("tr")).size());

		WebElement firstRow = table.findElements(By.tagName("tr")).get(0);
		System.out.println("Número de columnas en primera linea: " + firstRow.findElements(By.tagName("th")).size());

		WebElement secondRow = table.findElements(By.tagName("tr")).get(2);
		System.out.println("valores que contenga en segunda linea:");
		System.out.println(secondRow.findElements(By.tagName("td")).get(0).getText());
		System.out.println(secondRow.findElements(By.tagName("td")).get(1).getText());
		System.out.println(secondRow.findElements(By.tagName("td")).get(2).getText());

		driver.quit();
	}
}

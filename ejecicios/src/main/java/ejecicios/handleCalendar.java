package ejecicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class handleCalendar {

	public static void main(String[] args) {

		// Definir la fecha esperada
		String monthNumber = "6";
		String date = "15";
		String year = "2027";
		String[] expectedList = { monthNumber, date, year };

		// Iniciar el navegador Chrome
		WebDriver driver = new ChromeDriver();

		// Abrir la página
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Seleccionar la fecha en el calendario
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(monthNumber) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

		// Obtener la fecha seleccionada
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		String actualMonth = actualList.get(0).getAttribute("value");
		String actualDate = actualList.get(1).getAttribute("value");
		String actualYear = actualList.get(2).getAttribute("value");
		// Comparar la fecha seleccionada con la esperada
		if (actualMonth.equals(expectedList[0]) && actualDate.equals(expectedList[1])
				&& actualYear.equals(expectedList[2])) {
			System.out.println("Las fechas coinciden correctamente.");
		} else {
			System.out.println("Las fechas no coinciden.");
		}
		// Cerrar el navegador
		driver.quit();
	}
}

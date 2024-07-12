package Seleniumpro.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnuDropDown {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		WebElement d=driver.findElement(By.linkText("Tutorials"));
		d.click();
		WebElement course=driver.findElement(By.linkText("Java"));
		course.click();
	}

}

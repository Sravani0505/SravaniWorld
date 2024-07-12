package Seleniumpro.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.linkText("Solutions")).click();
		driver.findElement(By.xpath("//body[@class='HomePage no-sidebar']")).click();
				

	}

}

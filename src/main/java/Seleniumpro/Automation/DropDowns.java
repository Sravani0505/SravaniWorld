package Seleniumpro.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class DropDowns{

    public static void main( String[] args )
    {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D9062132%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=CjwKCAjwnK60BhA9EiwAmpHZw46n9Od8y9i_NPLIpsCO-SJKIAYvKQlX0pIiwDahTW3NsF1Ok-0CRhoCyuUQAvD_BwE");
        driver.findElement(By.name("firstname")).sendKeys("sravani");
        driver.findElement(By.name("lastname")).sendKeys("kurra");
        driver.findElement(By.name("reg_email__")).sendKeys("7032270768"); 
        driver.findElement(By.name("reg_passwd__")).sendKeys("Shankar@123");
        WebElement day=driver.findElement(By.name("birthday_day"));
        Select d=new Select(day);
        d.selectByValue("30");
        WebElement month=driver.findElement(By.name("birthday_month"));
        Select m=new Select(month);
        m.selectByVisibleText("Dec");
        WebElement year=driver.findElement(By.name("birthday_year"));
        Select y=new Select(year);
        y.selectByIndex(10);
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.name("websubmit")).submit();
        driver.quit();
        
    }
}

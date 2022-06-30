package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\shshrikh\\Desktop\\selenium\\selenium jars\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	        String baseUrl = "http://automationpractice.com/index.php";
	        driver.get(baseUrl);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       
	        String Title=driver.getTitle();
	        System.out.println("The title of the page is "+Title);
	      
	        String url=driver.getCurrentUrl();
	        System.out.println("The URL of the page is "+url);

	        driver.findElement(By.className("login")).click();
	        driver.findElement(By.id("email_create")).sendKeys("ssshruti667@gmail.com");
	        driver.findElement(By.id("SubmitCreate")).click();
	        WebElement radioM = driver.findElement(By.id("id_gender1"));                           
           WebElement radioF = driver.findElement(By.id("id_gender2"));   
          
           radioM.click();
           
           driver.findElement(By.id("customer_firstname")).sendKeys("shruti");
           driver.findElement(By.id("customer_lastname")).sendKeys("shrikhande");
           driver.findElement(By.id("passwd")).sendKeys("S12345");
           Select day= new Select(driver.findElement(By.name("days")));
	        day.selectByValue("12");
	        
	        Select mnth= new Select(driver.findElement(By.name("months")));
	        mnth.selectByIndex(4);
	        
	        Select year= new Select(driver.findElement(By.name("years")));
	        year.selectByValue("1997");
	        
	        WebElement check1 = driver.findElement(By.id("newsletter"));   
           check1.click();
           
           driver.findElement(By.id("firstname")).sendKeys("shruti");
           driver.findElement(By.id("lastname")).sendKeys("shrikhande");
           driver.findElement(By.id("company")).sendKeys("capge");
           driver.findElement(By.name("address1")).sendKeys("45-68,kkt,dmm");
           driver.findElement(By.name("city")).sendKeys("Dmm");
           Select state= new Select(driver.findElement(By.name("id_state")));
	        state.selectByIndex(4);
	        driver.findElement(By.name("postcode")).sendKeys("54672");
	        
	        Select country= new Select(driver.findElement(By.name("id_country")));
	        country.selectByVisibleText("United States");
	        
	        driver.findElement(By.name("phone_mobile")).sendKeys("8157902040");
	        driver.findElement(By.name("alias")).sendKeys("45-87,kota,atp");
	        driver.findElement(By.name("submitAccount")).click();
	       driver.close();
	        
	
	}
	
	
	
	

}

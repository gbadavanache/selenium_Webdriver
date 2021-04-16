package amazon_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchAmazon {
	 public static void main(String[] args) throws InterruptedException
     {
		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\GBadavanache\\Desktop\\chromedriver_win32.zip\\chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
         WebDriver driver= new FirefoxDriver();  
		// WebDriver driver= new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
          driver.findElement(By.id("ap_email")).sendKeys("gayatribadavanache13@gmail.com");
          driver.findElement(By.id("continue")).click();
          driver.findElement(By.id("ap_password")).sendKeys("abcgttp@com");
          driver.findElement(By.id("signInSubmit")).click(); 
          String actual_title = driver.getTitle();
          String expected_title = "Amazon Sign In"; 
          //driver.close();
          if(actual_title.equalsIgnoreCase(expected_title)) {
        	  System.out.println("Expected Title matched : Test Successful");
          }
          else {
        	  System.out.println("Expected Title didn't  match : Test Failed");
          }
        
          //Radio Button
          driver.get("http://demo.guru99.com/test/radio.html");
          WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
          radio3.click();
          
          //Checkbox
          WebElement checkbox2 = driver.findElement(By.cssSelector("input[value=\"checkbox2\"]"));
          checkbox2.click();
          //System.out.println("Return True if checkbox is selected: " +checkbox2.isSelected());
     
          if (checkbox2.isSelected()) {					
              System.out.println("Checkbox is Toggled On");					

          } else {			
              System.out.println("Checkbox is Toggled Off");					
          }		
           
     }

}

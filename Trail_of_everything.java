package trail_LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trail_of_everything {
	 public static void main(String[] args) throws InterruptedException
     {
		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\GBadavanache\\Desktop\\chromedriver_win32.zip\\chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\GBadavanache\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
         WebDriver driver= new FirefoxDriver();  
		// WebDriver driver= new ChromeDriver();
          driver.manage().window().maximize();
          //driver.get("https://www.facebook.com");
          String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
          driver.get(baseUrl);
          //click on the "Facebook" logo on the upper left portion		
		driver.findElement(By.cssSelector("svg[class=\"eltiug27 a8c37x1j\"]")).click();
          WebElement objUN = driver.findElement(By.id("email"));
         objUN.sendKeys("7406821194");
          WebElement objPWD = driver.findElement(By.id("pass"));
         objPWD.sendKeys("march@16.com");
          Thread.sleep(2000);
          WebElement objLogin = driver.findElement(By.name("login"));
          //objLogin.click(); 
         // driver.close();
          
         //Check if Login button is present instead of "if stmt"
         try
         {
           objLogin.isDisplayed();
           System.out.println("Login button has displayed");
           objLogin.click();
         }
         catch (Exception e)
         {
           System.out.println("Login button did not displayed");
         } 
         
          
     }
	 	
}

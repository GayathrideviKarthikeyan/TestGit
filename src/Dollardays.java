import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dollardays  {
	
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","D:\\TESTING\\Downloads\\Selenium\\geckodriver-v0.27.0-win64\\geckodriver.exe");
    	
    	WebDriver Dollardays = new FirefoxDriver(); //Opens FF browser
    	          
    	Dollardays.get("https://www.dollardays.com/"); // Enter dollardays.com
    	
    	// String tagName = Dollardays.findElement(By.sp).getTagName();
    	 
    	// String tagName = Dollardays.findElement(By.xpath("/html/body/form/header/div/div/div/div[3]/div/ul/li[1]/a/span")).click();//
        
    
}
}

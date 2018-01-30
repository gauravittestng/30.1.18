package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bnbin777\\Desktop\\64 bit\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.jindalsteelpower.com/careers/careers.");
	    Alert t1 = driver.switchTo().alert();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector(".fancybox-item")).click();
		t1.dismiss();
	
		
	}

}

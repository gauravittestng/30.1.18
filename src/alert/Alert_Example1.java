package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\bnbin777\\Desktop\\64 bit\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.cssSelector(".btn-danger")).click();
		Thread.sleep(5000);
		Alert t1 = driver.switchTo().alert();
		String alert = t1.getText();
		System.out.println(alert);
		t1.accept();
		
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement ducat1 = driver.findElement(By.cssSelector("ul.nav-tabs > li:nth-child(2) > a:nth-child(1)"));
		ducat1.click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		Alert alrtbox = driver.switchTo().alert();
		String text = alrtbox.getText();
		System.out.println(text);
		alrtbox.accept();*/
		
		
	
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement ducat10 = driver.findElement(By.cssSelector("ul.nav-tabs > li:nth-child(3) > a:nth-child(1)"));
		ducat10.click();
		driver.findElement(By.cssSelector(".btn-info")).click();
		Alert alrttextbox = driver.switchTo().alert();
		String prnnt = alrttextbox.getText();
		System.out.println(prnnt);
		alrttextbox.accept();
		String texxt = driver.findElement(By.cssSelector("#demo1")).getText();
		System.out.println(texxt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bnbin777\\Desktop\\64 bit\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.cssSelector("div.gb_Q:nth-child(1) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("bnbin777@gmail.com");;
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/div/div[1]/input")).sendKeys("123455");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[2]/div[1]/div/div[2]")).click();
	}

}

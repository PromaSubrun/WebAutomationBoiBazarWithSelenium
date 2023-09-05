package BoiBazar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T11_SelectByBookAndSearchIT extends DriverSetup{
public static String url="https://www.boibazar.com/";
	
	@Test
	public static void BoiBazar() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("ম্যাসেজ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/li[1]/a[1]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(1000);
		
	

}

}

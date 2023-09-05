package BoiBazar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T12_SelectByLekhok extends DriverSetup{
public static String url="https://www.boibazar.com/";
	
	@Test
	public static void BoiBazar() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("মুহম্মদ জাফর ইকবাল");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/span[1]")).click();
		Thread.sleep(1000);
	

}
}

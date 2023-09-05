package BoiBazar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T06_EktuPoreDekhun extends DriverSetup{
public static String url="https://www.boibazar.com/";
	
	@Test
	public static void BoiBazar() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@id='content']/nav[@class='navbar navbar-default navbar-fixed-top navbar-custom']/div[@class='container-fluid']/div[@id='bs-example-navbar-collapse-1']/div[@class='container']/div[@class='row']/div[@class='col-md-12 logo-scroll']/div[@class='row']/div[@class='col-md-12']/ul[@class='nav navbar-nav home-menu-ul']/li[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'হুমায়ূন আহমেদ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='internal_search']")).sendKeys("মিসির আলি");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-sm-12']//i[@class='fa fa-search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='মিসির আলি আনসলভ্‌ড']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='cart-zoom read-more-img lookInsideOpen']")).click();
		Thread.sleep(1000);
	}	
}

package BoiBazar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T02_SelectBishoy extends BoiBazar.DriverSetup{

public static String url="https://www.boibazar.com/";
	
	@Test(priority=1)
	public static void BoiBazar() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(9000);
		//02start
		
	//driver.switchTo.frame(0);
		
		//to select the list		
		driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(9000);
		
		
		//to select Bisoy from the list
		//driver.findElement(By.xpath("//li[@class='categoryIDs']//span[contains(text(),'বিষয়')]")).click();
		//Thread.sleep(3000);
		
		//driver.switchTo().defaultContent();
	}
	
}



//driver.switchTo().frame("iframeResult");
//Select s = new Select(e);
//Thred.sleep(3000);
//s.selectByIndex(1);
//Thred.sleep(3000);
//othoba deselectAll();
//deselectByValue()
//deselectByVisibleText();
//geTAllSelectedOptions()
//driver.switchTo().defaultContent();




//driver.switchTo().frame("iframeResult");
//WebElement e = driver.findElement(By.name("cars"));
//Select s = new Select(e);

//Actions a = new Actions(driver);
//a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build().perform();
//Thread.sleep(3000);
//driver.switchTo().defaultContent();





//driver.navigate().to("http://www.google.com");
//Thread.sleep(3000);
//driver.navigate().back();
//Thread.sleep(3000);
//driver.navigate().forward();
//Thread.sleep(3000);
//driver.navigate().refresh();







//JavascriptExecutor js =(JavascriptExecutor)driver; 
//js.executeScript("window.scrollTo(0,document.body.scrollHight);");"
//js.executeScript("window.scrollTo(document.body.scrollHight,0);");"
//WebElement e=driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
//Thread.sleep(9000);
//js.executeScript("arguments[0].scrollIntoView();",e);





//driver.switchTo().frame("iframeResult");

//Actions a = new Actions(driver);
//WevElement doubleClickTxt = driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
//a.doubleClick(doubleClickText).build().perform();
//Thread.sleep(3000);
//WevElement rightClick = driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
//a.contextClick(rightClick).build().perform();
//Thread.sleep(3000);
//driver.switchTo().defaultContent();






//driver.switchTo().frame(0);
//WebElement e1 = driver.findElement(By.id("draggable");
//WebElement e2 = driver.findElement(By.id("drappable");
//Actions a = new Actions(driver);
//a.dragAndDrop(e1, e2).build().perform();
//Thread.sleep(3000);
//driver.switchTo().defaultContent();




//driver.switchTo().frame(0);
//WebElement e = driver.findElement(By.name("cars"));
//Actions a = new Actions(driver);
//a.dragAndDropBy(e, 300, 0).build().perform();
//Thread.sleep(3000);

//a.dragAndDropBy(e, -200, 0).build().perform();
//Thread.sleep(3000);

//driver.switchTo().defaultContent();
//driver.findElement(By.LinkText("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
//Thread.sleep(3000);

//driver.switchTo().frame(0);
//WebElement e1 = driver.findElement(By.name("cars"));
//Actions a = new Actions(driver);
//a.dragAndDropBy(e1, 0, 100).build().perform();
//Thread.sleep(3000);

//a.dragAndDropBy(e, 0, -200).build().perform();
//Thread.sleep(3000);
//driver.switchTo().defaultContent();









//WebElement b=driver.findElement(By.name("iframeResult");
//driver.switchTo().frame(b);
//driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
//Thread.sleep(3000);
//driver.switchTo().alert().dismiss();
//Thread.sleep(3000);







//Tagname[@Attribute='Value']
//a[@id='all-shops}
//*[Attribute='Value']
//*[@id='All-shops']

//



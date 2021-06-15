package Kurtosys.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainclass {
	
public static WebDriver driver;
	
	public static void initialization() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromedriver.exe"); // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		
		driver= new ChromeDriver();
		driver.get("https://www.kurtosys.com/");
		driver.findElement(By.xpath("//*[contains(@class, ‘elementor-button-text')]")).click();
		driver.findElement(By.xpath("//*[contains(@href,'https://www.kurtosys.com/resources/white-papers-ebooks/')]")).click();
		driver.findElement(By.xpath("https://www.kurtosys.com/white-papers/esg-distribution-study-2020/")).click();
		driver.findElement(By.id("18882_234474pi_18882_234474")).sendKeys("pavan");		
		driver.findElement(By.id("18882_234476pi_18882_234476")).sendKeys("kumar");
		driver.findElement(By.id("18882_234478pi_18882_234478")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("18882_234480pi_18882_234480")).sendKeys("new company ");
		driver.findElement(By.id("18882_234482pi_18882_234482")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']")).click();
		
		
		

		
		}
		
		
		
		
		
	
	
	
	public void failed(String testMethodName) throws IOException
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/"+testMethodName+"_"+".jpg")); // or E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/testfailure.jpg"
		
		
			}

}

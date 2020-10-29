package org.learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitProblem {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path+ "\\drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("https://easemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement source = driver.findElement(By.id("FromSector_show"));
		source.clear();
		source.sendKeys("Bangalore(BLR)", Keys.ENTER);
		WebElement destination = driver.findElementById("Editbox13_show");
		destination.clear();
		destination.sendKeys("Chennai", Keys.ENTER);
		WebElement calendarbtn = driver.findElementById("ddate");
		calendarbtn.click();
		WebElement date = driver.findElementById("fiv_0_25/10/2020");
		date.click();
		WebElement searchbtn = driver.findElementByClassName("src_btn");
		searchbtn.click();
		WebElement booknow = driver.findElementByXPath("//button[text()='Book Now']");
		booknow.click();
		
		
	}

}

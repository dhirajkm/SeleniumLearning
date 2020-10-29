package org.learning.selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://easemytrip.com");
		driver.manage().window().maximize();

		WebElement source = driver.findElement(By.id("FromSector_show"));
		source.clear();
		source.sendKeys("Bangalore", Keys.ENTER);
		WebElement destination = driver.findElementById("Editbox13_show");
		destination.clear();
		destination.sendKeys("Chennai", Keys.ENTER);
		WebElement calendarbtn = driver.findElementById("ddate");
		calendarbtn.click();
		WebElement date = driver.findElementById("fiv_4_29/10/2020");
		date.click();
		WebElement searchbtn = driver.findElementByClassName("src_btn");
		searchbtn.click();
		//Wait<ChromeDriver> wait = new FluentWait <ChromeDriver>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofSeconds(1)).withMessage("Waited and element not found").ignoring(NoSuchElementException.class);
		//WebElement booknow = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Book Now']")));
		//booknow.click();

	}

}

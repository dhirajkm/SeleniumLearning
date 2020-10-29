package org.learning.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path+ "\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		
		// for entering inside a frame and clicking an object
		driver.switchTo().frame("iframeResult");
		WebElement clickbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		clickbtn.click();
		
		//driver.switchTo().frame(1);
		
		//for clicking on the home page
		driver.switchTo().defaultContent();
//		WebElement homepage = driver.findElement(By.id("tryhome"));
//		homepage.click();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
	
		for (WebElement f : frames) {
			System.out.println("id of the frame"+f.getAttribute("id")+"name of the frame"+f.getAttribute("name"));
		}
	}

	
}

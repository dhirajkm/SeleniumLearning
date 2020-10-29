package org.learning.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FooterLinks {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path+ "\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		// to find links of the entire page
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//WebElement footer = driver.findElementByClassName ("footer");
		WebElement footer = driver.findElement(By.className("footer"));
		List<WebElement> links = footer.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// to find href links using for loop
		for (WebElement e : links) {
			System.out.println("href value is"+ e.getAttribute("href"));
		}
		
		
		
		

	}

}

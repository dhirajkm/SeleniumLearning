package org.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDemo {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		//driver = new FirefoxDriver ();
		driver.get("http:\\wikipedia.org");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("searchInput"));
		element.sendKeys("Nepal");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.close();
		
	}

}

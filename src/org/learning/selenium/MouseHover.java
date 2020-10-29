package org.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http:\\guru99.com");
		driver.manage().window().maximize();
		WebElement testing = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[2]/div/span[1]/span"));
		
		Actions act = new Actions (driver);
		act.moveToElement(testing).perform();
		
		
		
		
	}

}

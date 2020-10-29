package org.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("maharjan.dhiraj");
		email.sendKeys(Keys.ENTER);
		WebElement pwd = driver.findElementByName("password");
		pwd.sendKeys("abc");
		pwd.sendKeys(Keys.ENTER);
		
	}

}

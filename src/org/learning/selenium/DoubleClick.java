package org.learning.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		System.setProperty("webdriver.gecko.driver", path+ "\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement testDoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions (driver);
		act.doubleClick(testDoubleClick).perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
	}

}

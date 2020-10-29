package org.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path+ "\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		
		WebElement bar = driver.findElement(By.id("slider"));
		int width = bar.getSize().width/2;
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, width, 0).perform();
		
			
	}

}

package org.learning.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions (driver);
		act.dragAndDrop(source, target).perform();
			
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println("Drag and drop is done");
	

	}

}

package org.learning.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		driver.manage().window().maximize();
		
		WebElement tryitbtn = driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		tryitbtn.click();
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println(tabs.size());
		
		Iterator<String> itr = tabs.iterator();
		String firsttab = itr.next();
		System.out.println("window id of first tab"+firsttab);
		String secondtab = itr.next();
		System.out.println("window id of second tab"+secondtab);
		
		driver.switchTo().window(secondtab);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame("iframeResult");
		WebElement frame = driver.findElement(By.cssSelector("iframe[title='W3Schools Free Online Web Tutorials']"));
		driver.switchTo().frame(frame);
		
		WebElement clicksearch = driver.findElement(By.cssSelector("a[title='Search W3Schools']"));
		clicksearch.click();

	}

}

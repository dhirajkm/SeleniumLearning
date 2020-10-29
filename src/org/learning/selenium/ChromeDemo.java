package org.learning.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\qa_workspace\\seleniumDemo\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http:\\mandalasystem.com.np");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}

}

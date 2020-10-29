package org.learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		
		WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver = new EdgeDriver();
		
				
		String webBrowser = "chrome";
		
		if(webBrowser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		}else if (webBrowser.equalsIgnoreCase("gecko")){
			System.setProperty("webdriver.gecko.driver", path+ "\\drivers\\geckodriver.exe");
			} else {
				System.setProperty("webdriver.edge.driver", path+ "\\drivers\\msedgedriver.exe");
			}
		driver.get("http:\\wikipedia.org");
		driver.manage().window().maximize();
		
		}
		
	}




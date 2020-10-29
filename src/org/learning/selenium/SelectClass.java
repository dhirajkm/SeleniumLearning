package org.learning.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectClass {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://wikipedia.org");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		Select sel = new Select(dropdown);
		
//		List <WebElement> list= sel.getOptions();
		
		//List<WebElement> list = driver.findElements(By.tagName("select"));
		List<WebElement> list = driver.findElements(By.tagName("option"));
		
		
		List <String> ddvalues = new ArrayList<String>();
		
		for (WebElement ele : list) {
			ddvalues.add(ele.getText());
			
		}
		
		System.out.println(ddvalues);

		//sel.selectByIndex(5);
		//sel.selectByValue("fr");
		sel.selectByVisibleText("Deutsch");
		//sel.getAllSelectedOptions();
		
		
	}

}

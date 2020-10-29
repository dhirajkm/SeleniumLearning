package org.learning.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {

	public static void main(String[] args) {
		
	String path = System.getProperty("user.dir");
	System.out.println(path);
	
	System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
	driver.get("https://jqueryui.com/selectmenu/");
	driver.manage().window().maximize();
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"number-button\"]/span[2]"));
	
	Select sel = new Select (dropdown);
	
	List<WebElement> list = sel.getOptions();
	List<String> ddValues= new ArrayList <String> ();
	
	for (WebElement ele: list) {
		ddValues.add(ele.getText());
	}
	
	System.out.println(ddValues);
	
	sel.selectByIndex(5);

	}

}

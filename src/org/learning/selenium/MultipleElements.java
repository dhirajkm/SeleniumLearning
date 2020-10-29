package org.learning.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		
		//WebElement frame = driver.findElement(By.className("display"));
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'][@name='sports']"));
		//checkboxes.get(0).click();
		
		for (WebElement ele : checkboxes) {
			//System.out.println(ele.isSelected());
			if(!ele.isSelected()) { //true--->false false--->true
			ele.click();
			}
			System.out.println(ele.isEnabled());
			System.out.println(ele.isDisplayed());
			System.out.println(ele.getAttribute("value"));
		}
		
			}

}

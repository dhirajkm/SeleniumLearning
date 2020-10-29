package org.learning.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path+ "\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://money.rediff.com/gainers/bse/groupa");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> header = table.findElements(By.tagName("th"));
		
		for (WebElement e : header) {
			System.out.println(e.getTagName());
			System.out.println(e.getText());
			System.out.println(e.getSize()); //dimension of header
			
		}
		
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("rows in table is "+rows.size());  //number of rows
		
//		for(int i=1; i<=rows.size(); i++) {
//			System.out.println("text of the row "+i+" "+rows.get(i-1).getText());
//		}
//		
//		List<WebElement> tdata = table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
//		
//		for (int i = 1; i<=tdata.size(); i++) {
//			System.out.println("data "+i+" "+tdata.get(i-1).getText());
//		}
		
		for (int i = 1; i<=rows.size(); i++) {
			for (int j = 1; j<=header.size(); j++) {
				WebElement ele =driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println("row "+(i)+" column "+(j)+" "+ele.getText());
			}
		}
		

	}

}

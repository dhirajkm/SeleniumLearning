package org.learning.selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+ "\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		driver.manage().window().maximize();
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat ("dd-MMM-YYYY:mm:ss");
		String time = sdf.format(d).replace(":", "_");
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshots/myscreenshot"+time+".png"));
				
	}

}


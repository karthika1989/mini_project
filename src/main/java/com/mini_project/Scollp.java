package com.mini_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scollp {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kumara\\eclipse\\Sele\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js.executeScript("window.scroll(0,-2000)", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.snapdeal.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sou = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Kumara\\eclipse\\Sele\\screenshot\\error2.png");
		FileUtils.copyFile(sou, des);
		
		
	}

}

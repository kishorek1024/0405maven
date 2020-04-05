package com.qshore.QshoreTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Qshore_Methods {
	
	public void launchApp(String url){		
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}

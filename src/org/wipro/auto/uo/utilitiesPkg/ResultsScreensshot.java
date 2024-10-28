package org.wipro.auto.uo.utilitiesPkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ResultsScreensshot 
{

	
	public static void capturescreen(WebDriver driver, String name) throws Exception
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;  //take screenshot (PRT SC)
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./ResultFolder/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}

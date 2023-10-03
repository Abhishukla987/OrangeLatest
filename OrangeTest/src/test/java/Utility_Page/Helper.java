package Utility_Page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
		public static String captureScreensho(WebDriver driver) 
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String screenshotpath=System.getProperty("user.dir")+ "./Screenshorts/Orange" + Helper.getCurrentDataTime()+ ".png";
			
			try {
				FileHandler.copy(src, new File(screenshotpath));
				System.out.println("Screenshort captured");
				
			} 
			catch (IOException e)
			{
				System.out.println("Unable to capture screenshort" +e.getMessage());
				
			}
			return screenshotpath;
		}
		public static String getCurrentDataTime()
		{
			SimpleDateFormat CustomFormat =new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			Date currentDate = new Date();
			return CustomFormat.format(currentDate);
		}
	

}

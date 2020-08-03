package practice.ecoomerceAutomation.Utils;

import java.io.File;
import java.io.IOException;
//import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseActionClass extends BaseTest {

	public void saveScreenshots() throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File("C:\\Users\\shuva\\Downloads\\ecoomerceAutomation\\test-output\\Screenshots");

		FileUtils.copyFile(SrcFile, DestFile);

	}

	public void switchtoframe() {

		// Set<String> allHandles = driver.getWindowHandles();

		//driver.switchTo()).popup();
	}
}
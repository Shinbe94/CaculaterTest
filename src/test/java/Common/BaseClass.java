package Common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
	protected AppiumDriver<MobileElement> driver;
	protected ExtentHtmlReporter htmlReporter;
	protected ExtentReports extent;

	@BeforeSuite
	public void reportSetup() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter); 
	}

	@BeforeTest
	public void setup() {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Nexus5");
			cap.setCapability("uid", "emulator-5554");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "8.1.0");
			cap.setCapability("appPackage", "com.android.calculator2");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void tearDown() {
		driver.closeApp();
		extent.flush();
	}
}

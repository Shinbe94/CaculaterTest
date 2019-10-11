package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Common.BaseClass;
import io.appium.java_client.MobileElement;

public class Calculation extends BaseClass {

	// Test phép cộng: 2 + 3 = 5
	@Test
	public void testOne() {
		// tạo một toggle cho test case, liệt kê tất cả nhật ký ghi được dưới nó.  
        ExtentTest testOne = extent.createTest("MyFirstTest", "Sample description");
        
		MobileElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		two.click();
		testOne.log(Status.PASS, "Click two number");
		
		MobileElement plus = driver.findElementByAccessibilityId("plus");
		plus.click();
		testOne.log(Status.PASS, "Click plus button");
		
		MobileElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		three.click();
		testOne.log(Status.PASS, "Click three number");
		
		MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
		equals.click();
		testOne.log(Status.PASS, "Click equals button");
		
		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
		System.out.println("Result testOne: " + result.getText());
		testOne.log(Status.INFO, "Test one completed");
	}

	// Test phép nhân: 5 * 2 = 10
	public void testTwo() {
		MobileElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
		five.click();
		MobileElement multiply = driver.findElementByAccessibilityId("multiply");
		multiply.click();
		MobileElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		two.click();
		MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
		equals.click();
		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
		System.out.println("Result testTwo: " + result.getText());
	}
}

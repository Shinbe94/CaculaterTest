package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common.BaseClass;
import io.appium.java_client.MobileElement;

public class Calculation extends BaseClass {

	//Test plus: 2 + 3 = 5
	@Test
	public void testOne() {
		MobileElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		two.click();
		
		MobileElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		plus.click();
		MobileElement three = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
		three.click();
		MobileElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		equals.click();
		MobileElement result = driver.findElement(By.id("com.google.android.calculator:id/formula"));
		System.out.println("Result testOne: " + result.getText());
	}

	//Test multiply: 5 * 2 = 10
	@Test
	public void testTwo() {
		MobileElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		five.click();
		MobileElement multiply = driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
		multiply.click();
		MobileElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		two.click();
		MobileElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		equals.click();
		MobileElement result = driver.findElement(By.id("com.google.android.calculator:id/formula"));
		System.out.println("Result testTwo: " + result.getText());
	}
}

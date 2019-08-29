package com.atmecs.booikng.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.booking.constants.Login_Property_Read;
import com.atmecs.booking.testbase.DriverSetup;

public class LoginPageTest extends DriverSetup {
	Login_Property_Read login_read = new Login_Property_Read();

	@Test
	public void loginPageTest() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		WebElement login_username = (driver.findElement(By.name(login_read.getLocater("loc.login.username.txt"))));
		login_username.click();
		login_username.sendKeys("mercury");
		WebElement login_password=(driver.findElement(By.name(login_read.getLocater("loc.login.password.txt"))));
		login_password.click();
		login_password.sendKeys("mercury");
		WebElement login_signin=(driver.findElement(By.name(login_read.getLocater("loc.login.signin.btn"))));
		login_signin.click();
	}
}

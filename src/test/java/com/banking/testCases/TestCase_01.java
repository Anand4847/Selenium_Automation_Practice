package com.banking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.LoginPage;




public class TestCase_01 extends BaseClass {

	@Test

	public void loginTest()

	{

		logger.info("Enter url");
		LoginPage lp = new LoginPage(driver);

		lp.SetUsername(username);
		logger.info("Enter Username");
		lp.SetPassword(password);
		logger.info("Enter Password");
		lp.LoginBtn();
		logger.info("Click on Login Btn");
		
		System.out.println(driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))

		{
			Assert.assertTrue(true);

		} else

		{

			Assert.assertTrue(false);
		}

	}

}

package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	WebElement Username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "btnLogin")
	WebElement LoginBtn;

	public void SetUsername(String uname)

	{

		Username.sendKeys(uname);

	}

	public void SetPassword(String password)

	{

		Password.sendKeys(password);

	}

	public void LoginBtn()

	{

		LoginBtn.click();

	}

}
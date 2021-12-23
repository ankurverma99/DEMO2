package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassword_Page {
	@FindBy(name = "forgetPasswordEmailOrUsername")
	private WebElement EmailOrUsername;
	@FindBy(id = "forgetPasswordButton")
	private WebElement RequestLoginInfo;
	@FindBy(id = "toLoginPageLink")
	private WebElement returnToLoginPage;

	public void sendText(String st) {
		EmailOrUsername.sendKeys(st);
	}

	public void clickRl() {
		RequestLoginInfo.click();
	}

	public ForgetPassword_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}

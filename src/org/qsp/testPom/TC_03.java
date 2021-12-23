package org.qsp.testPom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.qsp.genricmethod.BaseTest;
import org.qsp.genricmethod.XL;
import org.qsp.pom.ForgetPassword_Page;
import org.qsp.pom.LoginPage;
import org.testng.annotations.Test;

public class TC_03 extends BaseTest {
	@Test
	public void forgetPassword() throws EncryptedDocumentException, FileNotFoundException, IOException {
		String un = XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		LoginPage lp = new LoginPage(driver);
		lp.clickForgetPassword();
		ForgetPassword_Page fp = new ForgetPassword_Page(driver);
		fp.sendText(un);
		fp.clickRl();

	}
}

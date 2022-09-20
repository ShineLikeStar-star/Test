
package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class Login_page {

	private Pojo objPojo;
	
	public Login_page(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By inpUsername = By.xpath("//input[@placeholder='Email']");
	By inpPassword = By.xpath("//input[@placeholder='Password']");
	By btnLogin = By.xpath("//span[text()='Login']");
	
	public void setUserID(String userID) {
		java.util.Date date=new java.util.Date();  
		System.out.println(date);  
		objPojo.getObjWrapperFunctions().waitForElementToBeClickable(inpUsername);
		objPojo.getObjUtilities().logReporter("Set user name", userID,
				objPojo.getObjWrapperFunctions().setText(inpUsername, userID));
	}
	
	public void setPassword(String password) {
		objPojo.getObjUtilities().logReporter("Set password", password,
				objPojo.getObjWrapperFunctions().setText(inpPassword, password));
	}
	
	public void clickonLoginButton() {
		objPojo.getObjUtilities().logReporter("Click on Login", objPojo.getObjWrapperFunctions().click(btnLogin));
	}
	//User 3 changes
}

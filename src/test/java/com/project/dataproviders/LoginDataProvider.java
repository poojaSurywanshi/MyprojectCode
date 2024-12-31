
package com.project.dataproviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	 @DataProvider(name = "loginData")
	    public Object[][] provideData() {
	        return new Object[][]{
	                {"poojashivaji", "admin123"},
	                //{"user1@gmail.com", "pass123"},
	             //   {"user2@gmail.com", "pass@2word"}
	        };
	    }

}

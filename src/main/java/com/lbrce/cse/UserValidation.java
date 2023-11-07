package com.lbrce.cse;

import java.util.ResourceBundle;

public class UserValidation {
	public boolean check(String inUID, String inPass) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String inUserName = rb.getString("uname");
		String inPassword = rb.getString("passwd");
		if(inUserName.equals(inUID) && inPassword.equals(inPass))
			return true;
		else
			return false;
	}
}

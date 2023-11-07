package com.lbrce.cse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTest {
	@Test
	public void testCase1() {
		UserValidation uv = new UserValidation();
		Assert.assertEquals(false, uv.check("", ""));
	}
	
	@Test
	public void testCase2() {
		UserValidation uv = new UserValidation();
		Assert.assertEquals(true, uv.check("srikanth", "sri@123"));
	}
}

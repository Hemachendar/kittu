package com.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class junits {
	
		
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Before
	public void method() {
		Assert.assertTrue(false);
		System.out.println("before");
	}
	/*@Before
	public void method1() {
		//Assert.assertTrue(false);
		System.out.println("before1");
	}*/


	@After
	public void after() {
		System.out.println("after");
	}

}

package com.TestNG_Listners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class First_Listner {

	@Test(priority=1)
	void testcase1()
	{
		Assert.assertEquals(1,1);
	}
	@Test(priority=2)
	void testcase2()
	{
		Assert.assertEquals("A","B");
	}
	@Test(priority=3,dependsOnMethods = {"testcase2"})
	void testcase3()
	{
		System.out.println("hello listener");
	}
}

package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ParallelB {
	
	
    	 @Test
	   public void testcase1()
	   {
		   System.out.println("this is parallel execute1 :"+Thread.currentThread().getId());
	   }
    	 @Test
    	   public void testcase2()
    	   {
    		   System.out.println("this is parallel execute2 :"+Thread.currentThread().getId());
    	   }	 
}

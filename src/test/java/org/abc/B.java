package org.abc;

import org.junit.Test;

import junit.framework.Assert;

public class B {
	@Test
	public void testb1() {
		System.out.println("testb1");
	}

	@Test
	public void testb2() {
		
		System.out.println("testb2");
	}
	
	@Test
	public void testb3() {
		Assert.assertTrue("verify url", false);
		System.out.println("testb3");
	}
}

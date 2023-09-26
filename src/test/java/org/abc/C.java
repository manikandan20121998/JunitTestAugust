package org.abc;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class C {
	@Test
	public void testc1() {
		Assert.assertTrue("verify url", false);
		System.out.println("testc1");
	}

	@Test
	public void testc2() {
		
		System.out.println("testc2");
	}
	@Ignore
	@Test
	public void testc3() {

		System.out.println("testc3");
	}
}

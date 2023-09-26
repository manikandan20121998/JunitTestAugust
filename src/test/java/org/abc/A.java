package org.abc;

import org.junit.Test;

import junit.framework.Assert;

public class A {
	
	
	@Test
	public void testa1() {
		System.out.println("testa1");
	}

	@Test
	public void testa2() {
		Assert.assertTrue("verify url", false);
		System.out.println("testa2");
	}
	
	@Test
	public void testa3() {
		System.out.println("testa3");
	}

	
}

package org.junit.test;

import org.junit.*;

public class Day1 {
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("before class");
		
	}
	
	@AfterClass
	public static void Afterclass() {
		System.out.println("Afterclass");
		
		
	}
	@Before
	public void before() {
		System.out.println("before");
		
	}
	
	@After
	public void After() {
		System.out.println("After");
		
	}
	
	@Test
	public void Test1() {
		System.out.println("test1");
		
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
		
	}
	
	@Ignore
	@Test
	public void Test3() {
		System.out.println("test3");
		
	}
	
	
	
	
	
	
	
	
	
	

}

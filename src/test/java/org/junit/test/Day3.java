package org.junit.test;

import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.page.LoginPage;
import org.page.RegisterPage;

import junit.framework.*;

public class Day3 extends BaseClass{
	
//	public static WebDriver driver;
	
	@BeforeClass
	public static void Beforeclass() {
		chromebrowser();
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterclass() {
	    quit();
		System.out.println("After class");	
	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("test start time  "+d);
		
	}
	
	@After
	public void after() {
		Date d=new Date();
		System.out.println("test end time  "+d);
		
	}
	@Ignore
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	@Test
	public void test1() {
		
		urllaunch("https://www.facebook.com/");
		implicitywait(10);
		RegisterPage l=new RegisterPage();
		
		click(l.getBtncreate());
		sendkeys(l.getTxtfirstname(), "mani");
		sendkeys(l.getTxtlastname(), "maddy");
		click(l.getBtnsignup());
		String url = currenturl();
		boolean con = url.contains("https://www.facebook.com/");
		Assert.assertTrue("verify url", con);
		System.out.println("test1");
		
	}
	
	@Test
	public void Test2() throws InterruptedException {
//verify url
		urllaunch("https://www.facebook.com/");
		String url = currenturl();
		boolean ct = url.contains("facebook");
		Assert.assertTrue("verify url", ct);
		
		LoginPage lg=new LoginPage();
		//verify username
		
		sendkeys(lg.getUsername(), "mani");
		String at = getattribute(lg.getUsername());
	//	Assert.assertEquals("verify username",at );
		Assert.assertEquals("verify user", "mani", at);
		
		
		//verify password
		sendkeys(lg.getPassword(), "8473");
		String atpass = getattribute(lg.getPassword());
		Assert.assertEquals("8473", atpass);
		
		//verify login
		click(lg.getLogin());
		
		Thread.sleep(3000);
		String cu = currenturl();
		boolean contains = cu.contains("privacy_mutation_token");
		Assert.assertTrue(contains);
		System.out.println("test2");
		
		
		
		
		
	}

}

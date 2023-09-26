package org.junit.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2  {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("beforeclass");
	
	}
	
	@AfterClass
	public static void afterclass() {
		driver.quit();
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
	public void Test1() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement createbtn = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createbtn.click();
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("mani");
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("maddy");
		String attribute = last.getAttribute("value");
		Assert.assertEquals("maddy", attribute);
		
		
		WebElement cre = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		cre.click();
		
		System.out.println("test1");
		
	}
	
	@Test
	public void Test2() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("manikandan");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("manimaddy");
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
		String curl = driver.getCurrentUrl();
		boolean curls = curl.contains("maddy");
		//failed
		Assert.assertTrue("verify url", curls);
		System.out.println("Test2");
		
	}
	


}

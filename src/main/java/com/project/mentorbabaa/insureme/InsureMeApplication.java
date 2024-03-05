package com.project.mentorbabaa.insureme;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootApplication
public class InsureMeApplication {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SpringApplication.run(InsureMeApplication.class, args);//C:\venkat\chromedriver-win64\chromedriver-win64
		// System.setProperty("webdriver.chrome.driver", "/C://venkat//chromedriver-win64//chromedriver-win64//chromedriver.exe"); 
		  System.out.println( "Hello World!" );
		  
		  WebDriverManager.chromedriver().setup(); //
		  ChromeOptions	 chromeOptions=new ChromeOptions(); 
		  chromeOptions.addArguments("--headless");
		  chromeOptions.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new ChromeDriver(chromeOptions);
		  
		
		   System.out.println("start");
		 
			
			  driver.get("http://54.234.162.45:8081/contact.html");
			 // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  
			  driver.findElement(By.id("inputName")).sendKeys("venkat");
			  
			  driver.findElement(By.id("inputNumber")).sendKeys("1234567891");
			  
			  driver.findElement(By.id("inputMail")).sendKeys("test@test.com");
			  driver.findElement(By.id("inputMessage")).
			  sendKeys("this is test for insurance form");
			  driver.findElement(By.id("my-button")).click(); 
			  String text = driver.findElement(By.id("response")).getText();
		      System.out.println(text);
		      //assertEquals("Saved 'Message Sent'", text); driver.quit();
		      driver.quit();
			 System.out.println("done");
	}

}

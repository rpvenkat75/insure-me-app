package com.project.mentorbabaa.insureme;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.mentorbabaa.insureme.Policy;
import com.project.mentorbabaa.insureme.PolicyService;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest
class InsureMeApplicationTests {

	WebDriver driver;
	@Test
	void contextLoads() {
	}
	
	@Test
	void testCreatePolicy() {
		Policy policy = new Policy(1, "Shubham", "Individual" , 10000, "10-Sep-2021", "10-Sep-2022");
		PolicyService pService = new PolicyService();
		//Policy outputPolicy = pService.CreatePolicy();
		assertEquals(policy.getPolicyId(), pService.generateDummyPolicy().getPolicyId());
		
	}
	
	@Test
	void testSearchPolicy() {
		PolicyService pService = new PolicyService();
		assertEquals(null,pService.searchPolicy());
	}


	/*
	 * @BeforeAll static void setupClass() {
	 * WebDriverManager.chromedriver().setup(); }
	 * 
	 * @BeforeEach void setupTest() { driver = new ChromeDriver(); }
	 * 
	 * @AfterEach void teardown() { driver.quit(); }
	 */

	/*
	 * @Test void test() { // Exercise WebDriverManager.chromedriver().setup();
	 * driver.get("https://bonigarcia.dev/selenium-webdriver-java/"); String title =
	 * driver.getTitle(); driver.get("http://192.168.1.245:8081/contact.html");
	 * 
	 * driver.findElement(By.id("inputName")).sendKeys("venkat");
	 * 
	 * driver.findElement(By.id("inputNumber")).sendKeys("1234567891");
	 * 
	 * driver.findElement(By.id("inputMail")).sendKeys("test@test.com");
	 * driver.findElement(By.id("inputMessage")).
	 * sendKeys("this is test for insurance form");
	 * driver.findElement(By.id("my-button")).click(); driver.quit();
	 * System.out.println("done"); // Verify
	 * assertThat(title).contains("Selenium WebDriver"); }
	 */
	
}

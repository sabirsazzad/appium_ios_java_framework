package cloud;

import io.appium.java_client.ios.IOSDriver;
import pages.LoginPage;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import fixture.TestData;

public class AppiumLoginTestForIOS extends BaseIOSTest{
	LoginPage loginPage = new LoginPage();
	TestData testData = new TestData();

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		
		driver.findElement(By.id("test-Username")).sendKeys("standard_user");
		driver.findElement(By.id("test-Password")).sendKeys("secret_sauce");
		driver.findElement(By.id("test-LOGIN")).click();
		
//		driver.findElement(loginPage.usernameField).sendKeys("standard_user");
//		driver.findElement(loginPage.passwordField).sendKeys("secret_sauce");
//		driver.findElement(loginPage.loginButton).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
	
}

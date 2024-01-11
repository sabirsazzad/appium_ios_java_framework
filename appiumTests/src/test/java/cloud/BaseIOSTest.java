package cloud;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.ios.IOSDriver;

public class BaseIOSTest {
  @Test
  public static IOSDriver DesiredCapabilities() throws MalformedURLException, InterruptedException {
	  MutableCapabilities caps = new MutableCapabilities();
	  caps.setCapability("platformName", "iOS");
	  caps.setCapability("appium:app", "storage:filename=iOS.RealDevice.SauceLabs.Mobile.Sample.app.2.7.1.ipa");  // The filename of the mobile app
	  caps.setCapability("appium:deviceName", "iPhone.*");
	  caps.setCapability("appium:platformVersion", "16");
	  caps.setCapability("appium:automationName", "XCUITest");
	  MutableCapabilities sauceOptions = new MutableCapabilities();
	  sauceOptions.setCapability("username", "oauth-sabir.sazzad-8f4a5");
	  sauceOptions.setCapability("accessKey", "4deb5c8f-d078-483f-838e-cb1feacdc727");
	  sauceOptions.setCapability("build", "test_build");
	  sauceOptions.setCapability("name", "test_name");
	  caps.setCapability("sauce:options", sauceOptions);

	  URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
	  IOSDriver driver = new IOSDriver(url, caps);
	  
	  return driver;

  }
}

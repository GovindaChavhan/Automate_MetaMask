package utility_AssignmentTask_BlocksOne;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Add the GET CRX entension to chrome it will help to
 * Get the crx file for Matamask easily
 */

public class Meta_BaseClass {
	public WebDriver driver;
	@BeforeMethod
	public void start_Browser()
	{
		WebDriverManager.chromedriver().setup();
		/**---Make the metamask path dynamic so it can be run on remote machine-----*/
		String metaMaskExtensionPath = "./Files/MetaMask - Chrome Web Store 11.16.14.0.crx";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addExtensions(new File(metaMaskExtensionPath));
		driver = new ChromeDriver(options);
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html");
		driver.manage().window().maximize();
		
		
	}

}

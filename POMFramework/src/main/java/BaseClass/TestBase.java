package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Testutil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"D:\\Stuff\\TestCode\\POMFramework\\src\\main\\java\\Configuration\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void inilization() {

		String broeserName = prop.getProperty("browser");
		if (broeserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Stuff\\chromedriver_win32\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (broeserName.equals("FF")) {
			// launch FF browser
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.manage().timeouts().pageLoadTimeout(Testutil.Page_load_timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		//Test
		
		// added comment to check poll scm in jenkies
	}
}

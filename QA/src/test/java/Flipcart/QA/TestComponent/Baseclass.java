package Flipcart.QA.TestComponent;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import Filpcart.QA.pageobject.Homepage;

public class Baseclass {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		/*Properties prop = new Properties();
		//FileInputStream fi = new FileInputStream("");
		//prop.load(fi);
		//String browersname = prop.getProperty("browser");*/
		String browersname = "chrome";
		if (browersname.equals("chrome")) {
			
			driver = new ChromeDriver();
		} else if (browersname.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browersname.equals("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public Homepage launchApplication() throws IOException {
		driver = initializeDriver();
		Homepage home_page = new Homepage(driver);
		home_page.launchapp("https://www.flipkart.com/");
		return home_page;

	}

	public void teardown() {
		driver.close();

	}

}

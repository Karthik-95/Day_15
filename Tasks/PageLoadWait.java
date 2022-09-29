package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.runtime.model.Timestamp;

public class PageLoadWait {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Log\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hackerrank.com/dashboard");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		if (j.executeScript("return document.readyState").toString().equals("completed")) {
			System.out.println("Page Loaded Successfully");
		}
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Page Is Not Loaded");
			}
			if (j.executeScript("return document.readyState").toString().equals("completed")) {
				break;
			}
		}

	}

}

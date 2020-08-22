package generics;

import java.util.concurrent.TimeUnit;

import javax.swing.SpringLayout.Constraints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ISuiteResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class  BaseTest implements AutoConstant
 {
 public WebDriver driver; 
 @BeforeClass
 public void openBrowser()
 {
  System.setProperty(chrome_key,chrome_value);
  driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
  driver.manage().window().maximize();
  driver.get(url);
 }
 @AfterClass
 public void closeBrowser()
 {
	// driver.quit();
 }
}

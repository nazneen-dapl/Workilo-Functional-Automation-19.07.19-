import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert

System.setProperty("webdriver.chrome.driver", "C:\\Users\\DAPL-Asset-70\\Desktop\\BrowserDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://workilo.com");
String actualTitle = driver.getTitle();
String expectedTitle = "Workilo :: Home Improvement And Renovation Services in Brooklyn by Workilo";
Assert.assertEquals(actualTitle, expectedTitle,"Title didn't match.");
Thread.sleep(3000);
driver.quit();
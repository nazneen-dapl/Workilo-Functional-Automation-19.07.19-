import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver", "C:\\Users\\DAPL-Asset-70\\Desktop\\BrowserDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://workilo.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.linkText("Sign Up")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Customer']")).click();
Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(".//*[@value='Sign Up']")));
driver.findElement(By.xpath(".//*[@value='Sign Up']")).click();
WebElement email = driver.findElement(By.xpath("//*[@id='signup-form']/div[1]/label[2]"));
WebElement firstname = driver.findElement(By.xpath("//*[@id='signup-form']/div[2]/div[1]/label[2]"));
WebElement lastname = driver.findElement(By.xpath("//*[@id='signup-form']/div[2]/div[2]/label[2]"));
WebElement pwd = driver.findElement(By.xpath("//*[@id='signup-form']/div[3]/label[2]"));
WebElement contact = driver.findElement(By.xpath("//*[@id='signup-form']/div[4]/label[2]"));

js.executeScript("arguments[0].style.border='3px solid red'", email);
js.executeScript("arguments[0].style.border='3px solid red'", firstname);
js.executeScript("arguments[0].style.border='3px solid red'", lastname);
js.executeScript("arguments[0].style.border='3px solid red'", pwd);
js.executeScript("arguments[0].style.border='3px solid red'", contact);

Thread.sleep(5000);
driver.quit();
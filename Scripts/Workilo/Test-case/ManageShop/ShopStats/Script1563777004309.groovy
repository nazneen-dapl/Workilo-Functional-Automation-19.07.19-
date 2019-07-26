import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\DAPL-Asset-70\\Desktop\\BrowserDriver\\chromedriver.exe')

WebDriver driver = new ChromeDriver()

driver.manage().window().maximize()

driver.get('http://workilo.com')

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)

driver.findElement(By.linkText('Log In')).click()

Thread.sleep(2000)

driver.findElement(By.id('email_login')).sendKeys('testworkilo@gmail.com')

driver.findElement(By.id('password_login')).sendKeys('admin@123')

driver.findElement(By.xpath('.//*[@value=\'Log in\']')).click()

Thread.sleep(3000)

driver.findElement(By.xpath('/html/body/header/div/span[1]')).click()

Thread.sleep(2000)

driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul[1]/li")).click()

Thread.sleep(1000)

driver.findElement(By.xpath(".//*[text()='Shop Stats']")).click()

Thread.sleep(1000)

driver.findElement(By.xpath(".//*[text()='Orders']")).click()

/* How many listing */

JavascriptExecutor js = (JavascriptExecutor) driver;

WebElement favourite = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[2]/div[1]"))

js.executeScript("arguments[0].style.border='3px solid red'", favourite);

js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[2]/div[1]/ul/li[1]")))

js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[2]/div[1]/ul/li[3]")))

Thread.sleep(1000)

js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div[1]/ul/li[1]")))
js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div[1]/ul/li[2]")))
js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div[1]/ul/li[3]")))
js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[1]/div[1]/ul/li[4]")))
Thread.sleep(2000)
js.executeScript('window.scrollBy(0,400)')

js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[2]/div[3]")))
js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[2]/div[2]/div[4]")))
Thread.sleep(3000)
js.executeScript('window.scrollBy(0,400)')

js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@id='jqChart']/canvas[3]")))
Thread.sleep(1000)
driver.findElement(By.xpath('/html/body/header/div/span[1]')).click()

Thread.sleep(2000)

driver.findElement(By.linkText('Sign Out')).click()

Thread.sleep(1000)
Actions action = new Actions(driver)
action.sendKeys(Keys.ESCAPE).build().perform()

Thread.sleep(2000)

driver.quit()
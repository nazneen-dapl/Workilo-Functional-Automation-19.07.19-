import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.interactions.Actions as Actions

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

Thread.sleep(1000)

driver.findElement(By.xpath('/html/body/div[4]/div/div[1]/ul/li[1]/a')).click()

Thread.sleep(1000)

driver.findElement(By.xpath('//*[@id=\'tab-1\']/div[1]/table/tbody/tr[1]/td[4]')).click()

Thread.sleep(2000)

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.scrollTo(0, document.body.scrollHeight)')

Thread.sleep(1000)

driver.findElement(By.id('additional_expences')).clear()

driver.findElement(By.id('additional_expences')).sendKeys('0.01')

Thread.sleep(1000)

js.executeScript('window.scrollBy(0,-600)')

Thread.sleep(1000)

driver.findElement(By.name('submit_change')).click()

Thread.sleep(1000)

js.executeScript('arguments[0].style.border=\'3px solid red\'', driver.findElement(By.xpath('/html/body/div[6]/div[1]')))

Thread.sleep(1000)

driver.findElement(By.xpath('/html/body/header/div/span[1]')).click()

Thread.sleep(2000)

driver.findElement(By.linkText('Sign Out')).click()

Thread.sleep(1000)

Actions action = new Actions(driver)

action.sendKeys(Keys.ESCAPE).build().perform()

Thread.sleep(2000)

driver.quit()
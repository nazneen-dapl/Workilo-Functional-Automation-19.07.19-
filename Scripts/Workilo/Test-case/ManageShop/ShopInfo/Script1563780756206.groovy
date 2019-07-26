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

Thread.sleep(2000)

driver.findElement(By.xpath('/html/body/div[4]/div/div[2]/ul[1]/li')).click()

Thread.sleep(1000)

driver.findElement(By.xpath('.//*[text()=\'Shop Info\']')).click()

Thread.sleep(1000)

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.scrollBy(0,400)')

Thread.sleep(2000)

driver.findElement(By.name('contact')).clear()

driver.findElement(By.name('contact')).sendKeys('74445210')

/*WebElement about = driver.findElement(By.name('tell_us_about_yourself'))

js.executeScript('arguments[0].scrollIntoView();', about)

Thread.sleep(2000)

about.clear()

about.sendKeys('We Provide service at very low coast')*/

Thread.sleep(1000)

js.executeScript('window.scrollTo(0, document.body.scrollHeight)')

Thread.sleep(1000)

driver.findElement(By.xpath('//*[@id=\'getpaid\']/input[2]')).click()

Thread.sleep(2000)

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
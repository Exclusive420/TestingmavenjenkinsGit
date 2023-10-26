


	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

	public class Airplane {
		@Test
		public  void airplaneticket() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI\\Desktop\\Selenium\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

			Thread.sleep(2000);

			driver.manage().window().maximize();

			
			  Actions newAction = new Actions(driver);
			  
			  newAction.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			  
			  Thread.sleep(2000);
			  
			 newAction.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
			 

			Thread.sleep(2000);

			Thread.sleep(2000);

			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath(
					"/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[5]/a"))
					.click();

			Thread.sleep(2000);

			driver.findElement(By.xpath(
					"/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[2]/li[6]/a"))
					.click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[1]/a")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("divpaxinfo")).click();

			Thread.sleep(2000);

			WebElement button = driver.findElement(By.id("hrefIncAdt"));

			int i;

			for (i = 0; i < 3; i++) {

				button.click();

			}

			Thread.sleep(3000);

			WebElement secondButton = driver.findElement(By.id("hrefIncChd"));

			int y;

			for (y = 0; y < 2; y++) {

				secondButton.click();

			}
			Thread.sleep(2000);

			driver.findElement(By.id("btnclosepaxoption")).click();

			Thread.sleep(4000);

			driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();

			WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

			Select drop = new Select(currency);

			drop.selectByIndex(2);

			// drop.selectByVisibleText("AED");

			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

			Thread.sleep(4000);

			driver.quit();

		}

	}



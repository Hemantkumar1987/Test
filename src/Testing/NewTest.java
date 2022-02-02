package Testing;


import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @BeforeTest
  public void SETUP() 
  {
	 System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	 
	 driver = new ChromeDriver();
	 driver.get("http://localhost:58097/guest/Login");
	 
	 // Check The Title
	 String expectedTitle = "Login - UserMaintenance";
	 String actualTitle = driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
	 
  }
  
  @Test(priority=1)
  public void  ChkSIGNUPLINK() throws InterruptedException
  {
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  Thread.sleep(1000);
	  WebElement  ChkSIGNUP =  driver.findElement(By.xpath("//a[text()='SignUp']"));
	  ChkSIGNUP.click();  
  }
  
  @Test(priority=2)
  public void Signup() throws InterruptedException
  {
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  Thread.sleep(1000);
	 
	  // FILL THE SIGNUP FORM
	  int max1 = 1000;
	  int min1 = 1;
	  Random randomNum1 = new Random();
	  int showMe1 = min1 + randomNum1.nextInt(max1);
	  String user_ID = "test" + showMe1 + "Ram";
	  WebElement  UserID =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtUserId']"));
	  Thread.sleep(2000);
	  UserID.click();
	  UserID.sendKeys(user_ID);
	  Thread.sleep(1000);
	  driver.manage().window().maximize();
	 //JavascriptExecutor jse = (JavascriptExecutor)driver;
	 // jse.executeScript("window.scrollBy(0,500)");
	  WebElement  Pass =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtPassword']"));
	  Thread.sleep(2000);
	  
	  Pass.sendKeys("user001");
	  
	  WebElement CONPass =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtConfirmPassword']"));
	  Thread.sleep(2000);
	  
	  CONPass.sendKeys("user001");
	  
	  Select Squestion = new Select(driver.findElement(By.xpath("//select[@id='cphContainer_ucSignUp1_ddlSecurityQuestion']")));
	  Thread.sleep(1000);
	  Squestion.selectByIndex(3);
	  
	  WebElement Answer =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtAnswer']"));
	  Thread.sleep(2000);
	  Answer.click();
	  Answer.sendKeys("ram");
	  Thread.sleep(2000);
	  
	  WebElement Name =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtName']"));
	  Thread.sleep(2000);
	  Name.click();
	  Name.sendKeys("pawan");
	  
	  Thread.sleep(2000);
	  
	  WebElement DOB =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtDateOfBirth']"));
	  Thread.sleep(2000);
	  DOB.click();
	  DOB.sendKeys("12/17/2021");
	  Thread.sleep(1000);
	//input[@id='cphContainer_ucSignUp1_txtEmail']
	  
	  List RadioButton = driver.findElements(By.name("ctl00$cphContainer$ucSignUp1$Gender"));
	  
	  int Size = RadioButton.size();
	  for(int i=0; i < Size; i++);
	  {
		  int i = 0;
		String val = ((WebElement) RadioButton.get(i)).getAttribute("value");
	  
	  if (val.equalsIgnoreCase("rbtnmale"))
	  {
		  ((WebElement) RadioButton.get(i)).click();
		 
	  }
	  
	  }
	    int max2 = 1000;
	    int min2 = 1;
	    Random randomNum2 = new Random();
	    int showMe2 = min2 + randomNum2.nextInt(max2);
	    String user_Email = "test" + showMe2 + "@defactoinfotech.com";
	  WebElement E_mail =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtEmail']"));
	  Thread.sleep(2000);
	  E_mail.click();
	  //E_mail.sendKeys("test@gmail.com");
	  E_mail.sendKeys(user_Email);
	  Thread.sleep(1000);
	  
	  WebElement Street =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtStreet']"));
	  Thread.sleep(2000);
	  Street.click();
	  Street.sendKeys("pcl");
	  
	  Thread.sleep(2000);
	  
	  Select Country = new Select(driver.findElement(By.xpath("//select[@id='cphContainer_ucSignUp1_ddlCountry']")));
	  Thread.sleep(1000);
	  Country.selectByIndex(1);
	  
	  Thread.sleep(2000);
	  
	  Select State = new Select(driver.findElement(By.xpath("//select[@id='cphContainer_ucSignUp1_ddlState']")));
	  Thread.sleep(1000);
	  State.selectByIndex(1);
	  
	  Select City = new Select(driver.findElement(By.xpath("//select[@id='cphContainer_ucSignUp1_ddlCity']")));
	  Thread.sleep(1000);
	  City.selectByIndex(1);
	  WebElement Pincode =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtPincode']"));
	  Thread.sleep(2000);
	  Pincode.click();
	  Pincode.sendKeys("PIN");
	  
	//input[@id='cphContainer_ucSignUp1_txtMobile']
	  int max3 = 1000;
	  int min3 = 1;
	  Random randomNum3 = new Random();
	  int showMe3 = min3 + randomNum3.nextInt(max3);
	  String Contact_NUMBER = "123" + showMe3 + "888888";
	  WebElement Mobile =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtMobile']"));
	  Thread.sleep(2000);
	  Mobile.click();
	  Mobile.sendKeys(Contact_NUMBER);
	  
	  WebElement  Pass1 =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtPassword']"));
	  Pass1.sendKeys("user001");
	  WebElement CONPass1 =  driver.findElement(By.xpath("//input[@id='cphContainer_ucSignUp1_txtConfirmPassword']"));
	  CONPass1.sendKeys("user001");
	//input[@value='Sign Up']
	  WebElement Signup =  driver.findElement(By.xpath("//input[@value='Sign Up']"));
	  Thread.sleep(2000);
	  Signup.click();  
  }
  
  @Test(priority=3)
  public void ChkLOGIN() throws InterruptedException
  {
	  WebElement user11 =  driver.findElement(By.xpath("//input[@id='cphContainer_ucLogin1_txtUserId']"));
	  user11.sendKeys("ram1");
	  
	  WebElement pass11 =  driver.findElement(By.xpath("//input[@id='cphContainer_ucLogin1_txtPassword']"));
	  pass11.sendKeys("user001");
	  
	//input[@id='cphContainer_ucLogin1_btnLogin']
	  WebElement LOG_Button =  driver.findElement(By.xpath("//input[@id='cphContainer_ucLogin1_btnLogin']"));
	  Thread.sleep(1000);
	  LOG_Button.click();
	  
  }
  
  
}

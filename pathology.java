package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pathology {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://gor-pathology.web.app/");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@kennect.io");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qwerty@1234");
driver.findElement(By.xpath("//span[text()='Login']")).click();
System.out.println("Test Cost Calculator");
Thread.sleep(5000);

JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement Element = driver.findElement(By.xpath("//*[text()='Subtotal']"));
Thread.sleep(5000);
         js.executeScript("arguments[0].scrollIntoView();", Element);
  //Add Todo
driver.findElement(By.xpath("//span[@class='MuiButton-endIcon
MuiButton-iconSizeMedium']")).click();
driver.findElement(By.id("//input[@id='outlined-add-todo-input']")).sendKeys("harshank");
driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
driver.navigate().back();

//Test Cost Calculator
driver.findElement(By.xpath("//input[@id='patient-test']")).click();
driver.findElement(By.xpath("//span[text()='UR URIC ACID -
150₹']")).click();
String discount=driver.findElement(By.xpath("//div[@class='MuiBox-root
jss179']")).getText();
System.out.println("Before applying discount is :"+discount);
driver.findElement(By.xpath("//div[@class='MuiSelect-root
MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined
MuiInputBase-input MuiOutlinedInput-input']")).click();
driver.findElement(By.xpath("//div[text()='10%']")).click();
String Afterdiscount = driver.findElement(By.xpath(discount)).getText();
System.out.println("After applying discount :"+Afterdiscount);

//Add patients
    //patients contact details
driver.findElement(By.xpath("//span[text()='Patients']")).click();
driver.findElement(By.xpath("(//span[text()='Add Patient'])[1]")).click();
driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Harshank");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("harshankpingale999@gamil.com");
driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8888201724");
   //General details
driver.findElement(By.xpath("(//span[text()='General
Details'])[2]")).click();
driver.findElement(By.xpath("//input[@name='height']")).sendKeys("160");
driver.findElement(By.xpath("//input[@name='weight']")).sendKeys("70");
Select dropdown = new
Select(driver.findElement(By.xpath("//div[@id='mui-component-select-gender']")));
dropdown.selectByValue("male");
driver.findElement(By.xpath("//input[@name='age']")).sendKeys("24");
driver.findElement(By.xpath("//input[@name='systolic']")).sendKeys("87");
driver.findElement(By.xpath("//input[@name='diastolic']")).sendKeys("89");

    //Add test
driver.findElement(By.xpath("(//span[text()='Add Tests'])[2]")).click();
driver.findElement(By.xpath("//input[@id='patient-test']")).click();
driver.findElement(By.xpath("//span[text()='Beans - 250₹']")).click();
driver.findElement(By.xpath("//li[text()='15%']")).click();

driver.findElement(By.xpath("//span[text()='Add Patient']")).click();


driver.close();
}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ShraddhaGanesh
 */
public class Costco {
  private org.openqa.selenium.WebDriver driver;
    public Costco() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    
    //@FixMethodOrder(MethodSorters.NAME_ASCENDING)
 //positive scenario
 @Test
  public void testCostcoTest1() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office desk");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    driver.quit();
  }

  
  @Test //negative scenario
  public void testCostcoTest2() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("di;uvbsebfs");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    driver.quit();
  }

  
//@Test //positive scenario
  public void testCostcoTest3() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office desk");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2)'])[1]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(1)'])[2]/following::label[1]")).click();
    driver.quit();
  }

  
  @Test //positive scenario
  public void testCostcoTest4() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office desk");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Color")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(1)'])[4]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(1)'])[2]/following::label[1]")).click();
    driver.quit();
  }

  
  @Test //positive scenario
  public void testCostcoTest5() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office desk");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Frame Color")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Frame Color'])[1]/following::label[1]")).click();
    driver.quit();
  }
  
  //Negative senario
@Test
  public void testCostcoTest6() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::i[1]")).click();
    driver.quit();
  }

  
  //@Test
   public void test7() throws Exception {
    driver.get("https://www.costco.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("search-field")).sendKeys("office desk");
    Thread.sleep(2000);
    driver.findElement(By.id("formcatsearch")).submit();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(2)'])[1]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(1)'])[2]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Color")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Color'])[1]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Show more options")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(5)'])[1]/following::label[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("sort_by")).click();
    Thread.sleep(2000);
    new Select(driver.findElement(By.id("sort_by"))).selectByVisibleText("Ratings (High to Low)");
   // driver.findElement(By.id("sort_by")).click();
  driver.quit();
  }
  
  
}

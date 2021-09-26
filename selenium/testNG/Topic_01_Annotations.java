package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Topic_01_Annotations {
	
  @Test
  public void TC_01() {
	  System.out.println("Run TC 01");
  }
  
  @Test
  public void TC_02() {
	  System.out.println("Run TC 02");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass (alwaysRun = true)
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass (alwaysRun = true)
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest (alwaysRun = true)
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest (alwaysRun = true)
  public void afterTest() {
	  System.out.println("After Test");
  }

  
  @BeforeSuite (alwaysRun = true)
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  
  @AfterSuite (alwaysRun = true)
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}

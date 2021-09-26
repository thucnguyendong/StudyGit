package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Topic_13_Dependencies {
	ArrayList<String> test= new ArrayList<String>();
	
	  @Test (priority = 1, description = "Customer can create new account")
	  public void Create_New_Account() {
		  test.add("Thuc");
		  System.out.println(test.size());
	  }
	  
	  @Test (priority = 2, description = "Customer can view account", dependsOnMethods = "Create_New_Account")
	  public void View_Account() {
		  System.out.println(test.get(0));
	  }
	  
	  @Test (priority = 3, description = "Customer can edit account", dependsOnMethods = "View_Account")
	  public void Edit_Account() {
		  test.set(0, "Nguyen");
		  System.out.println(test.get(0));
	  }
	  
	  @Test (priority = 1, description = "Customer can delete accounts")
	  public void Delete_Account() {
		 test.clear();
		 System.out.println(test.size());
	  }
}

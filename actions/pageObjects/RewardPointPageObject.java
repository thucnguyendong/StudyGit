package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.MyReviewPageUI;

public class RewardPointPageObject extends BasePage {
	private WebDriver driver;	
	public RewardPointPageObject(WebDriver driver) {
		this.driver = driver;
	}
}

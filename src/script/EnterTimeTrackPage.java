package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EnterTimeTrackPage 
{
	//tc 3 check issuedate
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private WebElement settings;
	@FindBy(linkText="Licenses")
	private WebElement licenses;
	
	public void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.titleIs(eTitle));
		String aTitle=driver.getTitle();
		Assert.assertEquals(aTitle,eTitle);
	}
}
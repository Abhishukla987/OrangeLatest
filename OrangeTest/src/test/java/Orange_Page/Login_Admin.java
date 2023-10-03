package Orange_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Login_Admin {
	WebDriver driver;
	public Login_Admin(WebDriver ldriver) 
	{
		this.driver =ldriver;
		
	}
	//@FindBy
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") WebElement Uname;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input") WebElement Password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement Login;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6") WebElement Dashbord;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img") WebElement Orange_Icon;
	
	
//@My_Info_Page
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span") WebElement info;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6") WebElement Profile_name;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input") WebElement First_name;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input") WebElement first;
	
	public void Time_sleep() {
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void loginAdmin_Orange(String usernameApplication, String passwordApplication)
	{
		Uname.sendKeys(usernameApplication);
		Password.sendKeys(passwordApplication);
		Login.click();
		driver.getTitle();
		System.out.println(Dashbord.getText());

		System.out.println(Orange_Icon.getText());
		//Orange_Icon.click();
		
		
	}
	public void My_Info() throws InterruptedException {
		info.click();
		
		//System.out.println(Profile_name.getText());
		
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.click();
		
		First_name.clear();
		Thread.sleep(10000);
		First_name.sendKeys("Abhishek");
		
		
	}

}

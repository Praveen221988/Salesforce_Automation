package bootcamp.week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setup Chromedriver using Webdrivermanager software
				WebDriverManager.chromedriver().setup();
				
				//handle Notification
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				
		//Launch the Chrome Browser		
				ChromeDriver driver = new ChromeDriver(options);
			
				//Steps 
				//    1. Login to https://login.salesforce.com
				//	2. Click on toggle menu button from the left corner
				//	3. Click view All 
				//	4. Click Service Console from App Launcher
				//	5. Select Home from the DropDown
				//	6. Add CLOSED + OPEN values and result should set as the GOAL (If the result is less than 10000 then set the goal as 10000)
				//	7. Select Dashboards from DropDown
				//	8. Click on New Dashboard
				//	9. Enter the Dashboard name as "YourName_Workout"
				//	10. Enter Description as Testing and Click on Create
				//	11. Click on Done
				//	12. Verify the Dashboard is Created
				//	13. Click on Subscribe
				//	14. Select Frequency as "Daily"
				//	15. Time as 10:00 AM
				//	16. Click on Save
				//	17. Verify "You started Dashboard Subscription" message displayed or not
				//	18. Close the "YourName_Workout" tab
				//	19. Click on Private Dashboards
				//	20. Verify the newly created Dashboard available
				//	21. Click on dropdown for the item
				//	22. Select Delete
				//	23. Confirm the Delete
				//	24. Verify the item is not available under Private Dashboard folder
				
				 // 1. Login to https://login.salesforce.com
				
				//Load the URL	
				driver.get("https://login.salesforce.com/");
				
				//Maximize the Windows
				driver.manage().window().maximize();
				
				//wait
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				// Enter username & passowrd and click 
				
				driver.findElement(By.id("username")).sendKeys("fullstack@testleaf.com");
				driver.findElement(By.id("password")).sendKeys("SelBootcamp$123");
				driver.findElement(By.id("Login")).click();
				Thread.sleep(1000);
				
	//	2. Click on toggle menu button from the left corner
				
				//driver.findElementByClassName("tooltipTrigger tooltip-trigger uiTooltip").click();
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			//	driver.findElementByXPath("(//div[@data-aura-class='uiTooltip'])[9]").click();
				
		//	3. Click view All and click Sales from App Launcher
				
			//	driver.findElementByClassName("slds-button").click();
				driver.findElement(By.xpath("//button[text()='View All']")).click();
				
		// 4. Click Service Console from App Launcher
				
				driver.findElementByXPath("//p[text()='Service Console']").click();
				
        //	5. Select Home from the DropDown
						
				driver.findElementByXPath("//button[@title='Show Navigation Menu']/lightning-primitive-icon").click();
				driver.findElementByXPath("//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Home']").click();
				
        //	6. Add CLOSED + OPEN values and result should set as the GOAL (If the result is less than 10000 then set the goal as 10000)		
				
				String Closed = driver.findElementByXPath("(//span[@class='metricAmount uiOutputText' and @data-aura-class='uiOutputText'])[1]").getText();
				System.out.println(Closed);
				String Open = driver.findElementByXPath("(//span[@class='metricAmount uiOutputText' and @data-aura-class='uiOutputText'])[2]").getText();
				System.out.println(Open);
				String Goal = Closed + Open;
				System.out.println(Goal);
				
        // 7. Select Dashboards from DropDown		
				
				driver.findElementByXPath("//button[@title='Show Navigation Menu']/lightning-primitive-icon").click();
				driver.findElementByXPath("//span[text()='Dashboards']").click();
				
        //	8. Click on New Dashboard		
				
				driver.findElementByXPath("//div[text()='New Dashboard']").click();
				
        //	9. Enter the Dashboard name as "YourName_Workout"
				
				driver.findElementByXPath("//input[@id='dashboardNameInput']").sendKeys("Praveen_Workout");
				
       //	10. Enter Description as Testing and Click on Create
				
				driver.findElementByXPath("//input[@id='dashboardDescriptionInput']").sendKeys("Testing");
				driver.findElementByXPath("//button[text()='Create']").click();
				
       //	11. Click on Done
				
				driver.findElementByXPath("//button[text()='Done']").click();
				
      //	12. Verify the Dashboard is Created
				
				String Verify = driver.findElementByXPath("//span[@title='Praveen_Workout']").getText();
				
				System.out.println(Verify);
				
				String text1 = "Praveen_Workout";
				if(text1==Verify) {
					System.out.println("Dashboard is Created");
				}
     	//	13. Click on Subscribe	
				
				driver.findElementByXPath("//button[text()='Subscribe']").click();
				
       //	14. Select Frequency as "Daily"
				
				
	}

}

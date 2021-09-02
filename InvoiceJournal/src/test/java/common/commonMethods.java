package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class commonMethods {

	public static WebDriver driver;
	
	public void Openbrowser() {
		
		String cmd = System.getProperty ("user.dir");
		System.setProperty("webdriver.edge.driver", cmd + "\\git\\IJ\\InvoiceJournalmsedgedriver.exe");
		
		driver = new EdgeDriver();
	}
	
	
	public void clickElement(String locator) {
		
		String identifer="";
		
		if (locator.endsWith("id")) 
			identifer = "id";
		else if (locator.endsWith("Xpath"))
			identifer = "xpath";
		else if (locator.endsWith("LText"))
			identifer = "linkText";
		
		
		switch (identifer) {
		
		case "id":
			driver.findElement(By.id(locator)).click();
			break;
		case "Xpath":
			driver.findElement(By.xpath(locator)).click();
			break;
		case "LText":
			driver.findElement(By.linkText(locator)).click();
			break;
			
		}
	}
	
	public void login() {
		
		
		
	}

}

package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retiree.alight.com/createaccountinformation?URL=/");
		WebElement phn=driver.findElement(By.id("PhoneType"));
		Select select=new Select(phn);
		System.out.println(select.getFirstSelectedOption());
		select.selectByIndex(1);

	}

}

  package jamal;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
ChromeDriver dr;




public void open()
{
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahad\\Videos\\chromedriver.exe");

dr = new ChromeDriver();
dr.get("https://www.eshopper24.com/");


}
	
	
	
	
	
	
	
	
}

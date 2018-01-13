import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebSearcher {

	static File file = new File("chromedriver.exe");
	static ChromeOptions options = new ChromeOptions();
	static WebElement searchBox;
	static WebDriver driver;
	
	public WebSearcher(String website, String term) {

		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());		
		options.addArguments("--start-maximized");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver( options );		
		
		switch(website) {
			case "Google":
				driver.get("https://www.google.ca/search?site=&source=hp&q=" + term);
				break;
			case "Youtube":
				driver.get("https://www.youtube.com/results?search_query=" + term);
				break;
			case "Steam":
				driver.get("http://store.steampowered.com/search/?term=" + term);
				break;
			case "Amazon":
				driver.get("https://www.amazon.com/s/field-keywords=" + term);
				break;
			case "Reddit":
				driver.get("https://www.reddit.com/search?q=" + term);
				break;
			case "Wikipedia":
				driver.get("https://en.wikipedia.org/wiki/" + term);
				break;
			case "Kijiji":
				driver.get("http://www.kijiji.ca/");
				searchBox = driver.findElement(By.id("SearchKeyword"));
				searchBox.sendKeys(term);
				searchBox.submit();
				break;
			case "Bing":
				driver.get("https://www.bing.com/search?q=" + term);
				break;
			case "Yahoo":
				driver.get("https://ca.search.yahoo.com/search;_ylc=X3oDMTFiN25laTRvBF9TAzIwMjM1MzgwNzUEaXRjAzEEc2VjA3NyY2hfcWEEc2xrA3NyY2h3ZWI-?p=" + term);
				break;
			case "Newegg":
				driver.get("https://www.newegg.ca/Product/ProductList.aspx?Submit=ENE&DEPA=0&Order=BESTMATCH&Description=" + term);
				break;
			default:
				driver.get("https://www.google.ca/search?site=&source=hp&q=" + term);
				break;
		}	
		
	}	

}

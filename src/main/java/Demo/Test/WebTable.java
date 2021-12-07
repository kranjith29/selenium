package Demo.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// https://letcode.in/table
public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		
		//Access Table
		WebElement table = driver.findElement(By.id("simpletable"));
		//th --> table header
		List<WebElement> header = table.findElements(By.tagName("th"));
		System.out.println("++++++Header++++++++");
		for (WebElement title : header) {
			System.out.println(title.getText());
		}
		//Access allrows
		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		System.out.println("Row size: "+size);
		//System.out.println("++++++++Row | Column data+++++++");
		//Access column data in single row based on index
/*
		for (WebElement row : allrows) {
			List<WebElement> Column = row.findElements(By.tagName("td"));
			WebElement Column0_data = Column.get(0);
			WebElement Column1_data = Column.get(1);
			WebElement Column2_data = Column.get(2);
			System.out.print(Column0_data.getText()+" ");
			System.out.print(Column1_data.getText()+" ");
			System.out.print(Column2_data.getText());
			System.out.println();
		}		
*/
		for(int i=0;i<size;i++) {
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			WebElement lastname = rows.get(1);
			String text = lastname.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("Man")) {
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				System.out.println("Marked Man as Present");
				break;
			}
			
		}
		//driver.quit();
	
	 	
	  }
	}


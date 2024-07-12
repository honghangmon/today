import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://etk.srail.kr/main.do");
		
		//출발역, 수서 - selectByVisibleText 활용
		
		
		//도착역, 부산 - selectByValue 활용
		
		
		// 클릭
		driver.findElement(By.cssSelector("#search-form > fieldset > a")).click();
			
	}
}

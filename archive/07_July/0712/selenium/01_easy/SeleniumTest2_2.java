import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2_2 {
	public static void main(String[] args) {
		//크롬 드라이버 생성 후 가져오기
		WebDriver driver = new ChromeDriver();

		//드라이버야 네이버 열어줘
		driver.get("https://finance.naver.com/");

		//삼성전자를 검색해보자
		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));
		searchInput.click();

		// 삼성전자 검색
		searchInput.sendKeys("삼성전자");

		//엔터누름
		searchInput.sendKeys(Keys.ENTER);
	}
}

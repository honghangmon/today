import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2_1 {
	public static void main(String[] args) {
		// 크롬 드라이버 생성 후 가져오기
		WebDriver driver = new ChromeDriver();

		// 드라이버야 네이버 열어줘
		driver.get("https://www.naver.com");

		// 증권 버튼을 가져와죠
		WebElement financeBtn = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
	}
}

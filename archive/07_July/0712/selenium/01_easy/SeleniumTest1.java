import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
	public static void main(String[] args) {
		// 크롬 드라이버를 가져와 
		
		// 크롬 드라이버 생성 후 
		WebDriver driver = new ChromeDriver();
		
		// 드라이버야 네이버 열어줘
		driver.get("https://www.naver.com");
		 
		// 드라이버야 에듀싸피 열어줘
		driver.get("https://edu.ssafy.com");
		
	}
}

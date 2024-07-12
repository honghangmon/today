import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskorail.com");
		System.out.println(driver.getWindowHandles());

		//현재 핸들링 하고 있는 메인창의 이름을 저장
		String mainPage = driver.getWindowHandle();
		
		//모든 핸들링 창 반복 돌려
		for(String handle : driver.getWindowHandles()) {
			if(!handle.equals(mainPage)) {
				//드라이버야 지금 창을 바꾸고 그 창은 꺼버려
				driver.switchTo().window(handle).close();
			}
		}
		//main창으로 핸들러 바꾸기
		driver.switchTo().window(mainPage);
		
	}
}

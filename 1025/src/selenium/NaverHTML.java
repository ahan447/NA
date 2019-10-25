package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaverHTML {

	public static void main(String[] args) {
		try {
			// 드라이버 위치 등록
			System.setProperty("webdriver.chrome.driver", "/Users/tjoeun304/Downloads/chromedriver");
			// 크롬 실행
			WebDriver driver = new ChromeDriver();
			// 사이트접속
			// ChromeOptions options = new ChromeOptions();
			// options.addArguments("headless");
			// new ChromeDriver(options);

			driver.get("https://www.daum.net/");
			// ChromeOptions.get("https://www.daum.net/");
			// html을 가져와서 출력
			System.out.printf("%s\n", driver.getPageSource());
			// System.out.printf("%s\n", ChromeOptions.getPageSource());

			// driver.close();
		} catch (Exception e) {
			System.out.printf("크롬 실행 오류 : %s\n", e.getMessage());
		}

	}

}

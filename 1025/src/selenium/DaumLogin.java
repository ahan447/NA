package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DaumLogin {

	public static void main(String[] args) {
		try {
			// 드라이버 위치 등록
			System.setProperty("webdriver.chrome.driver", "/Users/tjoeun304/Downloads/chromedriver");
			// 크롬 실행
			WebDriver driver = new ChromeDriver();

			// 다음 로그인 페이지 접속
			driver.get(
					"https://xo.nate.com/Notfound.sk?redirect=https%3A%2F%2Fwww.nate.com%2F&cpurl=www_ndr.nate.com%252Flogin%252F&viewnid=&flag=Y&e_url=http%3A%2F%2Fwww.nate.com%2F&mode=#");

			Thread.sleep(5000);
			// id 란에 입력
			driver.findElement(By.xpath("//*[@id=\"uid\"]")).sendKeys("tidhdb12");
			;

			Thread.sleep(5000);
			// 비밀번호 란에 입력
			driver.findElement(By.xpath("//*[@id=\"upw\"]")).sendKeys("qwerty2323");
			;
			Thread.sleep(5000);
			// 로그인 버튼 클릭
			driver.findElement(By.xpath("//*[@id=\"tab_cont1\"]/div/input")).click();
			Thread.sleep(5000);
			// 메일 내게쓰기 가져오기
			Thread.sleep(5000);
			driver.get("http://mail3.nate.com/#write/?act=new&tome=Y");
			Thread.sleep(5000);

			// 여기부터 진행안됨

			// 제목 쓰기
			driver.findElement(By.xpath("//*[@id=\"nmWriteHeader\"]/div[4]/div[2]/div[1]/input")).sendKeys("자동 연습1");

			Thread.sleep(5000);
			// 내용 쓰기

			driver.findElement(By.xpath("//*[@id=\"pushTag_92fb385dd424d3\"]")).sendKeys("자동 연습12");
			Thread.sleep(5000);
			// 보내기 버튼 클릭

			driver.findElement(By.xpath("//*[@id=\"nmWriteCont\"]/div[1]/div[1]/div[1]/button")).click();

			/*
			 * //프레임 전환 driver.switchTo().frame( driver.findElement( By.id("down")));
			 * Thread.sleep(10000);
			 */

		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());

		}

	}

}

package verificationpoints;


import org.openqa.selenium.WebDriver;

	public class LoginVerificationPoint {
			private WebDriver driver;
			private String expectedMessage = "Dashboard";
			public LoginVerificationPoint(WebDriver driver) {
				this.driver = driver;
			}
		
		public void checkHelloMessage() {
			if(this.driver.getPageSource().contains(expectedMessage)){
				System.out.println("Entrou");
			} else {
				System.out.println("N�o encontrou");
			}
		}
	}
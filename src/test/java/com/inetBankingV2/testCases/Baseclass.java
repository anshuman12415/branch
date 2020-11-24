package com.inetBankingV2.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBankingV2.utilities.ReadConfig;

public class Baseclass {
	ReadConfig readconf = new ReadConfig();

	public String baseURL = readconf.getApplicationURL();
	public String username = readconf.getUsername();
	public String password = readconf.getPassword();
	public static WebDriver d;
	public static Logger log;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		Logger log = Logger.getLogger("Branch");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconf.getChromePath());
			d = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconf.getFirefoxPath());
			d = new FirefoxDriver();
		}
		d.get(baseURL);
	}

	@AfterClass
	public void teardown() {
		d.quit();
	}
}

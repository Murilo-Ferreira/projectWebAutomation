package core;

public class Config {
	
	public static Browsers browser = Browsers.FIREFOX;

	public enum Browsers {
		CHROME, FIREFOX, PHANTOM
	}

	// Project base directories
	public static String userDir = System.getProperty("user.dir");
	
	// Drivers path. Make sure to add ".exe" if you are using Windows based OS
	public static String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
	public static String firefoxDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe";
	public static String phantomDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/phantomjs";
}

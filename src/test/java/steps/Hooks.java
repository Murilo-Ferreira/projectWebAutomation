package steps;

import static core.DriverFactory.createDriver;
import static core.DriverFactory.getDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	

	@Before
	public void beforeScenario() {
		// Web driver setup
		System.out.println("Inicializando Driver\n");
		createDriver();
		System.out.println("Driver Inicializado\n");

	}

	@After
	public void afterScenario() {
		System.out.println("Finalizando driver\n");
		getDriver().quit();
		System.out.println("Driver Finalizado\n");
	}
}
package br.com.webstoretest.teste.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/report-html", "json:target/report.json" }, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false,
		strict = false, 
		glue = { "steps" },
		features = "src/test/resources/features/",
		tags = {"@OnlinePurchase"})
public class RunCucumberTest {

}
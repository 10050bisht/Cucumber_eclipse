package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Himanshu\\Eclipse_Workplace\\Cucumber_demo\\src\\main\\java\\Features\\Login.feature",
		glue={"C:\\Himanshu\\Eclipse_Workplace\\Cucumber_demo\\src\\main\\java\\StepDefination"},
		 format = { "pretty", "html-target" },
		 monochrome = true
				 )

public class TestRunner {
	
	
	
}

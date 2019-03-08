package StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\oxygen\\eclipse-workspace\\Guru99Site\\src\\test\\resources\\Feature\\HomePage.Feature",glue="StepDefinition",monochrome=false,plugin="html:target")



public class Runner {

}

package Terrunneramazon;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
            (
              features="C:\\Users\\HP\\Downloads\\Amazon (10)\\Amazon\\Features\\Map.feature",
              glue="StepDefinition",
              dryRun=false,
              monochrome=true,
              plugin= {"pretty", "html:target/HTMLReport"},
              tags= "@tag"
		     )
public class Maprun {

	
}

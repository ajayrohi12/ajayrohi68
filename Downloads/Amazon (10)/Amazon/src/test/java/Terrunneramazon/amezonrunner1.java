package Terrunneramazon;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
            (
              features="C://Users//Admin//eclipse-workspace//Amazon//Features//Amazon1.feature",
              glue="StepDefinition",
              dryRun=false,
              monochrome=true,
              plugin= {"pretty", "html:target/HTMLReport"},
              tags= "@tag"
		     )

public class amezonrunner1 {

}

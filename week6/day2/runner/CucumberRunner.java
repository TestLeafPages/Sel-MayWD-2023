package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features={"src/test/java/features"},
                 glue={"steps"},
                 monochrome=true,
                 publish = true,
                // tags="@Smoke")//to run only smoke scenarios
                  //  tags="@Smoke or @Regression"    )// execute either  scenarios
                // tags="not @Smoke")//to exclude a particular scenario
                 tags="@Smoke and @Functional")
public class CucumberRunner extends BaseClass{

}

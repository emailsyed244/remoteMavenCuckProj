package com.syed;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@Cucumber.Options(format={"html:output"},
				 features={"src/test/resources/com/syed/"},
				 glue="com.syed",
				 tags="@menu"
						   //,"src/test/resources/com/syed/menu.feature"}
 		            )
public class RunnerClass {

}

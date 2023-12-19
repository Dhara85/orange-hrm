package com.orangehrmlive.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       features = "src/test/resources/features",
        glue = "com/orangehrmlive/demo/steps", // path of source root starts frm com and not src
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, // make it cucumber.html and remove between that path
        tags = "@smoke"
          //      "@regression"
        //"@regression and not @smoke"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {

}

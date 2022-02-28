package com.ashley_ui.runners;

import com.ashley_ui.utilities.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.AfterAll;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        plugin = {"html:target/cucumber-report.html",
                  "json:target/cucumber.json",
                  "junit:target/junit/junit-report.xml",
                  "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/ashley_ui/step_definitions",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {


}


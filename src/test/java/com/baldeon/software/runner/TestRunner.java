package com.baldeon.software.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "C:\\ProyectosQA\\iokk\\src\\test\\resources\\features",
        glue = "com.baldeon.software.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {

}

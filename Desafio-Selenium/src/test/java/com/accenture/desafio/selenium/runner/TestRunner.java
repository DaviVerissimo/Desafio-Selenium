package com.accenture.desafio.selenium.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
    glue = "steps",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner { }
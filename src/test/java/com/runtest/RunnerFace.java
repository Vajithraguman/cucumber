package com.runtest;

import org.junit.runner.RunWith;

import cucumber.runtime.snippets.Snippet;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="com.step",dryRun=false,strict=false,tags="@Flipkart",
      plugin= {"html:C:\\Users\\HP\\eclipse-workspace\\FaceDataTableC\\Report\\html","junit:C:\\Users\\HP\\eclipse-workspace\\FaceDataTableC\\Report\\junitReport\\flip.xml",
    		  "json:C:\\Users\\HP\\eclipse-workspace\\FaceDataTableC\\Report\\json\\js.json"})
public class RunnerFace {

}

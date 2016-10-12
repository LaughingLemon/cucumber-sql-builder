/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaun.sqlbuilder;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Shaun
 */
public class SQLBuilderSteps {
    
    SQLBuilder builder = new SQLBuilder();
    
    @Given(".+table named '(.+)'")
    public void addTable(final String table) {
        builder = builder.table(table);
    }

    @When("all the fields are selected")
    public void selectAll() {
        builder = builder.select();
    }

    @When("fields (.+) are selected")
    public void selectAll(List<String> fields) {
        builder = builder.select(fields);
    }
    
    @Then("the returned statement will be '(.+)'")
    public void testBuild(final String returned) {
        assertThat(builder.build()).isNotEmpty().contains(returned);
    }
}

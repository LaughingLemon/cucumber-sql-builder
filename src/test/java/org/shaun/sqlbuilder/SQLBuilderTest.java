/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaun.sqlbuilder;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Shaun
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class SQLBuilderTest {
    
    public SQLBuilderTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
}

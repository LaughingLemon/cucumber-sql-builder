/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaun.sqlbuilder;

/**
 *
 * @author Shaun
 */
public class SQLBuilder {

    public SQLBuilder select() {
        return this;
    }

    public SQLBuilder table(String tableName) {
        return this;
    }

    public SQLBuilder where(String columnName, String value) {
        return this;
    }

    public String build() {
        return null;
    }

}

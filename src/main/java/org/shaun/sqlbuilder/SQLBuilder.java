/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shaun.sqlbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shaun
 */
public class SQLBuilder {

    private String tableName;
    private final List<String> fields = new ArrayList<>();

    public SQLBuilder select() {
        return this;
    }

    public SQLBuilder table(final String tableName) {
        this.tableName = tableName;
        return this;
    }

    public SQLBuilder where(final String columnName, final String value) {
        return this;
    }

    public String build() {
        return "SELECT " + fields.stream()
                                 .reduce((t, u) -> t + ", " + u)
                                 .orElse("*")
                         + " FROM " 
                         + this.tableName;
    }

    public SQLBuilder select(final List<String> fields) {
        this.fields.addAll(fields);
        return this;
    }

}

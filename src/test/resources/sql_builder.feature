Feature: SQL Builder Application
  Builds a SQL statement programmatically using the builder design pattern.
 
  Scenario: Simple select statement on a table.
    Given a table named 'PERSON'
    When all the records are selected
    Then the returned statement will be 'SELECT * FROM PERSON'

Feature: SQL Builder Application
  Builds a SQL statement programmatically using the builder design pattern.
 
  Scenario: Simple select statement on a table.
    Given a table named 'PERSON'
    When all the fields are selected
    Then the returned statement will be 'SELECT * FROM PERSON'
 
  Scenario: Select specific fields from a table.
    Given a table named 'PERSON'
    When fields ID, NAME are selected
    Then the returned statement will be 'SELECT ID, NAME FROM PERSON'
 
  Scenario: Select one field from a table.
    Given a table named 'PERSON'
    When fields ID are selected
    Then the returned statement will be 'SELECT ID FROM PERSON'

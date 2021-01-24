Feature: Calculator Functionality

  Background: Check Basic operations
    Given Application is Open
    When User Clicks on clear screen button
    When Enters the First Number

  Scenario: Addition
    And Enters the Addition Operation
    And Enters the Second Number
    And Clicks on Equal Operator
    Then Verify The Answer

  Scenario: Subtraction
    When Enters the First Number
    And Enters the Addition Operation
    And Enters the Second Number
    And Clicks on Equal Operator
    Then Verify The Answer

  Scenario: Multiplication
    When Enters the First Number
    And Enters the Addition Operation
    And Enters the Second Number
    And Clicks on Equal Operator
    Then Verify The Answer

  Scenario: Division
    When Enters the First Number
    And Enters the Addition Operation
    And Enters the Second Number
    And Clicks on Equal Operator
    Then Verify The Answer

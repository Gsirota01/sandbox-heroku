Feature: Context Menu
    Scenario: Verify that alert appear when right clicking inside Context Menu
    Given that the Heroku App site is open
    And access the 'Context Menu' test
    When right-clicking inside the box
    Then verify that an alert appears

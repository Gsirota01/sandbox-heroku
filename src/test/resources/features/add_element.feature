Feature: Add Element Functionality Check
  Scenario: Add an element and verify that it is present, and after removing it, verify that it is gone
    Given that the Heroku App site is open
    And access the 'Add/Remove Elements' test
    When a new element is added
    Then verify that the new element is present
    And remove the added element
    Then verify that the element disappears
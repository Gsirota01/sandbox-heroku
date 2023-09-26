Feature: Add Element Functionality Check
  Scenario: Add Element
    Given that the Heroku App site is open
    And I access the 'Add/Remove Elements' test
    When a new element is added
    Then verify that the new element is present
    And remove the added element
    Then verify that the element disappears
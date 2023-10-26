Feature: Disappearing Elements
  Scenario: Disappearing Elements
    Given that the Heroku App site is open
    And access the 'Disappearing Elements' test
    Then count all the present elements
    And refresh the page
    And verify if any element disappears
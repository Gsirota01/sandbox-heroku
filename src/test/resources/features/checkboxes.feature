Feature: Checkboxes
  Scenario: Checkboxes
    Given that the Heroku App site is open
    And access the 'Checkboxes' test
    When both checkboxes are selected
    Then verify the status of the checkboxes

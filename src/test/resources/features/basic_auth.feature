Feature: Basic Auth Functionality Check
  Scenario: Verify that the basic auth functionality works
    Given that the Heroku App site is open
    And access the 'Basic Auth' test
    When realize the login with the credentials
    Then the message 'Congratulations! You must have the proper credentials.' should be displayed
Feature: Check availability of Heroku site

#  Scenario: Add / Remove WebElement
#    Given that the Heroku App site is open
#    And the 'Add/Remove Elements' test is accessed
#    When a new element is added
#    Then verify that the new element is present
#    And remove the added element
#    Then verify that the element disappears
#
#  Scenario: Broken Images
#    Given that the Heroku App site is open
#    And the 'Broken Images' test is accessed
#    And check broken images
#
#  Scenario: Checkboxes
#    Given that the Heroku App site is open
#    And the 'Checkboxes' test is accessed
#    When both checkboxes are selected
#    Then verify the status of the checkboxes
#
#  Scenario: Context Menu
#    Given that the Heroku App site is open
#    And the 'Context Menu' test is accessed
#    When right-clicking inside the box
#    Then verify that an alert appears

  Scenario: Disappearing Elements
    Given that the Heroku App site is open
    And the 'Disappearing Elements' test is accessed
    Then count all the present elements
    And refresh the page
    And verify if any element disappears

  Scenario: Drag and Drop
    Given that the Heroku App site is open
    And the 'Drag and Drop' test is accessed
    Then drag the square A and drop in the position of square B

#  Scenario: Dropdown
#    Given that the Heroku App site is open
#    And the 'Dropdown' test is accessed
#
#  Scenario: Dynamic Controls
#    Given that the Heroku App site is open
#    And the 'Dynamic Controls' test is accessed
#
#  Scenario:
#    Given that the Heroku App site is open
#    And the '' test is accessed
#  Scenario:
#    Given that the Heroku App site is open
#    And the '' test is accessed
#  Scenario:
#    Given that the Heroku App site is open
#    And the '' test is accessed






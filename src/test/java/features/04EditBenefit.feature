Feature: Edit an Existing Benefit

  Scenario Outline: Edit an existing benefit
    Then User navigate to the Edit Benefit page
    When User edit the title"<title>"
    And User Click on the edit save button
    And User should navigate to Benefits List page After editing
    When User Click on the search field and enter the editing title "<editing title>"
    And click on search button

    Examples:
    |   title                |   editing title          |
    |   HelanaEditTheBenefit |   HelanaEditTheBenefit  |
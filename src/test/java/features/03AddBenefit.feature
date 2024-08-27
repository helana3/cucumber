Feature: Add a New Benefit

  Scenario Outline: Add a new benefit
    When User fill title "<title>"
    And User fill sub title "<subTitle>"
    And User select the Benefit Type
    And User selects the Countries
    And User fill the Profession
    And User fill the Brief Description "<Brief Description>"
    And User fill the details "<details>"
    And User Choose file1
    And User Choose file2
    And User click on save button
    Then User should navigate to Benefits List page
    When  User Click on search field and enter any "<search_title>"
    And  click on search button
    And Click on the benefit
    Then User should navigate to Benefit Details page
    And User click on edit button

Examples:
    |  title       |    subTitle                 |  Brief Description         |   details           | search_title         |
    |HelanaBenefit |    HelanaBenefitSubTitle    |  Helana_Brief_Descriptions |  Helana_emad_details|  HelanaBenefit|








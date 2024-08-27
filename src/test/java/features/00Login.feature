Feature: Test The login functionality

  Scenario Outline: Scenario: To login with valid email and valid password and add a benefit
    Given User open website and go to login page
    When User fill "<email>" and "<password>" and click on login
    Then User should navigate to home page


  Examples:
  |   email               |  password  |
  |   SPOCAgent1@evapharma.com | Eva-12345  |
















    #And User click on Benefit
    #And User selects Benefit List from the dropdown
    #Then User should navigate to Benefits List page
    #And User clicks on the Add Benefit button
#    Then User should navigate to the Add Benefit page
#    When User fill Title
#    And User fill Sub Title
#    And User select the Benefit Type
#    And User selects the Countries
#    And User fill the Profession
#    And User fill the Brief Description
#    And User fill the details
#    And User Choose file1
#    And User Choose file2
#   And User click on save button
#    Then User should navigate to Benefits List page
#    When User Click on search field and enter any title
#    And click on search button
#    And Click on the benefit
#    Then User should navigate to Benefit Details page
#    And User click on edit button
#    Then User navigate to the Edit Benefit page
#    When User edit the title
#    And User Click on the edit save button
#    And User should navigate to Benefits List page After editing
#    When User Click on the search field and enter the editing title
#    And click on search button





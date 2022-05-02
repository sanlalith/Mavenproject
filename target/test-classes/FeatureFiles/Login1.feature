  Feature: To validate login functionality in FB application

  Scenario: To validate login by using valid email and invalid pass
    Given User have to enter FB Login page
    When User have to enter valid email and invalid password
    And user have to click login button
    Then User have to be in invalid credential page.


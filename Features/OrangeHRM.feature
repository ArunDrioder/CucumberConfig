Feature: OrangeHRM Login
  Scenario: Logo Presence on OrangeHRM Home Page
    Given I launch chrome browser
    When I launch OrangeHRM Home page
    Then I verify that the logo present on that page
    And close the browser.
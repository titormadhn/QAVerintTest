Feature: Search Result Customer Solution
  @search
  Scenario: If the application is in the Search Result Page and Article Title contain “customer solution
    Given a web browser is at the Verint home page
    When the user click search icon
    And user enters search item
    Then user click search button
    And scroll to contain content
    And driver close
Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enter a text in asearch box
    And hits enters
    Then user is navigated to search results

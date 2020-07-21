Feature: Search

  Agile Story: As a user, I should be able to search when I am on Google search page.

  @scenarioOutline @google @smokw
  Scenario Outline: Google  title verification after search
    Given User is on the Google search page
    Then User should see title is Google
    When User searches "<searchValue>"
    Then User should see "<expectedTitle>" in the title

    Examples: Search values I want to search in Google
      | searchValue | expectedTitle |
      | apple       | apple         |
      | kiwi        | kiwi          |
      | orange      | orange        |






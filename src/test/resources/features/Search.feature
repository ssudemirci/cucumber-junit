Feature: Search

  Agile Story: As a user, I should be able to search when I am on Google search page.


  Scenario: Google default title verification
    Given User is on the login page
    Then User should see title is Google
@wip # work in progress
    Scenario: Google title verification after search
      Given User is on the Google search page
      When User search apple
      Then User should see apple in  the title






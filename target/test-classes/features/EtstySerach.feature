@etsyAll
Feature: Etsy search feature
  Agile story: User should be able to enter search terms and see
  relevant result in the page in the title

  Background: User is on the etsy home page
    Given User is on the etsy home page



  Scenario: Title verification
    Then User should see title is as expected
  #expected : Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
  @etsyWip
  Scenario: Title Verification after Search term
    When User searches "wooden spoon" is the search box
    And User clicks to search button
    Then User should see "Wooden spoon" in the etsy title



Feature: SmartBear order process
  Agile story: as a user should

  Background: User should be order page
    Given User is on the SmartBear login page
    And User is logged into SmartBear Tester account
    And User clicks to Order

  @smartBear
  Scenario: User verification

    Then User selects FamilyAlbum
    Then User enters "4" to quantity
    Then User enters John Wick to costumer name
    Then User enters Kinzie Ave to street
    Then User enters Chicago to city
    Then User enters IL to state
    Then User enters "60056"
    Then User selects Visa as card type
    Then User enters "1111222233334444" to card number
    Then User enters "12/22" to expiration date
    Then User clicks process button
    Then User verifies John Wick is in the list


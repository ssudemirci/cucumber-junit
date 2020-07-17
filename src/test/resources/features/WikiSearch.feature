

Feature: wiki title and search verification
  Background: User is on the Wiki home page
    Given User is on the Wiki home page
    @wiki
  Scenario: Search functionality title verification
    When User searches "Steve Jobs" in the  wiki search page
    Then User should see "Steve Jobs" in the wiki title



  #Scenario: Search functionality title verification
   # When User searches "Steve Jobs" in the  wiki search page
    #Then User should see "Steve Jobs" in the wiki title
    #Then User should see "Steve Jobs" in the main header
   # Then User should see "Steve Jobs" in the image header


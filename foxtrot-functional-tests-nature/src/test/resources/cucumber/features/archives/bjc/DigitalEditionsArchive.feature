@test @staging @live
Feature: BJC Digital Editions Archive

  Scenario: Digital Editions Archive navigation
    Given A user is on BJC main archive
    Then The user Should see a link to the Digital Editions Archive in the left navigation menu
    And The link should navigate to nature.com/bjc/digitaleditions/index.html

  Scenario: individual Digital editions pages navigation
    Given The user is on the BJC Digital Editions Archive page
    When The user clicks on a individual Digital editions page
    Then The user is taken to the nature.com login page to login using the correct subscription

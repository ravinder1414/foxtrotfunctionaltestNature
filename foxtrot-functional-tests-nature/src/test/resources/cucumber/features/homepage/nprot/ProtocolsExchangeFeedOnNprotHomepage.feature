@broken
Feature: Protocols Exchange Feed on Nature Protocols (nprot) Homepage
  User: I want to see some of the latest protocols published on protocol exchange so I can keep up-to-date

  Scenario: User is on Nature Protocols home page
    Given user is on Nature Protocols home page
    Then protocol exchange section appears directly below the first ad space in right column
    #And the section contains three most recent articles from protocol exchange
    And the section contains link 'Browse all from Protocol Exchange'
    When user clicks on link to 'Browse all from Protocol Exchange'
    Then they are taken to the protocol exchange home page

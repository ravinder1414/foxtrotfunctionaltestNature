@test @staging @live
Feature: Bioentrepreneur Feed on Nature Biotechnology (nbt) Homepage
  I want a feed of the most recent bioentrepreneur article with title, publication date, and some text so that it can be displayed in a section on the NBT homepage

  Scenario: User is browsing the Nature Biotechnology homepage
    Given the user is browsing the "nbt" homepage
    Then The Bioentrepreneur Feed appears on the page
    And The should display the heading 'Latest from bioentrepreneur'
    And Should have a link 'Browse all from Bioentrepreneur'
    When The user clicks on the link
    Then The user is navigated to the full Bioentrepreneur page

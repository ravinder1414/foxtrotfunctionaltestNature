@test @staging @live
Feature: 'Powered by Altmetric' text and link on full trending online page

  Background: 
    Given user is on the full trending online page

  Scenario: Altmetric text and link on full trending online page
    When Powered by Altmetric link is clicked
    Then explanation text appears
    And message should read: "This list is provided by an outside source, Altmetric, and contains articles from this journal ordered by the change in online attention in the last 7 days. Altmetric's measure of online attention, which primarily includes social media and mainstream news sources, takes into account the quantity of mentions of an article and the quality of each mention."
    And Altmetric text should link to http://www.altmetric.com
    When user clicks on link again
    Then text collapses

  @javascriptoff
  Scenario: Altmetric text and link when Javascript disabled on the full trending online page
    Then explanation text appears
    And Altmetric text should link to http://www.altmetric.com

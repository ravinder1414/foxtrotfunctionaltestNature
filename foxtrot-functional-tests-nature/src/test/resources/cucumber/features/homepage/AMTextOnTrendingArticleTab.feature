@test @staging @live
Feature: 'Powered by Altmetric' text and link on the trending online tab on a AIP journal homepage

  Background: 
    Given user is on an AIP homepage with trending online tab open

  Scenario: Altmetric text and link on trending article tab
    When Powered by Altmetric link is clicked
    Then explanation text appears
    And message should read: "This list is provided by an outside source, Altmetric, and contains articles from this journal ordered by the change in online attention in the last 7 days. Altmetric's measure of online attention, which primarily includes social media and mainstream news sources, takes into account the quantity of mentions of an article and the quality of each mention."
    And Altmetric text should link to http://www.altmetric.com
    When user clicks on link again
    Then text collapses

  @javascriptoff
  Scenario: Altmetric text and link when Javascript disabled on trending online tab
    Then no explanation text appears and a link to the full trending online page is given

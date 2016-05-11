@broken @cleanbrowser @staging @live
Feature: Athens Login

  Scenario: Login via Athens Nature
    Given I navigate to nature APS journal access page
    And I click on Article 'Login via Athens' link
    And It navigates to the Athens login page
    When I enter valid Athens credentials and click on login button
    Then I can get full access for APS journal

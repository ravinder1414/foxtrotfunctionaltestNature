@broken @cleanbrowser @test @live
Feature: Shibboleth Login Nature

  Scenario: Login via Shibboleth Nature
    Given I navigate to nature.com login page
    When I click on 'Login via institution' link
    And I select 'United Kingdom' from the country's drop down and click on Go button
    When I search for 'University of Portsmouth'in Institution search box and click on search button
    And I click on 'University of Portsmouth'link
    And I enter credentials on university login page
    Then It redirects to the nature.com homepage

  Scenario: Get full text access of a paid article by Login via Shibboleth
    Given I navigate to NM journal access page
    When I click on article 'Login via institution' link
    And I select 'United Kingdom' from the country's drop down and click on Go button
    When I search for 'University of Portsmouth'in Institution search box and click on search button
    And I click on 'University of Portsmouth'link
    And I enter credentials on university login page
    Then I should get full text access for NM journal for valid site account

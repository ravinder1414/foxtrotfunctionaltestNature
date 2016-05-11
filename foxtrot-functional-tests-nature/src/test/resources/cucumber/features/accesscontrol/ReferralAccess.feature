@broken @staging @live
Feature: Referral Access functionality

@cleanbrowser
Scenario: I want to access an article by Referral Access when Referral URL is based on HTTP protocol
Given I visit to an article access page of 'EYE' journal on nature.com
When I click on 'RCO' society link on article page, I redirect to society page
And Click on a link on 'RCO' society page which redirects me back to an article page on nature.com
Then I should get access to full text article of 'EYE' journal on nature.com


Scenario: I want to access an article by Referral Access when Referral URL is based on HTTPS protocol
Given I visit to an article access page of 'GIM' journal on nature.com
When I click on 'ACMG' society link on article page, I redirect to society page
And Click on a link on 'ACMG' society page which redirects me back to an article page on nature.com
Then I should get access to full text article of 'GIM' journal on nature.com
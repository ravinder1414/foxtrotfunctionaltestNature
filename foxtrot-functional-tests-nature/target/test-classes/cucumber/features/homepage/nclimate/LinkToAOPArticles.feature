@broken
Feature: Link to AOP Articles page on a journal homepage

Background:
Given user is on the NClimate homepage

Scenario: User is browsing the homepage with Javascript enabled
Then there is a link to the advance online publication page available

@javascriptoff
Scenario: User is browsing the homepage with Javascript disabled
Then there is a link to the advance online publication page available



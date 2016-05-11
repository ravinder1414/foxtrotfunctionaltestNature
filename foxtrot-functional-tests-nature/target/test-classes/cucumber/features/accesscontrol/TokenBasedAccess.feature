@to_automate
Feature: Token Based  access control

As a nature user accessing nature.com from an institution with Token based Access
I want to be able to access content 

Scenario: WebAdmin Login
Given I am on WebAdmin Login Page
When  I enter valid credentials
Then  Login should be successful
	
Scenario: Add Site Licence - 8469
Given I login WebAdmin with valid credentials
When  I add Site Licence -8469
Then  New Site Licence should be added		
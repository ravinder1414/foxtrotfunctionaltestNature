@to_automate
Feature: AOD access control

As a nature user accessing nature.com from an institution with an AOD licence
I want to be able to access content 


Scenario: Corporate Unmediated AOD Access -User granted Access
Given I am in within the IP range of an institution which has Corporate Unmediated AOD access
When I attempt to access a standard article
Then I am granted access via Corporate Unmediated AOD Access
And the number of units is decreased by 1 for Corporated UnMediated AOD acess


Scenario: Corporate Mediated AOD Access -User granted Access
Given I am in within the IP range of an institution which has Corporate Mediated AOD access
When I attempt to access a standard article 
Then I should see a password screen 
When I enter a valid password 
Then I am granted access via Corporate Mediated AOD Access
And the number of units is decreased by 1 for Corporated Mediated AOD acess


Scenario: Corporate Mediated AOD Access -User denied Access
Given I am in within the IP range of an institution which has Corporate Mediated AOD access
When I attempt to access a standard article 
Then I should see a password screen  
When I enter a invalid password 
Then I am denied access via Corporate Mediated AOD Access


Scenario: Licensed Unmediated AOD access - User granted Access to a SciBX article
Given I am in within the IP range of an institution which has Licensed Unmediated AOD access units
When I attempt to access a SciBX article
Then I am granted access via Licensed Unmediated AOD access
And the number of units is decreased by 1 for Licensed Unmediated AOD access


Scenario: Licensed Mediated AOD access - User granted Access to a SciBX article
Given I am in within the IP range of an institution which has Licensed Mediated AOD access units
When I attempt to access a SciBX article
Then I should see a password screen 
When I enter a valid password
Then I am granted access via Licensed Mediated AOD access
And the number of units is decreased by 1 for Licensed Mediated AOD access


Scenario: Licensed Mediated AOD access - User denied Access to a SciBX article
Given I am in within the IP range of an institution which has Licensed Mediated AOD access units
When I attempt to access a SciBX article
Then I should see a password screen 
When I enter a invalid password 
Then I am denied access via Licensed Mediated AOD access


@broken
Feature: Myaccount

Scenario: User Myaccount valid login flow access
Given user navigate to myaccount page
When user enter valid usercredentials and click on Login button
Then user see the profile page
	    
Scenario: When User edit the address details  
Given user navigate to myaccount page
And user click on edit button on profile tab
And user modify their address details
When user click on confirm button
Then user should be able to see the modified address details
          
@to_automate   
Scenario: When User change the password
Given user navigate to myaccount page
And  user click on edit password button on profile tab
And user modify their password details
When user click on password change confirm button
Then user should be able to see the password change message
    
@to_automate
Scenario: Change password Email verification and confirmation
Given user navigate to mailinator mail box
When user click on email verification link
Then user navigate to myaccount page
And user enter valid new usercredentials and click on Login button
Then user see the profile page

@to_automate  
Scenario: When User change  the password again
Given user navigate to myaccount page
And  user click on edit password button on profile tab
And user modify their password newly details
When user click on password change confirm button
Then user should be able to see the password change message
    
@to_automate
Scenario: Change password Email verification and confirmation
Given user navigate to mailinator mail box
When user click on email verification link
Then user navigate to myaccount page
And user enter valid again new usercredentials and click on Login button
Then user see the profile page
          
Scenario: When User edit their additional information
Given user navigate to myaccount page
And  user click on edit button on additional information
And user modify their Work details
When user click on confirm button of work details
Then user should be able to see the modified work details
    
Scenario: User Myaccount alerts flow
Given user navigate to myaccount page
And user has not signed up to receive any NPG Updates and Alerts 
When user click on alerts tab
And user click on modify button
And user select ealerts and click on confirm button
Then user should be able to see the selected ealerts
    
Scenario: When User unselect e-alerts
Given user navigate to myaccount page
When user click on alerts tab
And user click on modify button
And user unselect ealerts and click on confirm button
Then user should not be able to see the selected ealerts
    
Scenario: User Myaccount subscription and purchase
Given user navigate to myaccount page
When user click on subscription and purchase tab
Then user should be able to see the assigned subscription 
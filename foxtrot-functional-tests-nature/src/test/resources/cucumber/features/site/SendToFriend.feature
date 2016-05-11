@broken @cleanbrowser

Feature: Email An Article Link to a Friend  

Scenario: As a nature.com user I should not be able to email an article link to a friend if I am not providing all require information.
Given I am a user on nature.com and I navigate to send an email to friend form
When  I don't fill up all the mandatory fields and submit the send email form 
Then  I should see error messages on send email to friend form

Scenario: As a nature.com user I should be able to email an article link to a friend 
Given I am a user on nature.com and I navigate to send an email to friend form
When  I fill up required information and submit the send email form 
Then  I should see email confirmation message
@to_automate @cleanbrowser 

Feature: Nature.com registration via alhambra

As a brand new user,I should be able to successfully register on nature.com

@to_automate
Scenario: I am new user registering at nature.com via alhambra if js is enabled
Given I have no account on nature.com
When I fill up information required on step 1 registration
Then Defaults should be loaded (Location based on Locale, Organizaion) on step 2
And Default ealerts should appear


Scenario: I am new registrants, I should see a page asking to verify my email address at the end of registration process if js is enabled
Given I have no account on nature.com
When I fill up required information on step 2 when javascript is enabled
Then I should see a confirmation page stating to verify my email

@to_automate
Scenario: I am new user registering at nature.com via alhambra if js is disabled
Given I have no account on nature.com
When I fill up information required on step 1 registration
Then Defaults should be loaded (Location based on Locale, Organizaion) on step 2
And Default ealerts should appear

@to_automate
Scenario: I am new registrants, I should see a page asking to verify my email address at the end of registration process if js is disabled
Given I have no account on nature.com
When I fill up required information on step 2 when javascript is disabled
Then I should see a confirmation page stating to verify my email

@to_automate
Scenario: I am new user, I should be able to register on nature.com via alhambra
Given I have no account on nature.com
When I don't fill up all the mandatory fields on step 1
Then I should see error messages on step 1

@to_automate
Scenario: I am new user, I should be able to register on nature.com from srep homepage via alhambra
Given I have no account on nature.com and I click 'register' on srep homepage
When I fill up information required on step 1 registration
Then Defaults should be loaded (Location based on Locale, Organizaion) on step 2
And Default E-alerts for that journal should appear


Scenario: I am new user, I should be able to register on nature.com from srep homepage via alhambra
Given I have no account on nature.com and I click 'register' on srep homepage
When I fill up required information on step 2 when javascript is enabled
Then I should see a confirmation page stating to verify my email


Scenario: I am new user, I should be able to register on nature.com via alhambra if js is enabled
Given I have no account on nature.com
When I fill up information required on step 1 registration
And I don't fill up all the mandatory fields on step 2
Then I should see error messages on step 2


Scenario: I am a logged in user on nature.com I should not be able to register
Given I am logged in nature.com
When I try to register from nature.com page
Then I should see a message that I am already logged in

@to_automate
Scenario: As a user, I should be able to verify my email if I have completed the registration started on nature.com page
Given I have successfully completed the registration process on nature.com
When I go to my mailbox
Then I should see a verification email
And when I click on verify link
Then I should be taken to nature.com page and I should be logged in

@to_automate
Scenario: As a user, I should be able to verify my email (session valid) 
Given I have successfully registered on nature.com
When I go to my mailbox
And I click on the link in the verification email
Then I should be taken to journal page and I should be logged in

@to_automate
Scenario: As a user, I should be able to verify my email (session expired) 
Given I have successfully registered on nature.com
When I click on the link in the verification email
Then I should be asked to enter my credentials at Alhambra 
And I should be taken to journal page and I should be logged in

@to_automate
Scenario: I am a new user, and I try to register with a email address which is already used in nature.com
Given I am using an email account which is already in use at nature.com
When I fill up information required on step 1 registration and I am redirected to step 2 at nature
Then I should see login page with a message that this account already exists

@to_automate
Scenario: I am a new nature.com user, with an already verified email address
Given I am registering at nature.com and I use an already verified email address
When I fill in step 2 registration information
Then I should be redirected to the page at Nature where I clicked register on
And I should be logged in
@test @staging @live
Feature: Zmags box on Nature Biotechnology (nbt) Homepage

Scenario: User is browsing the Nature Biotechnology homepage
Given the user is browsing the "nbt" homepage
Then The Zmags box appears on the page
And The should display the text 'The free magazine for business partnerships'
When The user clicks on the box
Then The user is navigated to the biopharmadealmakers zmag page
@broken
Feature: 'Corresponding author' label in the author popup

Scenario: As a corresponding author for a paper, I want the author information pop-up to include the label of 'corresponding author' with my name under it linked to the email form.
Given an article has one or more authors that are corresponding authors
When the name of one of the authors that is a corresponding author is clicked
Then the author information pop-up opens and contains a heading 'Corresponding author'
And the link to contact the author appears below

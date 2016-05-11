Feature: Bonekey Homepage links

Scenario: User is browsing Bonekey homepage

Given user is on Bonekey homepage
When user clicks Current Issue link
Then page navigates to http://www.nature.com/bonekey/archive/issue/bonekeyreports.html

Given user is on Bonekey homepage
When Current Issue cover
Then page navigates to http://www.nature.com/bonekey/archive/issue/bonekeyreports.html

Given user is on Bonekey homepage
When user clicks on Subscribe link
Then page navigates to http://www.nature.com/bonekey/about/subscription/index.html

Given user is on Bonekey homepage
When user clicks on recommend to library link
Then page navigates to http://www.nature.com/librec/svc/request/makeProdRequest?id=bonekeyreports

Given user is on Bonekey homepage
When user clicks on link to Bonekey Reports
Then page navigates to http://www.nature.com/bonekey/bonekeyreports/index.html
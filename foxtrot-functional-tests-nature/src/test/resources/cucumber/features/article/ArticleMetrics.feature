@test @staging @live
Feature: Browse article metrics

Scenario: I am a user browsing nature.com to see metrics of article with doi nature12512
Given I navigate to article "nature/journal/v502/n7469/abs/nature12593.html"
When  I click on article metrics link
Then  I can see citations of this article
And   I can see article metrics score of this article

Scenario: I am a user browsing nature.com to see metrics of article with doi 481139a
Given I navigate to article "nature/journal/v481/n7380/abs/481139a.html"
When  I click on article metrics link
Then  I can see citations of this article
And   I can see article metrics score of this article

Scenario: I am a user browsing nature.com to see metrics of article with doi 481137a
Given I navigate to article "nature/journal/v469/n7330/abs/469309a.html"
When  I click on article metrics link
Then  I can see citations of this article
And   I can see article metrics score of this article
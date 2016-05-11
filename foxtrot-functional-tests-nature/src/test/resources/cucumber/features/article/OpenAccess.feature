
Feature: Open Access

Scenario: Open Flag

         Given I am browsing a journal homepage
         And the homepage contains open access articles
	  	 When I click on an open access article
	 	 Then I should see an open Label on the article page
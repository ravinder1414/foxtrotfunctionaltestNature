@broken

Feature: latest research articles with associated 'News and Views' articles

Scenario: See also article on the latest research full page has one author 
Given an article which has a linked 'News and Views' with one author appears on the full latest research page
Then See also: 'article type name' by 'author name' displays with the article
When user clicks on link they go to the related article

Scenario: See also article on the latest research full page has multiple authors 
Given an article which has a linked  'News and Views' article with multiple authors appears on the full latest research page
Then See also: 'article type name' by 'author name et al.' displays with the article
When user clicks on link they go to the related article with multiple authors

Scenario: See also article on the latest research tab on a journal homepage has one author 
Given an article which has a linked 'News and Views' with one author appears on the latest research tab on a journal homepage
Then See also: 'article type name' by 'author name' displays with the article
When user clicks on link they go to the related article

Scenario: See also article on the latest research tab on a journal homepage has one author 
Given an article which has a linked  'News and Views' article with multiple authors appears on the latest research tab on a journal homepage
Then See also: 'article type name' by 'author name et al.' displays with the article
When user clicks on link they go to the related article with multiple authors
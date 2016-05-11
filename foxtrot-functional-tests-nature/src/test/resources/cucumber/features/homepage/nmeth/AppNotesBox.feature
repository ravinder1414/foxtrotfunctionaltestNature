@test @staging @live
Feature: Application notes box on Nature Methods (nmeth) homepage
  
    Box appears below first advertising slot and above Nature Innocentive box
    Can contain one featured note (as link) with sponsor company name
    Can contain up to six application notes from other companies
    Has link to application notes database page: http://www.nature.com/app_notes/nmeth/index.html

  Scenario: As an Nmeth sponsor I want to see my featured application note on the Nature Methods homepage along with up to six company names with links to their application notes
    Given I am on Nature Methods homepage
    Then application notes box appears in the right hand column
    And contains one featured appnote under a heading 'Featured Application Note' 
    And can contain upto six other appnotes
    And has a link to application notes database page
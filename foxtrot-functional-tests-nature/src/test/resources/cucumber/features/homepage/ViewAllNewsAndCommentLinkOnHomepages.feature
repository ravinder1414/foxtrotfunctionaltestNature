@test
Feature: View All news & comment or View all comment link on AIP Journal Homepages

  Scenario Outline: User is browsing 'News & comment' content on the "<journal>" homepage
    Given user is on the 'News & comment' tab on "<journal>"
    Then 'View all news & comment' link is available
    When user clicks on the 'View all news & comment'
    Then user navigates to the 'News & comment' page for "<journal>"

    Examples: 
      | journal  |
      | nbt      |
      | nm       |
      | nclimate |

  Scenario Outline: User is browsing 'Comment' content on the "<journal>" homepage
    Given user is on the 'Comment' tab on "<journal>"
    Then 'View all comment' link is available
    When user clicks on the 'View all comment'
    Then user navigates to the 'Comment' page for "<journal>"

    Examples: 
      | journal |
      | nmeth   |
      | ng      |
      | nsmb    |
      | ni      |
      | ncb     |

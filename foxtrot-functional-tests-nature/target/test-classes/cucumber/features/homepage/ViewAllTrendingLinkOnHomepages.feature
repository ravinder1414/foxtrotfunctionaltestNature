@test @staging @live
Feature: View All Trending online link on AIP Journal Homepages

  Scenario Outline: User is browsing 'Trending online' content on the "<journal>" homepage
    Given user is on the 'Trending online' tab on "<journal>"
    Then 'View all Trending online' link is available
    When user clicks on the 'View all trending online'
    Then user navigates to the 'Trending articles' page for "<journal>"

    Examples: 
      | journal  |
      | nbt      |
      | nchembio |
      | nprot    |
      | nmeth    |
      | ng       |
      | nm       |
      | nsmb     |
      | nclimate |
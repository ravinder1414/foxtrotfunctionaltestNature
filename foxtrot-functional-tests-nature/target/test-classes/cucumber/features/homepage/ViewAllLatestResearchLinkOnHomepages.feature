@test @staging @live 
Feature: View All Latest research link on AIP Journal Homepages

  Scenario Outline: User is browsing 'Latest research' content on the "<journal>" homepage
    Given user is on the 'Latest research' tab on "<journal>"
    Then 'View all research' link is available
    When user clicks on the 'View all research'
    Then user navigates to the 'research' page for "<journal>"

    Examples: 
      | journal  |
      | nbt      |
      | nchembio |
      | nmeth    |
      | ng       |
      | nsmb     |
      | nm       |      
      | nclimate |
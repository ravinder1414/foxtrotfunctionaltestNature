@test @staging @live
Feature: View All Most read link on AIP Journal Homepages

  Scenario Outline: User is browsing 'Most read' content on the "<journal>" homepage
    Given user is on the 'Most read' tab on "<journal>"
    Then 'View all most read' link is available
    When user clicks on the 'View all most read'
    Then user navigates to the 'most read' page for "<journal>"

    Examples: 
      | journal  |
      | nbt      |
      | nchembio |
      | nprot    |
      | nmeth    |
      | ng       |
      | nsmb     |
      | nm       |
      | nclimate |

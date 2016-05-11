@test @staging @live
Feature: Announcements on AIP homepages
  I want to see more text for announcements (upto 325 characters) so that I can read more information

  Scenario Outline: User is browsing an RJ homepage in the AIP template
    Given the user is browsing the "<journal>" homepage
    And If one or more annuncements displayed on the page
    Then the maximum number of characters for each annoucement should be "325"

    Examples: 
      | journal  |
      | nbt      |
      | nchembio |
      | nm       |
      | nprot    |
      | nmeth    |
      | ng       |
      | ncb      |
      | nsmb     |
      | ni       |
      | ngeo     |
      | nphys    |
      | nclimate |
      | nnano    |
      | neuro    |
      | nmat     |
      | nchem    |
      | nphoton  |

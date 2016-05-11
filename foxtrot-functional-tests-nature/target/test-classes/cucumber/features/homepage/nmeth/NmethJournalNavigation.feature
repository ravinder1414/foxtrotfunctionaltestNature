@broken @test @staging @live
Feature: Global journal navigation for Nature Methods (nmeth) journal with level one and two links

  Background: 
    Given the user is browsing the "nmeth" homepage

  Scenario Outline: global navigation Level one links on the nmeth Homepage
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text     | link                                       | selector       |
      | Home     | nature.com/nmeth/index.html                | home           |
      | Comment  | nature.com/nmeth/newsandcomment/index.html | newsAndComment |
      | Research | nature.com/nmeth/research/index.html       | research       |

  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user clicks on the 'Archive' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                            | link                                   | selector      |
      | Archive by issue                | nature.com/nmeth/archive/index.html    | archiveIssue  |
      | Archive by category             | nature.com/nmeth/archive/category.html | archiveCat    |
      | Specials, focuses & supplements | nature.com/nmeth/focsup_index.html     | archiveReport |

  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user clicks on the 'Authors & referees' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                         | selector   |
      | Guide to authors | nature.com/nmeth/authors/index.html          | authorsGta |
      | For referees     | nature.com/authors/policies/peer_review.html | authorsRef |

  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user clicks on the 'About the journal' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                 | link                                      | selector         |
      | About Nature Methods | nature.com/nmeth/authors/index.html#aims  | aboutJournal     |
      | Press releases       | nature.com/nmeth/press_release/index.html | aboutPress       |
      | Contact the journal  | nature.com/nmeth/contact/index.html       | aboutContact     |
      | For advertisers      | nature.com/advertising/                   | aboutAdvertising |
      | For librarians       | nature.com/libraries/index.html           | aboutLibrarians  |

@broken @test @staging @live
Feature: Global journal navigation for Nature Structural & Molecular Biology (nsmb) journal with level one and two links when Javascript is disabled

  Background: 
    Given the user is browsing the "nsmb" homepage

  @javascriptoff
  Scenario Outline: global navigation Level one links on the nsmb Homepage
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text     | link                                      | selector       |
      | Home     | nature.com/nsmb/index.html                | home           |
      | Comment  | nature.com/nsmb/newsandcomment/index.html | newsAndComment |
      | Research | nature.com/nsmb/research/index.html       | research       |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user hovers on the 'Archive' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                  | link                                  | selector      |
      | Archive by issue      | nature.com/nsmb/archive/index.html    | archiveIssue  |
      | Archive by category   | nature.com/nsmb/archive/category.html | archiveCat    |
      | Focuses & supplements | nature.com/nsmb/focsup_index.html     | archiveReport |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user hovers on the 'Authors & referees' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                         | selector   |
      | Guide to authors | nature.com/nsmb/authors/index.html           | authorsGta |
      | For referees     | nature.com/authors/policies/peer_review.html | authorsRef |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user hovers on the 'About the journal' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                                        | link                                                 | selector         |
      | About Nature Structural & Molecular Biology | nature.com/nsmb/authors/index.html#aims-scope        | aboutNSMB        |
      | About the editors                           | nature.com/nsmb/about/about_eds/index.html           | aboutEds         |
      | Press releases                              | nature.com/nsmb/press_releases/index.html            | aboutPress       |
      | Contact the journal                         | nature.com/nsmb/contact/index.html                   | aboutContact     |
      | Subscribe                                   | nature.com/ecommerce/subscribe.action?productId=nsmb | aboutSubInfo     |
      | For advertisers                             | nature.com/advertising/                              | aboutAdvertising |
      | For librarians                              | nature.com/libraries/index.html                      | aboutLibrarians  |
      | Conferences                                 | nature.com/nsmb/info/info-conf.html                  | aboutConferences |
      | NSMB Reviewers                              | nature.com/nsmb/reviewers/index.html                 | aboutReviewers   |

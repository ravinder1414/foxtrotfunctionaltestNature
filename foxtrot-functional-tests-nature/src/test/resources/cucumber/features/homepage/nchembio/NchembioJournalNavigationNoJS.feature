@broken @test @staging @live
Feature: Global journal navigation for Nature Chemical Biology (nchembio) journal with level one and two links when Javascript is disabled

  Background: 
    Given the user is browsing the nchembio homepage

  @javascriptoff
  Scenario Outline: global navigation Level one links on the nchembio Homepage
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text     | link                                          | selector       |
      | Home     | nature.com/nchembio/index.html                | home           |
      | Comment  | nature.com/nchembio/newsandcomment/index.html | newsAndComment |
 #     | Research | nature.com/nchembio/research/index.html       | research       |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user hovers on the 'Archive' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                            | link                                      | selector       |
      | Archive by issue                | nature.com/nchembio/archive/index.html    | archiveIssue   |
      | Archive by category             | nature.com/nchembio/archive/category.html | archiveCat     |
      | Specials, focuses & supplements | nature.com/nchembio/focsup_index.html     | archiveReport  |
      | Chemical probes                 | nature.com/nchembio/chemical_probes.html  | chemicalProbes |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user hovers on the 'Authors & referees' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                         | selector   |
      | Guide to authors | nature.com/nchembio/authors/index.html       | authorsGta |
      | For referees     | nature.com/authors/policies/peer_review.html | authorsRef |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user hovers on the 'About the journal' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                          | link                                                     | selector         |
      | About Nature Chemical Biology | nature.com/nchembio/authors/index.html#aim               | aboutNChemBio    |
      | About the editors             | nature.com/nchembio/about/about_eds/index.html           | aboutEds         |
      | Press releases                | nature.com/nchembio/press_releases/index.html            | aboutPress       |
      | Contact the journal           | nature.com/nchembio/contact/index.html                   | aboutContact     |
      | Subscribe                     | nature.com/ecommerce/subscribe.action?productId=nchembio | aboutSubInfo     |
      | For advertisers               | nature.com/advertising/                                  | aboutAdvertising |
      | For librarians                | nature.com/libraries/index.html                          | aboutLibrarians  |

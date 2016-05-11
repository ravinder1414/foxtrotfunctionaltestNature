@test @staging
Feature: Global journal navigation for Nature Immunology (ni) journal with level one and two links when Javascript is disabled

  Background: 
    Given the user is browsing the "ni" homepage

  @javascriptoff
  Scenario Outline: global navigation Level one links on the ni Homepage
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text     | link                                    | selector       |
      | Home     | nature.com/ni/index.html                | home           |
      | Comment  | nature.com/ni/newsandcomment/index.html | newsAndComment |
      | Research | nature.com/ni/research/index.html       | research       |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user hovers on the 'Archive' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                  | link                                | selector      |
      | Archive by issue      | nature.com/ni/archive/index.html    | archiveIssue  |
      | Archive by category   | nature.com/ni/archive/category.html | archiveCat    |
      | Focuses & supplements | nature.com/ni/focsup_index.html     | archiveReport |
      | Podcast               | nature.com/ni/podcast/index.html    | podcast       |
      | Multimedia            | nature.com/ni/multimedia/index.html | multimedia    |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user hovers on the 'Authors & referees' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                         | selector   |
      | Guide to authors | nature.com/ni/authors/index.html             | authorsGta |
      | For referees     | nature.com/authors/policies/peer_review.html | authorsRef |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user hovers on the 'About the journal' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                    | link                                               | selector         |
      | About Nature Immunology | nature.com/ni/authors/index.html#aims-scope        | aboutThisJournal |
      | About the editors       | nature.com/ni/about/about_eds/index.html           | aboutEds         |
      | Press releases          | nature.com/ni/press_release/index.html             | aboutPress       |
      | Contact the journal     | nature.com/ni/contact/index.html                   | aboutContact     |
      | Subscribe               | nature.com/ecommerce/subscribe.action?productId=ni | aboutSubInfo     |
      | For advertisers         | nature.com/advertising/                            | aboutAdvertising |
      | For librarians          | nature.com/libraries/index.html                    | aboutLibrarians  |
      | Permissions             | nature.com/reprints/index.html                     | aboutPermissions |

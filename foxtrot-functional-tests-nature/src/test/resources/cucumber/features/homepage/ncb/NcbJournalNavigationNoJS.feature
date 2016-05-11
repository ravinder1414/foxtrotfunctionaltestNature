@test @staging
Feature: Global journal navigation for Nature Cell Biology (ncb) journal with level one and two links when Javascript is disabled

  Background: 
    Given the user is browsing the "ncb" homepage

  @javascriptoff
  Scenario Outline: global navigation Level one links on the ncb Homepage
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text     | link                                     | selector       |
      | Home     | nature.com/ncb/index.html                | home           |
      | Comment  | nature.com/ncb/newsandcomment/index.html | newsAndComment |
      | Research | nature.com/ncb/research/index.html       | research       |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user hovers on the 'Archive' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                  | link                                 | selector      |
      | Archive by issue      | nature.com/ncb/archive/index.html    | archiveIssue  |
      | Archive by category   | nature.com/ncb/archive/category.html | archiveCat    |
      | Focuses & supplements | nature.com/ncb/focsup_index.html     | archiveReport |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user hovers on the 'Authors & referees' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                    | link                                         | selector               |
      | Guide to authors        | nature.com/ncb/authors/index.html            | authorsGta             |
      | For referees            | nature.com/authors/policies/peer_review.html | authorsRef             |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user hovers on the 'About the journal' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                      | link                                                | selector         |
      | About Nature Cell Biology | nature.com/ncb/authors/index.html#aims-scope        | aboutNCB         |
      | Press releases            | nature.com/ncb/press_release/index.html             | aboutPress       |
      | Contact the journal       | nature.com/ncb/contact/index.html                   | aboutContact     |
      | Subscribe                 | nature.com/ecommerce/subscribe.action?productId=ncb | aboutSubInfo     |
      | For advertisers           | nature.com/advertising/                             | aboutAdvertising |
      | For librarians            | nature.com/libraries/index.html                     | aboutLibrarians  |

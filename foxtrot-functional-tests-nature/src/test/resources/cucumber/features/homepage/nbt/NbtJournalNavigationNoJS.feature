@broken @staging @live
Feature: Global journal navigation for Nature Biotechnology (nbt) journal with level one and two links when Javascript is disabled

  Background: 
    Given the user is browsing the "nbt" homepage

  @javascriptoff
  Scenario Outline: global navigation Level one links on the nbt Homepage
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text           | link                                     | selector       |
      | Home           | nature.com/nbt/index.html                | home           |
      | News & comment | nature.com/nbt/newsandcomment/index.html | newsAndComment |
      | Research       | nature.com/nbt/research/index.html       | research       |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user hovers on the 'Archive' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                  | link                                 | selector      |
      | Archive by issue      | nature.com/nbt/archive/index.html    | archiveIssue  |
      | Archive by category   | nature.com/nbt/archive/category.html | archiveCat    |
      | Focuses & supplements | nature.com/nbt/focsup_index.html     | archiveReport |
      | Podcast               | nature.com/nbt/podcast/index.html    | podcast       |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user hovers on the 'Authors & referees' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                   | selector   |
      | Guide to authors | nature.com/nbt/authors/index.html      | authorsGta |
      | For referees     | nature.com/authors/policies/index.html | authorsRef |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user hovers on the 'About the journal' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                       | link                                                | selector         |
      | About Nature Biotechnology | nature.com/nbt/authors/index.html#aims              | aboutThisJournal |
      | About the editors          | nature.com/nbt/about/about_eds/index.html           | aboutEds         |
      | Press releases             | nature.com/nbt/press_release/index.html             | aboutPress       |
      | Contact the journal        | nature.com/nbt/contact/index.html                   | aboutContact     |
      | Subscribe                  | nature.com/ecommerce/subscribe.action?productId=nbt | aboutSubInfo     |
      | For advertisers            | nature.com/advertising/                             | aboutAdvertising |
      | For librarians             | nature.com/libraries/index.html                     | aboutLibrarians  |

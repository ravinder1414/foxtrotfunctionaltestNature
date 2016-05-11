@broken @test @staging @live
Feature: Global journal navigation for Nature Climate Change (nclimate) journal with level one and two links when Javascript is disabled

  Background: 
    Given the user is browsing the Nclimate homepage

  @javascriptoff
  Scenario Outline: global navigation Level one links on the Nclimate Homepage
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text           | link                                          | selector       |
      | Home           | nature.com/nclimate/index.html                | home           |
      | Current issue  | nature.com/nclimate/current_issue.html        | currentIssue   |
      | News & comment | nature.com/nclimate/newsandcomment/index.html | newsAndComment |
      | Research       | nature.com/nclimate/research/index.html       | research       |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user hovers on the 'Archive' dropdown menu
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                            | link                                        | selector      |
      | Archive by issue                | nature.com/nclimate/archive/issue.html      | archiveIssue  |
      | Archive by category             | nature.com/nclimate/archive/categories.html | archiveCat    |
      | Specials, focuses & supplements | nature.com/nclimate/archive/report.html     | archiveReport |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user hovers on the 'Authors & referees' dropdown menu
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                       | selector   |
      | Guide to authors | nature.com/nclimate/authors/gta/index.html | authorsGta |
      | For referees     | nature.com/nclimate/referees/index.html    | authorsRef |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user hovers on the 'About the journal' dropdown menu
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                        | link                                                     | selector         |
      | About Nature Climate Change | nature.com/nclimate/about/index.html                     | aboutNClimate    |
      | About the editors           | nature.com/nclimate/about/about-eds/index.html           | aboutEds         |
      | Contact the journal         | nature.com/nclimate/authors/contact/index.html           | authorsContact   |
      | Subscribe                   | nature.com/ecommerce/subscribe.action?productId=nclimate | aboutSubInfo     |
      | For advertisers             | nature.com/advertising/                                  | aboutAdvertising |

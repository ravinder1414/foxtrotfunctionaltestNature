@broken @test @staging @live
Feature: Global journal navigation for Nature Protocols (nprot) journal with level one and two links when Javascript is disabled

  Background: 
    Given the user is browsing the "nprot" homepage

  @javascriptoff
  Scenario Outline: global navigation Level one links on the nprot Homepage
    And the link "<selector>" text reads "<text>"
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text | link                        | selector |
      | Home | nature.com/nprot/index.html | home     |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user hovers on the 'Archive' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                         | selector      |
      | Archive by issue | nature.com/nprot/archive/index.html          | archiveIssue  |
      | Tools & reagents | nature.com/nprot/info/tools.html             | archiveTools  |
      | Stem cell series | nature.com/nprot/series/stemcells/index.html | archiveReport |
      | Featured videos  | nature.com/nprot/info/videos.html            | archiveVideos |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user hovers on the 'Authors & referees' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                | selector   |
      | Guide to authors | nature.com/nprot/info/gta.html      | authorsGta |
      | For referees     | nature.com/nprot/info/referees.html | authorsRef |

  @javascriptoff
  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user hovers on the 'About the journal' dropdown menu
    And the link "<selector>" text reads "<text>"
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                   | link                                                  | selector         |
      | About Nature Protocols | nature.com/nprot/info/about.html                      | aboutJournal     |
      | Contact the journal    | nature.com/nprot/info/contact_us.html                 | aboutContact     |
      | Subscribe              | nature.com/ecommerce/subscribe.action?productId=nprot | aboutSubInfo     |
      | For advertisers        | nature.com/advertising/                               | aboutAdvertising |
      | For librarians         | nature.com/libraries/index.html                       | aboutLibrarians  |

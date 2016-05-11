Feature: Global journal navigation for Nature Genetics (ng) journal with level one and two links

  Background: 
    Given the user is browsing the "ng" homepage

  Scenario Outline: global navigation Level one links on the ng Homepage
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text     | link                              | selector |
      | Home     | nature.com/ng/index.html          | home     |
      | Research | nature.com/ng/research/index.html | research |

  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user clicks on the 'Archive' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                    | link                                | selector      |
      | Archive by issue        | nature.com/ng/archive/index.html    | archiveIssue  |
      | Archive by category     | nature.com/ng/archive/category.html | archiveCat    |
      | Focuses and supplements | nature.com/ng/focsup_index.html     | archiveReport |

  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user clicks on the 'Authors & referees' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                         | selector   |
      | Guide to authors | nature.com/ng/authors/index.html             | authorsGta |
      | For referees     | nature.com/authors/policies/peer_review.html | authorsRef |

  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user clicks on the 'About the journal' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                  | link                                               | selector         |
      | About Nature Genetics | nature.com/ng/site/index.html                      | aboutJournal     |
      | Press releases        | nature.com/ng/press_release/index.html             | aboutPress       |
      | Contact the journal   | nature.com/ng/contact/index.html                   | aboutContact     |
      | Subscribe             | nature.com/ecommerce/subscribe.action?productId=ng | aboutSubInfo     |
      | For advertisers       | nature.com/advertising/                            | aboutAdvertising |
      | For librarians        | nature.com/libraries/index.html                    | aboutLibrarians  |

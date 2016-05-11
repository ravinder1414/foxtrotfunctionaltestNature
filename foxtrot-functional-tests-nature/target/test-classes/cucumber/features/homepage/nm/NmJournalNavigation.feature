@broken @test @staging @live
Feature: Global journal navigation for Nature Medicine (nm) journal with level one and two links

  Background: 
    Given the user is browsing the "nm" homepage

  Scenario Outline: global navigation Level one links on the nm Homepage
    When the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text           | link                                    | selector       |
      | Home           | nature.com/nm/index.html                | home           |
      | News & comment | nature.com/nm/newsandcomment/index.html | newsAndComment |
      | Research       | nature.com/nm/research/index.html       | research       |

  Scenario Outline: global navigation level two links in the 'Archive' dropdown Menu
    When the user clicks on the 'Archive' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                               | link                                | selector        |
      | Archive by issue                   | nature.com/nm/archive/index.html    | archiveIssue    |
      | Archive by category                | nature.com/nm/archive/category.html | archiveCat      |
      | Specials, focuses & supplements    | nature.com/nm/focsup_index.html     | archiveReport   |
      | Nature Medicine Classic Collection | nature.com/nm/classics/index.html   | archiveClassics |
      | Podcast                            | nature.com/nm/podcast/index.html    | archivePodcast  |
      | Video                              | nature.com/nm/video/index.html      | archiveVideo    |

  Scenario Outline: global navigation level two links in the 'Authors & referees' dropdown Menu
    When the user clicks on the 'Authors & referees' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text             | link                                         | selector   |
      | Guide to authors | nature.com/nm/authors/index.html             | authorsGta |
      | For referees     | nature.com/authors/policies/peer_review.html | authorsRef |

  Scenario Outline: global navigation level two links in the 'About the journal' dropdown Menu
    When the user clicks on the 'About the journal' dropdown menu
    And the user clicks on link "<selector>"
    Then the user navigates to "<link>" page

    Examples: 
      | text                  | link                                               | selector         |
      | About Nature Medicine | nature.com/nm/authors/index.html#aims-scope        | aboutJournal     |
      | About the editors     | nature.com/nm/about/about_eds/index.html           | aboutEds         |
      | Press releases        | nature.com/nm/press_release/index.html             | aboutPress       |
      | Contact the journal   | nature.com/nm/contact/index.html                   | aboutContact     |
      | Subscribe             | nature.com/ecommerce/subscribe.action?productId=nm | aboutSubInfo     |
      | For advertisers       | nature.com/advertising/                            | aboutAdvertising |
      | For librarians        | nature.com/libraries/index.html                    | aboutLibrarians  |
      | Conferences           | nature.com/nm/conferences/index.html               | aboutConferences |

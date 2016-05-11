@test @staging @live
Feature: Author contribution statements in author pop-up and author information section

  Scenario Outline: an article has one or more authors that have contributed equally to work
    Given the information is marked up as an author footnote
    When the name of one of the authors that has contributed equally is clicked
    Then the author information pop-up opens and contains the statement, "<statement>" in bold with all of the "<authors>" listed below the heading
    And the author information section contains the statement, "<statement>" with all of the "<authors>" who contributed equally displayed below the heading.

    Examples: 
      | contribution        | statement                                       | authors                         |
      | contributed equally | These authors contributed equally to this work. | Matthew A Brown & Emma L Duncan |

# Scenario Outline: an article has one or more authors that have jointly supervised work
#    Given the information is marked up as an author footnote
#    When the name of one of the authors that has jointly supervised is clicked
#    Then the author information pop-up opens and contains the statement, "<statement>" in bold with all of the "<authors>" listed below the heading
#    And the author information section contains the statement, "<statement>" with all of the "<authors>" who jointly supervised displayed below the heading.

#    Examples: 
#      | contribution       | statement                                   | authors                                                     |
#      | jointly supervised | These authors jointly supervised this work. | Aideen M McInerney-Leo, Mhairi S Marshall & Brooke Gardiner |

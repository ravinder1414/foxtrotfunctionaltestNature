@test @staging @live
Feature: Cookie Login

  Scenario: User valid login flow on nature application
    Given user navigate to nature page
    And user click on login button
    When user enter valid credentials and click on Login button
    Then user logged in and able to see the logout link

  Scenario: User auto login to ecommerce application  using cookies
    Given user navigate to nature page
    When user click on subscription link
    Then user should be able to see the subscription page and also the logout link

  Scenario: User auto login to nature events application using cookies
    Given user navigate to nature events
    When user click on my profile link
    Then user able to see the my profile details

  Scenario: User auto login to naturejobs application using cookies
    Given user navigate to naturejobs
    When click on myaccount link
    Then user able to see the user details on that page

  Scenario: User auto login to news application using cookies
    Given user navigate to news application
    When user click on myaccount link on news page

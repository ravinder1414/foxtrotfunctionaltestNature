@cleanbrowser @test @staging @live
Feature: BDJ Team CPD Admin Login

  Scenario: As a valid BDJ Team CPD Admin user I should be Logged in if I provide valid credentials
    Given The user navigates to BDJ Team CPD home page
    When The user enters valid Admin credentials
    Then The user should be logged in successfully

  Scenario: As a valid BDJ Team CPD Admin user I should not be Logged in if I provide invalid credentials
    Given The user navigates to BDJ Team CPD home page
    When The user enters invalid credentials
    Then The user should not be able to login and should get error message

  Scenario: I should be logged out successfully when I click Logout button
    Given The user is logged in into BDJ team CPD
    When The user clicks on logout link
    Then The user should be logged out successfully

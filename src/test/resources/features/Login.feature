Feature: Login functionality in Serenity Demo

  Scenario: The user logs in with valid credentials
    Given a user opens the login page
    When they enter the username "admin" and the password "serenity"
    Then they should see the dashboard

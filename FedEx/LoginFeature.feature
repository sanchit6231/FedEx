Feature: Login Page

Scenario: Successful Login
Given user is on Login Screen
When title of login screen is free CRM
Then user enter username and password
Then user clicks on Login button
And user is on Home screen
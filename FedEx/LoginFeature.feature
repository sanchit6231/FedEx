Feature: Login Page

Scenario: Select Location
Given user has launched the FedEx link
When choose location popup is available
When location india is available
Then user clicks on Engligh button
Then exit browser

Scenario: Close notification popup
Given user has launched the FedEx link
When choose location popup is available
Then user clicks on Engligh button
Then user verifies notification popup
Then user closes the notification popup
Then exit browser

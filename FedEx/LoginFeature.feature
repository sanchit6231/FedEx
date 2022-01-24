Feature: Login Page

	@RegressionTest
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
  Then user is on Home page
  Then exit browser
 
  @RegressionTest
  Scenario: Login
  Given user has launched the FedEx link
  When choose location popup is available
  Then user clicks on Engligh button
  Then user verifies notification popup
  Then user closes the notification popup
  Then user clicks on Sign up/Log in button
  Then user enters user id and password and click on Log in button
  Then exit browser
 
  Scenario: Rate and Transit times
  Given user has launched the FedEx link
  When choose location popup is available
  Then user clicks on Engligh button
  Then user verifies notification popup
  Then user closes the notification popup
  Then user click on Rate & Transmit Times
  Then user enter select value from and to value
  Then user select Higher limit Yes and Packaging 10kg
  Then user enter weight dimention and value
  Then user clicks on Show Rate
  Then exit browser
 
 @RegressionTest
  Scenario: Track Shipment
  Given user has launched the FedEx link
  When choose location popup is available
  Then user clicks on Engligh button
  Then user verifies notification popup
  Then user closes the notification popup
  Then user clicks on Track button
  Then enter tracking id and click track
  Then exit browser
 
 @RegressionTest
  Scenario: Search invalid Tracking number
  Given user has launched the FedEx link
  When choose location popup is available
  Then user clicks on Engligh button
  Then user verifies notification popup
  Then user closes the notification popup
  Then user click on search button
  Then user enter invlaid tracking id and click on search button
  Then verify incorrect track id msg is populated
  Then exit browser
  
  @RegressionTest
  Scenario: Support option
    Given user has launched the FedEx link
    When choose location popup is available
    Then user clicks on Engligh button
    Then user verifies notification popup
    Then user closes the notification popup
    Then user clicks on Support option and new Customer Centre
    Then verify Before manage and after your ship option is present
    Then exit browser

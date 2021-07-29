Feature: Check home page functionality
	
	Background: user is logged in
		Given user is on login page
		When user enters username and password
		And clicks on login button
		Then user is navigated to the homepage
	
  Scenario: Check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: Verify quick launch tool bar is present
    When user clicks on dashboard link
    Then quick launch tool bar is displayed
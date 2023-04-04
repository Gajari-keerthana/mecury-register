Feature: Register

Scenario: Add registration steps

	Given User launch mozila firefox browser
	When User opens URL "https://demo.guru99.com/test/newtours/"
	And click on REGISTER 
	And page Title should be "Register: Mercury Tours"
	Then User can view Register page
	When User enters user info
	And click on Submit Query button
	Then User can see successful registration page with "Thank you for registering. You may now sign-in using the user name and password you've just entered."
	And close the browser
	
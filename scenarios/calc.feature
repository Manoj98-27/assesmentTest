@UI
  Feature: 1st Feature File
  
  Background: launch the application
  	Given I open the application
  	
@launch
Scenario: verify app is launching 
	Then I verify user is on home page of the application
	
@verifyHomePage
Scenario: verify Home Page
	Then I verify "Jill Black" is present in the list
	
@verifyHomePage2
Scenario: verify Home Page
	When I get the list of all users displyaed on list
	Then I verify "Jill Black" is present on "5" number 
	
  
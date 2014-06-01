Feature: Menu Test for salesforce
In order to test the Menu
As a Tester
I want to check the menu at landing page

@menu
Scenario: Test Login functionality
Given I am logged in
Then Main "MenuLink" should be "present"
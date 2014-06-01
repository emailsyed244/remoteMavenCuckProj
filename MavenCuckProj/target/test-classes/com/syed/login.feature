Feature: Login Test for salesforce
In order to test the login
As a Tester
I want to login to home page

Scenario Outline: Test Login functionality

Given I goto URL on <BROWSER>
When I enter USERXPATH as <USERVALUE>
When I enter PASSXPATH as <PASSVALUE>
And I click LOGINBUTTON
Then LINK_HOME should be present

Examples:
|BROWSER|USERVALUE              |PASSVALUE  |  
|FireFox| me2uonly@hotmail.co.uk|password123| 
|Chrome | me2uonly@hotmail.co.uk|password123|
|FireFox| me1uonly@hotmail.co.uk|password123| 

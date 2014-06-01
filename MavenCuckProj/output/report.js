$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("menu.feature");
formatter.feature({
  "id": "menu-test-for-salesforce",
  "description": "In order to test the Menu\r\nAs a Tester\r\nI want to check the menu at landing page",
  "name": "Menu Test for salesforce",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 1499634,
  "status": "passed"
});
formatter.scenario({
  "id": "menu-test-for-salesforce;test-login-functionality",
  "tags": [
    {
      "name": "@menu",
      "line": 6
    }
  ],
  "description": "",
  "name": "Test Login functionality",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I am logged in",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "Main \"MenuLink\" should be \"present\"",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "MenuTest.I_am_logged_in()"
});
formatter.result({
  "duration": 133999089,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MenuLink",
      "offset": 6
    },
    {
      "val": "present",
      "offset": 27
    }
  ],
  "location": "MenuTest.MenuLinks_should_be_present(String,String)"
});
formatter.result({
  "duration": 1828872,
  "status": "passed"
});
formatter.after({
  "duration": 43926,
  "status": "passed"
});
});
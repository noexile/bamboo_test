$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/test/cucumberJava.feature");
formatter.feature({
  "line": 1,
  "name": "Search for a button functionality",
  "description": "",
  "id": "search-for-a-button-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Finding button functionality exists",
  "description": "",
  "id": "search-for-a-button-functionality;finding-button-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I open Google website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberJava.openBrowser()"
});
formatter.result({
  "duration": 3539231776,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.goToGoogle()"
});
formatter.result({
  "duration": 4140112397,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.loginButton()"
});
formatter.result({
  "duration": 90173679,
  "status": "passed"
});
});
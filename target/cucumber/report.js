$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('testcases\Openwebage.feature');
formatter.feature({
  "line": 1,
  "name": "Openwebpage",
  "description": "This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.",
  "id": "openwebpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfully opening Website.",
  "description": "",
  "id": "openwebpage;successfully-opening-website.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to Website",
  "keyword": "Given "
});
formatter.match({
  "location": "Openwebpage.goToSite()"
});
formatter.result({
  "duration": 3563566395,
  "status": "passed"
});
});
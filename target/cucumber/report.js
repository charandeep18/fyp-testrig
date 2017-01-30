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
formatter.step({
  "line": 5,
  "name": "find the link to the webpage",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click on the link",
  "keyword": "Then "
});
formatter.match({
  "location": "Openwebpage.goToSite()"
});
formatter.result({
  "duration": 3626856049,
  "status": "passed"
});
formatter.match({
  "location": "Openwebpage.findSite2()"
});
formatter.result({
  "duration": 24776682,
  "status": "passed"
});
formatter.match({
  "location": "Openwebpage.clickSite2()"
});
formatter.result({
  "duration": 811463580,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Successfully Login to website",
  "description": "",
  "id": "openwebpage;successfully-login-to-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User has navigated to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Finds the link to the login page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Clicks on the login link",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri('testcases\Openwebpage2.feature');
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
formatter.step({
  "line": 5,
  "name": "navigate to Link-1 Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Openwebpage.goToSite()"
});
formatter.result({
  "duration": 2872378125,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
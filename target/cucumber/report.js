$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('testcases\Login.feature');
formatter.feature({
  "line": 1,
  "name": "Login to website",
  "description": "This feature looks to test login functionality for the website",
  "id": "login-to-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successfully Login to website",
  "description": "",
  "id": "login-to-website;successfully-login-to-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User has navigated to the website to login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Finds the link to the login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Clicks on the login link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enters Username details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enters Password details",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Clicks Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.goToSiteLogin()"
});
formatter.result({
  "duration": 3596983308,
  "status": "passed"
});
formatter.match({
  "location": "Login.findLogin()"
});
formatter.result({
  "duration": 27291259,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "duration": 857639901,
  "status": "passed"
});
formatter.match({
  "location": "Login.enterUsername()"
});
formatter.result({
  "duration": 78305581,
  "status": "passed"
});
formatter.match({
  "location": "Login.enterPassword()"
});
formatter.result({
  "duration": 78316247,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "duration": 92547556,
  "status": "passed"
});
formatter.uri('testcases\Openwebage.feature');
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
  "duration": 3276141037,
  "status": "passed"
});
formatter.match({
  "location": "Openwebpage.findSite2()"
});
formatter.result({
  "duration": 30204445,
  "status": "passed"
});
formatter.match({
  "location": "Openwebpage.clickSite2()"
});
formatter.result({
  "duration": 787474963,
  "status": "passed"
});
formatter.uri('testcases\Search.feature');
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "Enter the search information into the search bar field.",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User is able to search items on website",
  "description": "",
  "id": "search;user-is-able-to-search-items-on-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User has navigated to the website to search",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Finds the search bar in the website header",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enters search information",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicks Submit",
  "keyword": "And "
});
formatter.match({
  "location": "Search.goToSiteSearch()"
});
formatter.result({
  "duration": 3209353087,
  "status": "passed"
});
formatter.match({
  "location": "Search.findSearch()"
});
formatter.result({
  "duration": 25968592,
  "status": "passed"
});
formatter.match({
  "location": "Search.enterSearchInfo()"
});
formatter.result({
  "duration": 80852544,
  "status": "passed"
});
formatter.match({
  "location": "Search.clickSubmit()"
});
formatter.result({
  "duration": 844127605,
  "status": "passed"
});
});
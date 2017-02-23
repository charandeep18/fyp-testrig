$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('sampleTestCases\openUI5App.feature');
formatter.feature({
  "line": 1,
  "name": "OpenUI5App",
  "description": "This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.",
  "id": "openui5app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfully opening Website and fills out details",
  "description": "",
  "id": "openui5app;successfully-opening-website-and-fills-out-details",
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
  "name": "fills out Contact Name",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "ticks UOR check",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enters company as \"Alfreds Futterkiste\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enters Reigion as \"Westboro\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "clicks on Navigation One",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "checks to see if on Navigation One page",
  "keyword": "Then "
});
formatter.match({
  "location": "Open.user_navigates_to_Website()"
});
formatter.result({
  "duration": 5089872557,
  "status": "passed"
});
formatter.match({
  "location": "Open.fills_out_Contact_Name()"
});
formatter.result({
  "duration": 855160551,
  "status": "passed"
});
formatter.match({
  "location": "Open.ticks_UOR_check()"
});
formatter.result({
  "duration": 44031193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alfreds Futterkiste",
      "offset": 19
    }
  ],
  "location": "Open.enters_company_as(String)"
});
formatter.result({
  "duration": 1185394890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Westboro",
      "offset": 19
    }
  ],
  "location": "Open.enters_Reigion_as(String)"
});
formatter.result({
  "duration": 181362891,
  "status": "passed"
});
formatter.match({
  "location": "Open.clicks_on_Navigation_One()"
});
formatter.result({
  "duration": 44819735,
  "status": "passed"
});
formatter.match({
  "location": "Open.checks_to_see_if_on_Navigation_One()"
});
formatter.result({
  "duration": 5096678282,
  "status": "passed"
});
formatter.uri('sampleTestCases\validation.feature');
formatter.feature({
  "line": 1,
  "name": "Validation",
  "description": "This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.",
  "id": "validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Checking validation of Reference Number",
  "description": "",
  "id": "validation;checking-validation-of-reference-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user navigates to SAP site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "fills out Reference Number",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.user_navigates_to_SAP_site()"
});
formatter.result({
  "duration": 4142099697,
  "status": "passed"
});
formatter.match({
  "location": "validation.fills_out_Reference_Number()"
});
formatter.result({
  "duration": 718713000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#But It should only be numeric"
    }
  ],
  "line": 9,
  "name": "Checking validation of Contact Name",
  "description": "",
  "id": "validation;checking-validation-of-contact-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "fills out Contact Names",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.fills_out_Contact_Names()"
});
formatter.result({
  "duration": 814617,
  "error_message": "java.lang.NullPointerException\r\n\tat sampleTestCases.validation.fills_out_Contact_Names(validation.java:38)\r\n\tat ✽.Then fills out Contact Names(sampleTestCases\\validation.feature:10)\r\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#But It should only allow spaces"
    }
  ],
  "line": 13,
  "name": "Checking validation of Description",
  "description": "",
  "id": "validation;checking-validation-of-description",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "fills out the Description",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.fills_out_the_Description()"
});
formatter.result({
  "duration": 146963,
  "error_message": "java.lang.NullPointerException\r\n\tat sampleTestCases.validation.fills_out_the_Description(validation.java:49)\r\n\tat ✽.Then fills out the Description(sampleTestCases\\validation.feature:14)\r\n",
  "status": "failed"
});
});
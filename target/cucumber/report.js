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
  "duration": 3929133432,
  "status": "passed"
});
formatter.match({
  "location": "Login.findLogin()"
});
formatter.result({
  "duration": 27369482,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "duration": 35731753,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"logn\"}\n  (Session info: chrome\u003d55.0.2883.87)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 33 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027LAPTOP-6I4KMST0\u0027, ip: \u0027192.168.12.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9), userDataDir\u003dC:\\Users\\chara\\AppData\\Local\\Temp\\scoped_dir16032_6343}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d55.0.2883.87, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 5ba91fe58182c185d9945d164df9a83d\n*** Element info: {Using\u003did, value\u003dlogn}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat testcases.Login.clickLoginButton(Login.java:26)\r\n\tat ✽.Then Clicks on the login link(testcases\\Login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.enterUsername()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.enterPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 3232609186,
  "status": "passed"
});
formatter.match({
  "location": "Openwebpage.findSite2()"
});
formatter.result({
  "duration": 21886815,
  "status": "passed"
});
formatter.match({
  "location": "Openwebpage.clickSite2()"
});
formatter.result({
  "duration": 656411259,
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
  "duration": 3041756445,
  "status": "passed"
});
formatter.match({
  "location": "Search.findSearch()"
});
formatter.result({
  "duration": 26763456,
  "status": "passed"
});
formatter.match({
  "location": "Search.enterSearchInfo()"
});
formatter.result({
  "duration": 85392593,
  "status": "passed"
});
formatter.match({
  "location": "Search.clickSubmit()"
});
formatter.result({
  "duration": 887492345,
  "status": "passed"
});
});
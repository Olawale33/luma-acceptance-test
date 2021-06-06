$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountManagement.feature");
formatter.feature({
  "line": 2,
  "name": "Account management",
  "description": "",
  "id": "account-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AccountManagement"
    }
  ]
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Sign in with valid email",
  "description": "",
  "id": "account-management;sign-in-with-valid-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@SignIn"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user is on sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user enters \"\u003cEmail\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on sign in",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "my account page displays",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "account-management;sign-in-with-valid-email;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 26,
      "id": "account-management;sign-in-with-valid-email;;1"
    },
    {
      "cells": [
        "Adebola@yahoo.com",
        "Adebola1"
      ],
      "line": 27,
      "id": "account-management;sign-in-with-valid-email;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "Sign in with valid email",
  "description": "",
  "id": "account-management;sign-in-with-valid-email;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AccountManagement"
    },
    {
      "line": 17,
      "name": "@SignIn"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user is on sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user enters \"Adebola@yahoo.com\" \"Adebola1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on sign in",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "my account page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountManagementSteps.userIsOnSignInPage()"
});
formatter.result({
  "duration": 17754316900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adebola@yahoo.com",
      "offset": 13
    },
    {
      "val": "Adebola1",
      "offset": 33
    }
  ],
  "location": "AccountManagementSteps.userEnters(String,String)"
});
formatter.result({
  "duration": 859926500,
  "status": "passed"
});
formatter.match({
  "location": "AccountManagementSteps.userClicksOnSignIn()"
});
formatter.result({
  "duration": 2361613200,
  "status": "passed"
});
formatter.match({
  "location": "AccountManagementSteps.myAccountPageDisplays()"
});
formatter.result({
  "duration": 30800,
  "status": "passed"
});
});
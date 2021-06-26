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
  "line": 5,
  "name": "Create account using valid email",
  "description": "",
  "id": "account-management;create-account-using-valid-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@CreateAccount"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on create an account page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003cFirstName\u003e\" \"\u003cLastName\u003e\" \"\u003cEmail\u003e\" \"\u003cPassword\u003e\" \"\u003cConfirmPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "my account page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "account-management;create-account-using-valid-email;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password",
        "ConfirmPassword"
      ],
      "line": 14,
      "id": "account-management;create-account-using-valid-email;;1"
    },
    {
      "cells": [
        "Ade",
        "Bola",
        "Adebola@yahoo.com",
        "Adebola1",
        "Adebola1"
      ],
      "line": 15,
      "id": "account-management;create-account-using-valid-email;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14712486099,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Create account using valid email",
  "description": "",
  "id": "account-management;create-account-using-valid-email;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AccountManagement"
    },
    {
      "line": 4,
      "name": "@CreateAccount"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on create an account page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter \"Ade\" \"Bola\" \"Adebola@yahoo.com\" \"Adebola1\" \"Adebola1\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "my account page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountManagementSteps.userIsOnCreateAnAccountPage()"
});
formatter.result({
  "duration": 5069295000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ade",
      "offset": 12
    },
    {
      "val": "Bola",
      "offset": 18
    },
    {
      "val": "Adebola@yahoo.com",
      "offset": 25
    },
    {
      "val": "Adebola1",
      "offset": 45
    },
    {
      "val": "Adebola1",
      "offset": 56
    }
  ],
  "location": "AccountManagementSteps.userEnter(String,String,String,String,String)"
});
formatter.result({
  "duration": 1725259200,
  "status": "passed"
});
formatter.match({
  "location": "AccountManagementSteps.userClicksOnCreateAnAccount()"
});
formatter.result({
  "duration": 2529479601,
  "status": "passed"
});
formatter.match({
  "location": "AccountManagementSteps.myAccountPageIsDisplayed()"
});
formatter.result({
  "duration": 51406900,
  "status": "passed"
});
formatter.after({
  "duration": 26899,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Dashboard.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@NewCustomer"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on Dashboard Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should see validate",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 19,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Education",
        "Savings",
        "5000",
        "A1234",
        "Naomi",
        "12345",
        "xyz@abc.com"
      ],
      "line": 20,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2586948800,
  "status": "passed"
});
formatter.before({
  "duration": 697201,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardStepDefinition.User_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 3587616500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@NewCustomer"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enter \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on Dashboard Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User fill up the form entering \"Education\"and \"Savings\"and \"5000\"and \"A1234\"and \"Naomi\"and \"12345\"and \"xyz@abc.com\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should see validate",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 12
    },
    {
      "val": "abc123",
      "offset": 36
    }
  ],
  "location": "DashboardStepDefinition.User_enter_and(String,String)"
});
formatter.result({
  "duration": 151923800,
  "status": "passed"
});
formatter.match({
  "location": "DashboardStepDefinition.user_click_on_signin_button()"
});
formatter.result({
  "duration": 6509179299,
  "status": "passed"
});
formatter.match({
  "location": "DashboardStepDefinition.user_should_land_on_Dashboard_Page()"
});
formatter.result({
  "duration": 415244800,
  "status": "passed"
});
formatter.match({
  "location": "DashboardStepDefinition.user_click_on_bank_and_cash()"
});
formatter.result({
  "duration": 2126133700,
  "status": "passed"
});
formatter.match({
  "location": "DashboardStepDefinition.user_click_on_new_account()"
});
formatter.result({
  "duration": 603474801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Education",
      "offset": 32
    },
    {
      "val": "Savings",
      "offset": 47
    },
    {
      "val": "5000",
      "offset": 60
    },
    {
      "val": "A1234",
      "offset": 70
    },
    {
      "val": "Naomi",
      "offset": 81
    },
    {
      "val": "12345",
      "offset": 92
    },
    {
      "val": "xyz@abc.com",
      "offset": 103
    }
  ],
  "location": "DashboardStepDefinition.user_fill_up_the_form_entering_and_and_and_and_and_and(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 3036009899,
  "status": "passed"
});
formatter.match({
  "location": "DashboardStepDefinition.clicks_on_submit()"
});
formatter.result({
  "duration": 1001245400,
  "status": "passed"
});
formatter.match({
  "location": "DashboardStepDefinition.user_should_see_validate()"
});
formatter.result({
  "duration": 838604200,
  "status": "passed"
});
formatter.after({
  "duration": 22501,
  "status": "passed"
});
});
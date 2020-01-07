$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/demo.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@current"
    }
  ]
});
formatter.step({
  "name": "user navigates to the website \"google.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_navigates_to_the_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there user logs in through Login Window by using Username as \"USER\" and Password as \"PASSWORD\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.there_user_logs_in_through_Login_Window_by_using_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login must be successful.",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login_must_be_successful()"
});
formatter.result({
  "status": "passed"
});
});
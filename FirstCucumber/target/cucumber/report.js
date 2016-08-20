$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "This is login feature",
  "description": "",
  "id": "this-is-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test if user can login",
  "description": "",
  "id": "this-is-login-feature;test-if-user-can-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "go to login page",
  "keyword": "* "
});
formatter.step({
  "line": 6,
  "name": "eneter \"username\" and \"password\"",
  "keyword": "* "
});
formatter.step({
  "line": 7,
  "name": "verify if login is successfull",
  "keyword": "* "
});
formatter.match({
  "location": "LoginSteps.go_to_login_page()"
});
formatter.result({
  "duration": 675889155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 23
    }
  ],
  "location": "LoginSteps.eneter_and(String,String)"
});
formatter.result({
  "duration": 4837598,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_if_login_is_successfull()"
});
formatter.result({
  "duration": 102655,
  "status": "passed"
});
});
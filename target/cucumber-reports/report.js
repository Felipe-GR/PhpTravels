$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/Login.feature");
formatter.feature({
  "name": "To verify login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate customer is able to login successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Customer is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.customerIsOnLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer logged in with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.customerLoggedInWithValidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer create a blog",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.customerCreateBlog()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
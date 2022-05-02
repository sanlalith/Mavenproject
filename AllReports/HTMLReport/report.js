$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Login1.feature");
formatter.feature({
  "name": "To validate login functionality in FB application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate login by using valid email and invalid pass",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to enter FB Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.user_have_to_enter_FB_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter valid email and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.user_have_to_enter_valid_email_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to be in invalid credential page.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_have_to_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
});
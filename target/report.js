$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/oxygen/eclipse-workspace/Guru99Site/src/test/resources/Feature/HomePage.Feature");
formatter.feature({
  "name": "guru telecome.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home page scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in payment gateway index",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_should_be_in_payment_gateway_index()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should click buy now button",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.the_user_should_click_buy_now_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinition.Common.click(Common.java:24)\r\n\tat StepDefinition.HomePageSteps.the_user_should_click_buy_now_button(HomePageSteps.java:27)\r\n\tat ✽.the user should click buy now button(C:/Users/Admin/oxygen/eclipse-workspace/Guru99Site/src/test/resources/Feature/HomePage.Feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user shoudl navigate to payment process",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.the_user_shoudl_navigate_to_payment_process()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});
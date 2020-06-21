$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AliExpress.feature");
formatter.feature({
  "line": 1,
  "name": "Search on AliExpress",
  "description": "",
  "id": "search-on-aliexpress",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for an Iphone on AliExpress",
  "description": "",
  "id": "search-on-aliexpress;search-for-an-iphone-on-aliexpress",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on AliExpress",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I do a search for \"Iphone\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I go to the page 2 of the results",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on the 2º ad",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see 1 or more pieces available",
  "keyword": "Then "
});
formatter.match({
  "location": "AliExpressPageStepsDefinitions.i_am_on_AliExpress()"
});
formatter.result({
  "duration": 25553455000,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
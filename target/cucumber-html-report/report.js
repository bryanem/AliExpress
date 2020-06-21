$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AliExpress.feature");
formatter.feature({
  "line": 1,
  "name": "Load AliExpress",
  "description": "",
  "id": "load-aliexpress",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Load AliExpress",
  "description": "",
  "id": "load-aliexpress;load-aliexpress",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on AliExpress",
  "keyword": "Given "
});
formatter.match({
  "location": "AliExpressPageStepsDefinitions.i_am_on_AliExpress()"
});
formatter.result({
  "duration": 10796181100,
  "status": "passed"
});
});
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
  "duration": 14592186900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 19
    }
  ],
  "location": "AliExpressPageStepsDefinitions.i_do_a_search_for(String)"
});
formatter.result({
  "duration": 5868404000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 17
    }
  ],
  "location": "AEResultsPageStepsDefinitions.i_go_to_the_page_of_the_results(int)"
});
formatter.result({
  "duration": 3096521300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    }
  ],
  "location": "AEResultsPageStepsDefinitions.i_click_on_the_º_ad(int)"
});
formatter.result({
  "duration": 4294992600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 6
    }
  ],
  "location": "AEProductPageStepsDefinitions.i_see_or_more_pieces_available(int)"
});
formatter.result({
  "duration": 560704300,
  "status": "passed"
});
formatter.after({
  "duration": 70600,
  "status": "passed"
});
});
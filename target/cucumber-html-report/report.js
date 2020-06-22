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
  "duration": 12799386300,
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
  "duration": 8548571500,
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
  "duration": 349567900,
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
  "duration": 997096300,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d83.0.4103.106)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#stale_element_reference\nBuild info: version: \u00274.0.0-alpha-6\u0027, revision: \u00275f43a29cfc\u0027\nSystem info: host: \u0027DESKTOP-B3GCSPM\u0027, ip: \u0027192.168.1.34\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.106, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Usuario\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:54142}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: a32f7852b71e7af5d6a517f3b5f37e33\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:316)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat pageObjects.AEResultsPage.clickResult(AEResultsPage.java:45)\r\n\tat pageStepsDefinitions.AEResultsPageStepsDefinitions.i_click_on_the_º_ad(AEResultsPageStepsDefinitions.java:19)\r\n\tat ✽.And I click on the 2º ad(AliExpress.feature:7)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
});
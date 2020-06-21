Feature: Search on AliExpress
	
  Scenario: Search for an Iphone on AliExpress
    Given I am on AliExpress
    When I do a search for "Iphone"
    And I go to the page 2 of the results
    And I click on the 2º ad
    Then I see 1 or more pieces available

@regression @sofaSearch

Feature: Ashley Search functionality
         As a user, I should be able to search items and see relevant information
         in all pages returned by search result

  @searchSofa
  Scenario: AshleyFurniture Search Functionality Title Verification
    Given User is on Ashley home page
    When  User types "Sofa" in the ashley's search box
    And   User clicks "search icon" in the search box
    Then  User should be able to see "Sofa" or "Loveseat" within Name links at each result page


  @wikiScenarioOutline
  Scenario Outline: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "<searchValue>" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "<expectedMainHeader>" is in the main header
    Then  User sees "<expectedTitle>" is in the wiki title

    Examples: Search terms are going to use in this template is as below
      | searchValue     | expectedMainHeader | expectedTitle   |
      | Steve Jobs      | Steve Jobs         | Steve Jobs      |
      | Albert Einstein | Albert Einstein    | Albert Einstein |
      | Nikola Tesla    | Nikola Tesla       | Nikola Tesla    |
      | Conor McGregor  | Conor McGregor     | Conor McGregor  |
      | Chuck Norris    | Chuck Norris       | Chuck Norris    |

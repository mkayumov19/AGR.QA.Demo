
@regression @dataTable

Feature: Examples of Cucumber data table implementations

  @months
  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

    @fruits
  Scenario: Something happens
    #Given user does something
    Then user should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
      | Tomato     |
      | Cucumber   |

    # To fix pipes' order
      #MAC: command + option + L
      #Windows : control + alt + L

   @libraryLogin
  Scenario: Library login example using data table
    Given User is on the login page of library app
    When User enters username and password as below
      | username | student11@library |
      | password | tScBPCUr          |
    Then User should see title is Library
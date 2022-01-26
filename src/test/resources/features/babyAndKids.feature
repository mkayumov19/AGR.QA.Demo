
@vehicles

Feature:  Create Vehicle
  As a user, I want to be able to create a vehicle

  Scenario: User should be able to create a vehicle
    Given user is on a landing page
    When  user logs is with "storemanager85" and "UserUser123"
    Then  user navigates to "Fleet" and "Vehicles"
    And  user click on create car button
    Then user enters vehicles information:
      | License Plate | Driver | Location | Model Year |
      | florida_plate | SDET   | Florida  | 2021       |


Feature: Maksim should be able to add sofa to cart

  @Maks
  Scenario: Maksim is buying sofa
    Given Maksim is on Ashley landing page
    When Maksim searches for sofa
    Then Maksim should be able to see sofas in result


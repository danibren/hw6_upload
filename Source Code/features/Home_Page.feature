Feature: Home Page


  Scenario: Add A(One) Product To the Cart
    Given user logged in
    When user click a product item
    Then Number in Cart's icon Increase

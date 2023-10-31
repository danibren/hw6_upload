Feature: Cart Page


  Scenario Outline: Checkout The Cart
    Given user add a product to the Cart
    When user click Cart's icon
    And user click Checkout button
    And show page Your Information page
    And input First Name text
      """
      <<first_name>>
      """
      |first_name|
    And input Last Name text
      """
      <<last_name>>
      """
      |last_name|
    And input zip/postal code
      """
      <<zip_code>>
      """
      |zip_code|
    And click Continue button
    And show page Checkout: Overview
    And Click Finish Button
    Then show checkout respond messages

    Examples:
      | first_name | last_name | zip_code |
      | yayi | yoya | 123456 |

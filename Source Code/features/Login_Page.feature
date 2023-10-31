Feature: Login Page


  Scenario Outline: Login Successfully to sauce demo
    Login Successfully to sauce demo by correct URL, input username, and password
    Given typing correct URL to the browser "https://www.saucedemo.com/"
    When user input valid username
      """
      <<username>>
      """
      |username|
    And user input valid password
      """
      <<password>>
      """
      |password|
    And user click Login button
    Then user logged in
    And show the sauce demo home page

    Examples:
      | username | password |
      | standard_user | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user | secret_sauce |
      | visual_user | secret_sauce |

  Scenario Outline: Can't Login by false password
    Given typing correct URL to the browser "https://www.saucedemo.com/"
    When user input valid username
      """
      <<username>>
      """
      |username|
    And user input NOT valid password
      """
      <<password>>
      """
      |password|
    And user click Login button
    Then user CAN'T Login

    Examples:
      | username | password |
      | standard_user | not_secret_sauce |
      | locked_out_user | not_secret_sauce |
      | problem_user | not_secret_sauce |
      | performance_glitch_user | not_secret_sauce |
      | error_user | not_secret_sauce |
      | visual_user | not_secret_sauce |

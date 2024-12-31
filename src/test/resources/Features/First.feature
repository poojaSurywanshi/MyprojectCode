Feature: Login Functionality

 Scenario Outline: User should be able to login with different sets of credentials
    Given the user navigates to the login page
    When the user enters "<username>" and "<password>"
    Then the user should see the "<result>" message

 Examples:
      | username     | password      | result              |
      | validUser    | validPassword | Login successful    |
      | invalidUser  | validPassword | Login failed        |
      | validUser    | invalidPassword | Login failed        |
      |              |               | Login failed        |
      | validUser    |               | Login failed        |
      |              | validPassword | Login failed        |
	
@AccountManagement
Feature: Account management

  @CreateAccount
  Scenario Outline: Create account using valid email
    Given user is on create an account page
    When user enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And user clicks on create an account
    Then my account page is displayed



    Examples:
      | FirstName | LastName | Email             | Password | ConfirmPassword |
      | Ade       | Bola     | Adebola@yahoo.com | Adebola1 | Adebola1        |

  @SignIn
  Scenario Outline:  Sign in with valid email
    Given user is on sign in page
    When user enters "<Email>" "<Password>"
    And user clicks on sign in
    Then my account page displays


    Examples:
      | Email             | Password |
      | Adebola@yahoo.com | Adebola1 |
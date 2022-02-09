Feature: Trade Journal login
        As a user i should be able to login with valid credentials 
        As a user i should not be able to login with invalid credentials

  Background: 
    Given User is on the Stock trade Tracking application

  @TradeJournalLogin @SmokeTests
  Scenario: User should be looged in when provided valid credentials
    When User enters valid username  in the username field
    And User enters valid password  in the password field
    When User click on the login button
    Then User should be directed to the home page of the Stock Trade Tracking Aplication

  #============================================================
  @TradeJournalInvalidLogin @SmokeTests
  Scenario Outline: User shoud not be logged in when providing invalid credentials
    When User enters invalid username "<invalidUsername>" in the username field
    And user enters invalid password "<invalidPassword>"   in the password field
    When User click on the login button
    Then user shoud not be directed to the home page of trade Tracking application
    And System sould display "Bad credentials"

    Examples: 
      | invalidUsername | invalidPassword |
      | ahmed          |      627498712 |
      | mohammd        | yheu834        |
      | Taher          |        6378923 |
      | Salam          | hefhknkkwl     |

  #======================================================
  @TradeJournalInvalidPassword
  Scenario Outline: User shoud not be logged in when providing invalid password
    When User enters valid username  in the username field
    And User enters invalid password "<password>"   in the password field
    When User click on the login button
    Then user shoud not be directed to the home page of trade Tracking application
    And System sould display "Bad credentials"

    Examples: 
      | invalidPassword |
      |        63847997 |
      | kwdhksfk        |
      | iwwiwe          |

  #===================================================
  @TradeJournalInvalidUsername
  Scenario Outline: User shoud not be logged in when providing invalid username
    When User enters invalid username "<username>" in the username field multiple invalid username tests
     And User enters valid password  in the password field
     When User click on the login button
    Then user shoud not be directed to the home page of trade Tracking application
    And System sould display "Bad credentials"

    Examples: 
      | username |
      | Ahmed     |
      | Ekram    |
      | Soaad    |

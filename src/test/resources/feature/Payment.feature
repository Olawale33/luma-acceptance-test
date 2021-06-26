@Payment
Feature: Payment methods


  @VisaCard

  Scenario Outline: Make payment with Visa Card
    Given User is on payment page
    When User enter card details"<FirstName>" "<LastName>""<CardNumber>""<Month>""<Year>""<CVV>"
    And User clicks on pay
    Then Payment successful page displays


    Examples:

      | FirstName | LastName | CardNumber      | Month | Year | CVV |
      | Ade       | Bola     | 767979445779866 | 06    | 23   | 089 |
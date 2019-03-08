Feature: guru telecome.
  
  
  Scenario: Home page scenario
    Given The user should be in payment gateway index
    When the user should click buy now button
    Then the user shoudl navigate to payment process

Scenario: card generate senario
    Given The user should click on card generate and should navigate to that page
    When The user should read the card detail content
    Then save the card details
    
Scenario: payment process
    Given The user should be in payment processing page
    When The user should wite the card detail 
    
    Then click on pay option
    
  
  
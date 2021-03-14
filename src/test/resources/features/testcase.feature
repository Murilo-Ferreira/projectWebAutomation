#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Shopping
Feature: Online Shopping

  @sc001
  Scenario: Scenario001
    Given Choose any product in the webstore
    And Add a product in your Cart
    And Proceed to checkout
    Then Validate the product was added correctly and proceed to checkout if the product is correct
    And Create an account filling in all requireds fields
    Then Validate the adress and proceed
    And Agree with Terms of Service and proceed
    Then Validate total price
    And Choose the payment method
    Then Confirm the purchase and validate that it has been successfully completed
    
      
    
    
    
       
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

@OnlinePurchase
Feature: Purchase an item in a web store registering a new User account 
and verifying all steps to buy correctly 				

  @sc001
  Scenario: Successul item purchase
  					Register a new User account
						Verify all steps to buy correctly
						 
    Given I choose a Blouse in the web store
    And Add the product in your Cart
    And I proceed to checkout
    Then Validate the product was added correctly and proceed to checkout if the product is correct
    And Create an account filling in all requireds fields
    Then Validate the adress and proceed
    And Agree with Terms of Service and proceed
    Then Validate total price
    And Choose the payment method
    Then Confirm the purchase and validate that it has been successfully completed
    
  @sc002
  Scenario: Unsuccessul item purchase  
    Given Search a product that don't existe in web store
    Then Validate the product don't exist    
    
   @sc003
  Scenario: Validate unfinished form  
    Given I choose a Blouse in the web store
    And Add the product in your Cart
    And I proceed to checkout
    Then Validate the product was added correctly and proceed to checkout if the product is correct
    And Create an account without filling in all requireds fields 
    Then I should see an error message with required fields 
       
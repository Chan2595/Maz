Feature: MAZ Demo run
  To execute test cases on MAZ application
  
  @MazDemo
  Scenario Outline: Updating Credit Limit for a customer
  Given I log into MAZ application using valid user credentials
  Then click on CustomerData Tab under CREDIT Module
  Then click on Advance Search BUTTON and provide Existing customer value in Customer Number field and click on Search BUTTON "<CustomerNumber>"
  And Double Click on the Search Customer and verify application displays customer detail screen "<CustomerNumber>"
  Then Click on Characteristics TAB
  And click on ADHOCCredit LIMIT WF SUB TAB and Mandatory fields to be filled are present
 	#Then provide values in CreditLimit CreditScore RiskClass DecisionDate and ProcessionUser in appropriate field
  #Then click on CustomerData Tab under CREDIT Module
  #And click on Credit Review and select Review Workflow as ADHOC review and click on Initiate credit Review
  #Then CLick on Worklist Tab and verify appropriate Review Status for the Customer
  
  Examples:
  |CustomerNumber     |   
  |0101110543         |		
  
  
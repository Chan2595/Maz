Feature: MAZ Demo run
  To execute test cases on MAZ application
  
  @test1
  Scenario Outline: Creating new contact details for a customer
  Given I log into MAZ application using valid user credentials
  Then Verify application opened with appropriate title
  Then click on collections tab
  And Click on worklist subtab
  Then From the list click on any one customer
  And Verify customer details screen is displayed
  #And click on contacts tab and then click on  add contact button
  #Then Fill all mandatory fields and click on save "<FirstName>","<EmailId>","<LastName>","<MobileNumber>"
  #Then verify whether success message is displayed and contact details appears
  #Then I logout of the application
  
  Examples:
  |FirstName     |EmailId       |LastName|MobileNumber|
  |TestCollection|test@gmail.com|Maz     |9952163021|
  
  
Feature: Techfios bank and cash New Account Functionality

Background:
 Given User is on Techfios login page  
 
@NewCustomer
Scenario Outline: User should be able to login with valid credentials
 and open a new account 
 When User enter "<userName>" and "<password>"  
 And  User click on signin button
  Then User should land on Dashboard Page   
 Then User click on bank and cash          
  Then User click on new account      
 Then User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" 
  And clicks on submit 
  Then User should see validate  
  
  Examples: 
  | userName        | password |accountTitle  | description |initialBalance | accountNumber | contactPerson | phone |internetBankingUrl|
  |demo@techfios.com|  abc123 | Education     |Savings      |    5000     |     A1234     |      Naomi     |12345   |xyz@abc.com|
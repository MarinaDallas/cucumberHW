Feature: Validate Techfios Login Functionality Other way

Background: 
    Given User is on the Techfios login page 

@OtherLogin
Scenario Outline: User should be able to log in with valid credential
    When User enters "<userName>" and "<password>" 
     
    And  User clicks on signin button
    Then User should land on Dashboard page
    
    Examples:
     
    |      userName      |  password|
    |  demo@techfios.com |   abc123 |
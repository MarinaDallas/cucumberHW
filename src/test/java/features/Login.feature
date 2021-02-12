@Login
Feature: Validate Techfios Login Functionality

Background: 
    Given User is on the Techfios login page 

Scenario: User should be able to log in with valid credential
    When User enters username as "demo@techfios.com" 
    When  User enters password as "abc123"
    And  User clicks on signin button
    Then User should land on Dashboard page
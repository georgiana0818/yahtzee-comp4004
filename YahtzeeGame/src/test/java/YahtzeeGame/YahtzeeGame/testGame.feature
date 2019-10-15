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
@tag
Feature: Three player joining and start game

  I want to use this template for my feature file
  
	Background: Start Server
  Given I start Server
  @tag1
  Scenario: player one play game
    Given player One join the game
    
    When player One start round One
    And play One wants to score category Three
    Then play One can see can see it score category Three
    
    
    
  
   



 

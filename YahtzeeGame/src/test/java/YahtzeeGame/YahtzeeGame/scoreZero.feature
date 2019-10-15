@gametest
Feature: Score Zero
  I want to use this template for my score zero file
  @gametest
  Scenario Outline: Score Zero for categories
    Given I want to Score a zero with <category>
    When I input int array for <category>
    Then I verify the <category> score

    Examples: 
      | category|
       | Aces |
       | Twos |
       | Threes|
       | Fours |
       | Fives |
       | Sixs |
       | upperBonus|
       | LargeStraight|
       | SmallStraight|
       | FullHouse|
       | ThreeKind|
       | FourKind|
       | Yahtzee|
       | upperBonus|

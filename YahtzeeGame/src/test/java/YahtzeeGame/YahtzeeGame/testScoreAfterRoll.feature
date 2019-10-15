@tag
Feature: Test roll
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Test score after roll
    Given I want to score <name>
    When I process the <name>
    Then I verify the score after <name>

    Examples: 
      | name                         |
      | noReroll                     |
      | rerollLessThanFiveOnce       |
      | rerollAllOnce                |
      | rerollAllTwice               |
      | rerollTwiceHoldZeroAndOne    |
      | rerollTwiceHoldZeroAndTwo    |
      | rerollTwiceHoldZeroAndThree  |
      | rerollTwiceHoldZeroAndFour   |
      | rerollTwiceHoldOneAndOne     |
      | rerollTwiceHoldOneAndTwo     |
      | rerollTwiceHoldOneAndThree   |
      | rerollTwiceHoldOneAndFour    |
      | rerollTwiceHoldTwoAndTwo     |
      | rerollTwiceHoldTwoAndThree   |
      | rerollTwiceHoldTwoAndFour    |
      | rerollTwiceHoldThreeAndThree |
      | rerollTwiceHoldThreeAndFour  |
      | rerollTwiceHoldFourAndFour   |


@tag
Feature: Score feature
  I want to use this template for my score feature file

  @tag2
  Scenario Outline: score categories correctly
    Given I want to score <category> correctly
    When I input int array for <category> to score
    Then I verify the score of the <category>

    Examples: 
      | category  |
      | acesScoreOne | 
      | acesScoreTwo |
      | acesScoreThree |
      | acesScoreFour |
      | acesScoreFive |
      | TwosScoreTwo |
      | TwosScoreFour |
      | TwosScoreSix |
      | TwosScoreEight |
      | TwosScoreTen |
      | ThreesScoreThree |
      | ThreesScoreSix |
      | ThreesScoreNine |
      | ThreesScoreTwelve |
      | ThreesScoreFifty |
      | FoursScoreFour |
      | FoursScoreEight |
      | FoursScoreTwelve |
      | FoursScoreSixteen|
      | FoursScoreTwenty |
      | FivesScoreFive |
      | FivesScoreTen |
      | FivesScoreFifteen |
      | FivesScoreTwenty|
      | FivesScoreTwentyFive |
      | SixsScoreSix |
      | SixsScoreTwelve |
      | SixsScoreEighteen |
      | SixsScoreTwentyFour |
      | SixsScoreThirty |
      | UpperBonusThirtyFive|
      | LargeStraightScoreForty |
      | SmallStraightScoreThirty |
      | FullHouseScoreTwentyFive |
      | ThreeKindScoreFive|
      | ThreeKindScoreSix|
      | ThreeKindScoreSeven|
      | ThreeKindScoreEight|
      | ThreeKindScoreNine|
      | ThreeKindScoreTen|
      | ThreeKindScoreEleven|
      | ThreeKindScoreTwelve|
      | ThreeKindScoreThirteen|
      | ThreeKindScoreFourteen|
      | ThreeKindScoreFifteen|
      | ThreeKindScoreSixteen|
      | ThreeKindScoreSeventeen|
      | ThreeKindScoreEightteen|
      | ThreeKindScoreNineteen|
      | ThreeKindScoreTwenty|
      | ThreeKindScoreTwentyOne|
      | ThreeKindScoreTwentyTwo|
      | ThreeKindScoreTwentyThree|
      | ThreeKindScoreTwentyFour|
      | ThreeKindScoreTwentyFive|
      | ThreeKindScoreTwentySix|
      | ThreeKindScoreTwentySeven|
      | ThreeKindScoreTwentyEight|
      | ThreeKindScoreTwentyNine|
      | ThreeKindScoreThirty|
      | FourKindScoreFive|
      | FourKindScoreSix|
      | FourKindScoreSeven|
      | FourKindScoreEight|
      | FourKindScoreNine|
      | FourKindScoreTen|
      | FourKindScoreEleven|
      | FourKindScoreTwelve|
      | FourKindScoreThirteen|
      | FourKindScoreFourteen|
      | FourKindScoreFifteen|
      | FourKindScoreSixteen|
      | FourKindScoreSeventeen|
      | FourKindScoreEightteen|
      | FourKindScoreNineteen|
      | FourKindScoreTwenty|
      | FourKindScoreTwentyOne|
      | FourKindScoreTwentyTwo|
      | FourKindScoreTwentyThree|
      | FourKindScoreTwentyFour|
      | FourKindScoreTwentyFive|
      | FourKindScoreTwentySix|
      | FourKindScoreTwentySeven|
      | FourKindScoreTwentyEight|
      | FourKindScoreTwentyNine|
      | FourKindScoreThirty|
      | ChanceScoreFive|
      | ChanceScoreFiveScoreSix|
      | ChanceScoreSeven|
      | ChanceScoreEight|
      | ChanceScoreNine|
      | ChanceScoreTen|
      | ChanceScoreEleven|
      | ChanceScoreTwelve|
      | ChanceScoreThirteen|
      | ChanceScoreFourteen|
      | ChanceScoreFifteen|
      | ChanceScoreSixteen|
      | ChanceScoreSeventeen|
      | ChanceScoreEightteen|
      | ChanceScoreNineteen|
      | ChanceScoreTwenty|
      | ChanceScoreTwentyOne|
      | ChanceScoreTwentyTwo|
      | ChanceScoreTwentyThree|
      | ChanceScoreTwentyFour|
      | ChanceScoreTwentyFive|
      | ChanceScoreTwentySix|
      | ChanceScoreTwentySeven|
      | ChanceScoreTwentyEight|
      | ChanceScoreTwentyNine|
      | ChanceScoreThirty |
      | YahtzeeScoreFifty |
      | AdditionYahtzeeScore |
      
      

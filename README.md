# Submitted by #
Istiaq Ahmed Fahad
BSSE 1204

# Code Smell Resolved #

In this repository [here](https://github.com/ahmedfahad04/refactoring-workshop/tree/master/java/src/main/java) we can find two packages. One of them contains the actual code
and the other contains the Code Smell Resolved code. Therefore, we'll look up our solution in **codeSmellResolved**
package. 

My answer will be documented in the following pattern:

    Code Smell Name [Reason] 
    * => Solution {line numbers}

## Fizzbuzz.java ## 

1. **Long Method** [if-else ladder] 
* => extract method `{line: 20}`

## PlainTextToHtmlConverter.java ## 

1. **Comment** [stashNextCharacterAndAdvanceThePointer(), addANewLine()] 
* => We renamed the method to avoid using the comments. `{line 59, 65}`
2. **Long Method** [the method doesn't necessarily cover one whole screen size, also contains switch case] 
* => Extract method 'basicHtmlEncoder()' to 'encodeSourceText()' `{line: 17, 27}`
3. **Black Sheep** [basicHtmlEncoder(), stashNextCharacterAndAdvanceThePointer, addANewLine, pushACharacterToTheOutput these method doesn't match to the family of
PlainTextToHtmlConverter Class, rather they might be a part of another like HTMLEncoder Class]
* => Move all these to newly created HTMLEncoder class `{line: 9}`

## TriviaGame.java ##
1. **Inappropriate Naming** ['add()', 'roll()' these names are quite obscure about what they're actually doing] 
* => Renamed the methods `{line: 25, 41}`

2. **Long Method**  ['roll()', 'wasCorrectlyAnswered()' is quite large to comprehend]
* => create extracted methods named 'resetPlayerLocationAndAskQuestion()', 'getWinningStatus()' `{line: 59, 131}`

3. **Duplicate Code**  [many code snippet was repeated in 'roll()', 'wasCorrectlyAnswered()', 'askQuestion()' methods, they used large if-else ladder] 
* => method extraction for askQuestion() method to 'updateQuestionSet()' `{line: 138}`

4. **Feature Envy** [Most of the method were about players info, player location etc. which was more relevant to Players Class. Also, Trivia is QnA Game, so the methods related to Questions are kept in Trivia Class. We also kept 'wasCorrectlyAnswer()' and 'wrongAnswer()' methods in player as it frequently access the data for Players class. Therefore, these methods are much relevant for Players class] 
* => Therefore those methods are moved to players class `{line: 6, 70, 82, 97, 107}`

# Bowling Game Kata
[The Bowling Game Kata](http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata) a famous TDD kata proposed by [Uncle Bob](https://twitter.com/unclebobmartin). I learned it from book _The Clean Coder: A Code of Conduct for Professional Programmers_. It was a great way to learn TDD. I use git commit to record test-implement-refactor.

## Bowling Rules
![](./bowling_scoresheet_example.png)

The game consists of 10 frames. In each frame the player has two rolls to knock down 10 pins. The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two rolls. The bonus for that frame is the number of pins knocked down by the next roll.

A strike is when the player knocks down all 10 pins on his first roll. The frame is then completed with a single roll. The bonus for that frame is the value of the next two rolls.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame. However no more than three balls can be rolled in tenth frame.

## Three Laws of TDD
When doing the exercise, it is important to stick to the three rules of TDD. For more information click [here](http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd).

1. You may not write production code until you have written a failing unit test. 
2. You may not write more of a unit test than is sufficient to fail, and not com- piling is failing. 
3. You may not write more production code than is sufficient to pass the currently failing test.


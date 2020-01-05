# PuzzleGame
This puzzle game is inspired from one of the Berkeley CS61b course homeworks. The purpose is to get familiar with A* algorithm, levenshtein algorithm, and Junit.
## Game description
It is a word ladder game, user need to input a begin word and an endwork, the program with calculate the minimum path to go tranform from start word to end word with
each step change one character (either insertion, deletion or replacement).

## How to use
To run the program, you need to download it and then in this directory, type
<pre>mvn install</pre>
to install to your local repository then type
<pre>java -cp target/PuzzleSolver-1.0-SNAPSHOT.jar Start </pre>
to start the program.

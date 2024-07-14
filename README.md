Tic-Tac-Toe
To start a game, a player must visit the site and enter their name. This will create a new game and the player will become player 1. The game will then wait for another player to join.

Player 2 can then visit the site and enter their name. This will start the game, with player 1 going first.

Players alternate making moves by clicking on an empty square on the game board. The first player to get 3 of their symbols in a row (horizontally, vertically, or diagonally) wins the game. If all squares are filled and no player has won, the game is a tie.

If a player leaves the game, the other player wins the game.

The state of the game is displayed at the top of the page, including whose turn it is and the current winner (if any).

A player wins the game if they get 3 of their symbols in a row (horizontally, vertically, or diagonally). If all squares are filled and no player has won, the game is a tie.

The logic is in `io.github.ashr123.tictactoe.model.TicTacToe.checkWinner`

To run the game, just start the server with Maven, and then, in the browser enter http://localhost:8080/inxex from 2 different windows.

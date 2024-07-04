# RPG
## Console Game
### The Idea
Make a simple text-based endless quest where the main character
is created by player and where you can fight in different locations with different enemies and occasionally the one boss.

### Program structure
When launching `main`, the initial menu starts, in which
- [x] there is a "New Game" function that starts the game itself (the main program)
- [ ] there is a "Continue" function that would pull out the score of the player's enemies and treasures and run
      the program without intro
- [x] there is a "Quit the game" function that would finish the program

After starting `main` and selecting `New Game`, the main character 'Main Character' is created, and
then the main character begins to be driven by the program through the locations of `gameLocation` and `battle` `fight`
using the method `adventure Generator`.

The location is selected using a limited random number generator `number Generator`.

A list with a random number of enemies with a limited maximum
value will be spawned at the location, and the player must fight each one in turn.

The player has the opportunity to:

- [x] To attack enemies, as a result of which the enemy would receive damage
- [ ] Dodge enemy attacks. (From technical point of view, this feature does not make sense, 
      but refreshes the fight for the player)
- [ ] Block strikes (Has the same function as dodging)

When an enemy runs out of health, the player must throw the next one on the list.

As soon as the list of `alive` enemies ends, the player:

- [ ] this should be reported and the treasure should be credited
- [x] a new location must be transmitted

The player at any time can:

- [x] exit the game (end the program)
- [ ] save the progress

# Project stage
# NOT COMPLETED
## Reason:
1. An error due to which the program takes the same opponent in battle and reduces the value of his health (plus reduces it to a negative value)
   and does not move on to the next opponent on the list.
2. Lack of time
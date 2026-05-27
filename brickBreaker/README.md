# Brick Breaker Game

A classic arcade-style brick breaker game written in Java using Swing.

## How to Play

### Objective
Break all the bricks by bouncing the ball off your paddle. Don't let the ball fall below the paddle!

### Controls
- **LEFT Arrow**: Move paddle left
- **RIGHT Arrow**: Move paddle right
- **SPACE**: Pause/Resume game
- **R**: Restart game (after game over or win)

### Game Features
- **24 Bricks** arranged in a 8×3 grid
- **Scoring System**: 10 points per brick destroyed
- **Ball Physics**: Ball bounces off walls, paddle, and bricks
- **Paddle Spin**: Hit the ball with different parts of the paddle to add spin
- **Win Condition**: Destroy all bricks to win
- **Lose Condition**: Ball falls below the paddle to lose

## How to Compile and Run

### Compile
```bash
javac BrickBreakerGame.java
```

### Run
```bash
java BrickBreakerGame
```

## Game Components

### Classes
- **BrickBreakerGame**: Main application window
- **GamePanel**: Main game logic and rendering
- **Ball**: Represents the bouncing ball
- **Paddle**: Player-controlled paddle
- **Brick**: Individual brick objects

## Gameplay Tips
- Position your paddle to intercept the ball
- Hit the ball near the edges of the paddle to add spin and reach different angles
- Plan your moves to break bricks efficiently
- Use the edges of the screen to your advantage - the ball bounces off the sides!

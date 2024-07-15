# C3PO: Chandrayaan 3 Probe Operator
## Lunar Craft Galactic Control System

## Project Overview

This project simulates the control system for the Chandrayaan 3 lunar spacecraft, enabling it to navigate through the galaxy using galactic coordinates. 
The spacecraft moves based on commands sent from Earth, which dictate its movement and orientation in space. 

The main goal of this application is to take inputs from the end user in an array of charecters and translate them into co-ordinates (X,Y,Z), 
which will be used by the spacecraft to navigate itself in the space.

## Table of Contents

1. [Introduction](#introduction)
2. [Coordinates and Directions](#coordinates-and-directions)
3. [Commands](#commands)
4. [Examples](#examples)
5. [Setup and Usage](#setup-and-usage)

## Introduction

As a scientist at ISRO, the task is to develop a program that translates commands into instructions understood by Chandrayaan 3. The spacecraft navigates using galactic coordinates (x, y, z) and follows specific commands to move and rotate.

## Coordinates and Directions

- **Coordinates (x, y, z):**
  - **x:** East-West position
  - **y:** North-South position
  - **z:** Up-Down position

- **Directions:**
  - **N:** North (Positive y)
  - **S:** South (Negative y)
  - **E:** East (Positive x)
  - **W:** West (Negative x)
  - **U:** Up (Positive z)
  - **D:** Down (Negative z)

## Commands

1. **Movement Commands:**
   - **f:** Move forward in the current direction
   - **b:** Move backward in the current direction

2. **Rotation Commands:**
   - **l:** Rotate 90 degrees left
   - **r:** Rotate 90 degrees right
   - **u:** Change direction to Up
   - **d:** Change direction to Down

## Examples

### Example 1

**Starting Point:** (0, 0, 0)  
**Initial Direction:** N  
**Commands:** ["f", "r", "f", "l", "b"]

#### Step-by-Step Execution

1. **Initial State:**
   - Position: (0, 0, 0)
   - Direction: N

2. **Command "f":**
   - Move forward (North)
   - New Position: (0, 1, 0)
   - Direction: N

3. **Command "r":**
   - Rotate right (East)
   - New Position: (0, 1, 0)
   - Direction: E

4. **Command "f":**
   - Move forward (East)
   - New Position: (1, 1, 0)
   - Direction: E

5. **Command "l":**
   - Rotate left (North)
   - New Position: (1, 1, 0)
   - Direction: N

6. **Command "b":**
   - Move backward (South)
   - New Position: (1, 0, 0)
   - Direction: N

#### Final Outcome

- **Final Position:** (1, 0, 0)
- **Final Direction:** N

## Setup and Usage

### Prerequisites

- Java 11 or higher
- Maven

### Running the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/sujaybn/C3PO.git
   cd C3PO
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

3. Run the main (Main.java) class 

### Example Usage

You can test the application by providing input through the command line or a configuration file. The application will process the commands and output the final position and direction of the spacecraft.

### Sample Input/Output

```
    Enter initial x coordinate:
    0
    Enter initial y coordinate:
    0
    Enter initial z coordinate:
    0
    Enter initial direction (N, S, E, W, U, D):
    N
    Enter commands (as a single string, e.g., 'frulb'):
    frulb
    Final Position: Position{x=1, y=0, z=0}
    Final Direction: N
```
### Sample Code Structure

Here's a brief overview of the key classes in the project:

- `Main.java` : This class handles command-line input and processes the commands to control the spacecraft.
- `Spacecraft.java`: Contains the main logic for spacecraft movement and rotation.
- `CommandProcessor.java`: Parses and executes commands.
- `Direction.java`: Enum representing the possible directions (N, S, E, W, U, D).
- `Position.java`: Represents the spacecraft's position in the galactic coordinates.

### Testing evidences

Kindly navigate to src/test/evidences directory to find the testing evidences at different stages of the build process. 
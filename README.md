# JavaGui

A minimal Java Swing project demonstrating how to create and customize a basic window (JFrame). The repository is organized to be modular, so additional GUI packages can be added under src as the project grows.

## Overview
- Stack: Java (JDK), Swing (javax.swing), AWT (java.awt)
- Package manager/build tool: None currently (plain IntelliJ IDEA project). TODO: Consider adding Gradle or Maven for reproducible builds.
- Entry point: Frames.Main (src/Frames/Main.java)
- Current packages:
  - Frames: Contains a simple MyFrame class that sets up a JFrame and a Main launcher.

## Requirements
- Java Development Kit (JDK) 8+ (JDK 11+ recommended)
- IntelliJ IDEA (optional but recommended) or any Java IDE
- OS: Cross‑platform. The commands below are shown for Windows PowerShell; adjust for your shell/OS as needed.

Environment variables:
- JAVA_HOME should point to your JDK installation.
- Ensure %JAVA_HOME%\bin (Windows) or $JAVA_HOME/bin (macOS/Linux) is on your PATH so javac and java are available.

## Setup and Run
You can open the project in IntelliJ IDEA and use the Run configuration for Frames.Main, or build and run from the command line.

### Run with IntelliJ IDEA
1. Open the project directory (JavaGui) in IntelliJ.
2. Mark src as a Sources Root if not already.
3. Create a Run Configuration for the main class: Frames.Main.
4. Click Run.

### Build and run from the command line (Windows PowerShell)
Compile to an out directory and run the main class:

- Create an output directory (first time only):
  `mkdir -Force out`

- Compile:
  javac -d out -cp src src\Frames\Main.java

- Run:
  java -cp out Frames.Main

Note: The MyFrame class references an icon at a hard-coded absolute path. If the icon does not exist on your machine, the window will still open but without the icon. See the Configuration below for options.

## Configuration
- Window icon: MyFrame currently loads an image via an absolute path (C:\Users\hp\OneDrive\Documents\Assets\COMSATS.png).
  - Option A: Update the path in src/Frames/MyFrame.java to point to an image available on your machine.
  - Option B: Refactor to use a resource on the classpath (recommended for portability). TODO: Move the icon into a resources folder and load via getResource.

## Scripts
There are no project scripts yet. Typical future additions:
- Gradle tasks (build, run, test)
- Maven goals
- Simple PowerShell/Bash scripts to compile and run

TODO:
- Decide on a build tool and add standard scripts.

## Tests
There are no automated tests at the moment.

TODO:
- Introduce a testing framework (e.g., JUnit) and add sample tests for window creation logic or utility classes.

## Project Structure
```- JavaGui.iml                (IntelliJ IDEA module file)
- src/
  - Frames/
    - Main.java              (application entry point)
    - MyFrame.java           (JFrame subclass with basic configuration)
    - README.md              (package-level documentation)
- out/                       (compiled classes; generated during builds)
```
As the project grows, place each feature or GUI demo in its own package under src with its own README.

## Modular Documentation
This repository uses a modular documentation approach:
- Root README (this file) provides overview, setup, and common tasks.
- Each package under src should include its own README.md describing its purpose, usage, and any specifics.

Current package docs:
- src/Frames/README.md — basic docs for the Frames package (see below for enhancements).

## License
No license file is present.

TODO:
- Choose and add a LICENSE file (e.g., MIT, Apache-2.0). Update this section once selected.

## Contributing
For now, this is a personal learning/demo repository.

TODO:
- Add contributing guidelines if external contributions are expected in the future.

## Known Issues
- Absolute path to the window icon reduces portability.
- No standardized build tool or tests are configured yet.

## Changelog
- 2025-10-22: Initial repository documentation added (root and package-level readmes).

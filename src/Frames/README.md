# Frames Package

A simple Java Swing package demonstrating basic window frame creation and customization.

## Overview
This package shows how to create a custom JFrame (MyFrame) and launch it from a main class (Main). It configures title, size, close operation, resizability, background color, and an optional window icon.

## Entry Points
- Main class: Frames.Main (src/Frames/Main.java)
- UI class: Frames.MyFrame (src/Frames/MyFrame.java)

## How to Run (Windows PowerShell)
From the repository root (JavaGui):

- Compile:
  javac -d out -cp src src\Frames\Main.java

- Run:
  java -cp out Frames.Main

Alternative: Use IntelliJ IDEA and run Frames.Main.

## Classes
- MyFrame: Extends javax.swing.JFrame and sets up basic window properties.
  - Title: "My Frame"
  - Size: 420x420
  - Not resizable
  - Default close operation: EXIT_ON_CLOSE
  - Background color: new Color(245, 189, 2)
  - Icon: loaded from an absolute path if present (see Notes)
- Main: Program entry point that constructs a new MyFrame instance.

## Notes
- Window icon path in MyFrame is currently hard-coded to an absolute location:
  C:\Users\hp\OneDrive\Documents\Assets\COMSATS.png
  If this file is not present on your system, the frame will open without a custom icon.

## TODOs
- Replace the absolute icon path with a classpath resource (e.g., place the image under a resources folder and load with getResource).
- Add unit tests if utility methods are introduced in future iterations.
- Consider moving this demo under a Gradle/Maven build once the repository grows.

## Package Structure
- Main.java — application entry that constructs MyFrame
- MyFrame.java — JFrame subclass with frame styling

# JavaGui - Java Swing GUI Components Library

A modular collection of Java Swing GUI components and examples for learning and rapid application development.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Components](#components)
- [Usage Examples](#usage-examples)
- [Contributing](#contributing)
- [Requirements](#requirements)

## Overview

This repository contains a modular collection of Java Swing GUI components organized by functionality. Each module demonstrates best practices for creating desktop applications using Java's Swing framework.

**Purpose:**
- Learn Java Swing fundamentals
- Reusable GUI components
- Quick reference for common UI patterns
- Foundation for building desktop applications

## Project Structure

```
JavaGui/
├── src/
│   ├── Frames/          # Frame components and window management
│   │   ├── Main.java    # Entry point with basic frame demo
│   │   ├── MyFrame.java # Custom JFrame implementation
│   │   └── README.md    # Frame-specific documentation
│   └── Labels/          # Label components and examples
│       └── Label.java   # JLabel implementation with icons and styling
├── README.md            # This file
└── JavaGui.iml          # IntelliJ IDEA module file
```

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- **IDE**: IntelliJ IDEA, Eclipse, or any Java IDE (optional)
- **Assets**: Some examples reference external image files (see Configuration)

### Configuration

Before running examples that use images, update the icon path in the source files:

```java
// Change this path to match your system
ImageIcon icon = new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Assets\\COMSATS.png");
```

Or set it to `null` / remove icon-related code if you don't have assets.

### Running Examples

#### Using Command Line

```cmd
# Navigate to project root
cd C:\Users\hp\OneDrive\Documents\JavaGui

# Compile all Java files
javac -d bin src\Frames\*.java src\Labels\*.java

# Run specific examples
java -cp bin Frames.Main
java -cp bin Labels.Label
```

#### Using IDE

1. Open the project in your IDE
2. Navigate to any main class (e.g., `Frames.Main` or `Labels.Label`)
3. Right-click and select "Run"

## Components

### Frames Module (`src/Frames/`)

**MyFrame.java** - Custom JFrame implementation with:
- Window configuration (size, title, close operation)
- Icon support
- Background color customization
- Non-resizable window setting

**Main.java** - Demonstrates frame instantiation and usage

[Detailed Frames Documentation](src/Frames/README.md)

### Labels Module (`src/Labels/`)

**Label.java** - JLabel component demonstration featuring:
- Text and icon combination
- Horizontal and vertical text positioning
- Alignment settings (center, top, bottom)
- Custom fonts and styling
- Icon-text gap customization
- Thread-safe UI updates with SwingUtilities

## Usage Examples

### Creating a Basic Frame

```java
import Frames.MyFrame;

public class Example {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
```

### Creating a Label with Custom Styling

```java
import javax.swing.*;
import java.awt.*;

public class CustomLabel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JLabel label = new JLabel("Your Text Here");
            label.setFont(new Font("SansSerif", Font.BOLD, 16));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            
            JFrame frame = new JFrame();
            frame.add(label);
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
```

## Requirements

- **Java**: JDK 8+
- **Dependencies**: Java Swing (included in JDK)
  - `javax.swing.*`
  - `java.awt.*`

## Learning Path

1. **Frames** - Start with basic window creation and configuration
2. **Labels** - Learn text and icon display with styling
3. **Future Modules** - More components coming soon!

## Future Modules (Planned)

- **Buttons** - Action handling and button styling
- **Panels** - Layout management and container organization
- **TextFields** - User input and validation
- **Menus** - Menu bars and popup menus
- **Dialogs** - Modal dialogs and user prompts
- **Tables** - Data display and manipulation
- **Lists** - Scrollable list components
- **Custom Components** - Building reusable custom widgets

## Contributing

This is a learning project. Feel free to:
1. Add new component modules following the existing structure
2. Improve existing examples
3. Add documentation
4. Report issues or suggest improvements

### Adding a New Module

1. Create a new package under `src/` (e.g., `src/Buttons/`)
2. Implement your component examples
3. Add a README.md in the module directory
4. Update this central README with the new module info

## Best Practices Demonstrated

- Event Dispatch Thread usage (`SwingUtilities.invokeLater`)
- Modular package organization
- Separation of concerns (Frame class vs Main class)
- Consistent naming conventions
- Documentation and comments

## License

This project is intended for educational purposes.

## Author

Created as a learning resource for Java Swing GUI development.

---

**Last Updated:** October 2025

**Note:** This is an active learning project. Components and documentation are continuously being refined and expanded.


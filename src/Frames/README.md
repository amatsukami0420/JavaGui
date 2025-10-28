# Frames Module

This module demonstrates Java Swing JFrame usage and window management fundamentals.

## Contents

- `MyFrame.java` - Custom JFrame implementation
- `Main.java` - Entry point demonstrating frame usage

## Overview

The Frames module teaches the fundamentals of creating and configuring windows in Java Swing. It demonstrates both basic JFrame instantiation and custom JFrame subclassing.

## Components

### MyFrame.java

A custom JFrame subclass that encapsulates common window configuration:

**Features:**
- Custom window title
- Fixed window size (420x420 pixels)
- Non-resizable window
- Custom icon support
- Background color customization (golden yellow: RGB 245, 189, 2)
- Proper close operation (EXIT_ON_CLOSE)
- Immediate visibility

**Usage:**
```java
MyFrame frame = new MyFrame();
// Frame is automatically configured and visible
```

### Main.java

Demonstrates two approaches to creating frames:

1. **Direct JFrame instantiation** (commented code) - Shows manual configuration
2. **Custom class approach** (active code) - Uses MyFrame for cleaner code

## Running the Examples

### Option 1: Command Line

```cmd
# Compile
javac -d bin src\Frames\*.java

# Run
java -cp bin Frames.Main
```

### Option 2: IDE

1. Open `Main.java` in your IDE
2. Right-click and select "Run Main.main()"

## Learning Points

### 1. Frame Configuration Methods

| Method | Purpose | Example Value |
|--------|---------|---------------|
| `setTitle()` | Set window title | "My Frame" |
| `setSize()` | Set window dimensions | 420 x 420 pixels |
| `setVisible()` | Make window visible | true |
| `setDefaultCloseOperation()` | Define close behavior | EXIT_ON_CLOSE |
| `setResizable()` | Allow/prevent resizing | false |
| `setIconImage()` | Set window icon | ImageIcon |
| `getContentPane().setBackground()` | Set background color | Color object |

### 2. Extending JFrame

**Benefits of creating a custom JFrame class:**
- Encapsulation of configuration
- Reusability across projects
- Cleaner main method
- Easy to modify default settings
- Object-oriented design

### 3. Window Close Operations

| Constant | Behavior |
|----------|----------|
| `DO_NOTHING_ON_CLOSE` | Window closes but app continues |
| `HIDE_ON_CLOSE` | Window hides (default) |
| `DISPOSE_ON_CLOSE` | Window disposed, resources released |
| `EXIT_ON_CLOSE` | Application exits |

## Customization Guide

### Change Window Size

```java
this.setSize(800, 600); // Width x Height in pixels
```

### Change Background Color

```java
// Using RGB values
this.getContentPane().setBackground(new Color(255, 0, 0)); // Red

// Using predefined colors
this.getContentPane().setBackground(Color.BLUE);
```

### Add Custom Icon

```java
// Absolute path
ImageIcon icon = new ImageIcon("C:\\path\\to\\your\\icon.png");

// Relative path (from project root)
ImageIcon icon = new ImageIcon("assets/icon.png");

// From resources
ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png"));

this.setIconImage(icon.getImage());
```

### Make Window Resizable

```java
this.setResizable(true);
```

### Center Window on Screen

```java
this.setLocationRelativeTo(null);
```

## Enhancement Ideas

Try extending MyFrame with these features:

1. **Window centering**
   ```java
   this.setLocationRelativeTo(null);
   ```

2. **Minimum/Maximum size constraints**
   ```java
   this.setMinimumSize(new Dimension(300, 300));
   this.setMaximumSize(new Dimension(1200, 900));
   ```

3. **Full screen mode**
   ```java
   this.setExtendedState(JFrame.MAXIMIZED_BOTH);
   ```

4. **Custom window decorations**
   ```java
   this.setUndecorated(true); // Remove title bar
   ```

5. **Window listener for events**
   ```java
   this.addWindowListener(new WindowAdapter() {
       @Override
       public void windowClosing(WindowEvent e) {
           // Custom close logic
       }
   });
   ```

## Common Issues

### Issue: Icon doesn't display
**Solution:** Verify the icon path is correct and the file exists
```java
File iconFile = new File("path/to/icon.png");
if (iconFile.exists()) {
    ImageIcon icon = new ImageIcon(iconFile.getAbsolutePath());
    this.setIconImage(icon.getImage());
}
```

### Issue: Window appears off-screen
**Solution:** Center the window
```java
this.setLocationRelativeTo(null);
```

### Issue: Application doesn't exit when window closes
**Solution:** Set proper close operation
```java
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

## Related Topics

- Layout Managers (for adding components)
- Event Handling (for user interactions)
- MenuBars (for application menus)
- ToolBars (for quick actions)

## Best Practices

1. Always set a default close operation
2. Make frame visible as the last configuration step
3. Use `SwingUtilities.invokeLater()` in main for thread safety
4. Consider screen size when setting window dimensions
5. Provide meaningful window titles
6. Use descriptive class names for custom frames

## Next Steps

After mastering frames, explore:
- Adding components (Labels module)
- Layout managers
- Event handling
- Multiple window applications

---

[Back to Main README](../../README.md)


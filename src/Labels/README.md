# Labels Module

This module demonstrates Java Swing JLabel usage for displaying text and icons in GUI applications.

## Contents

- `Label.java` - Comprehensive JLabel example with text, icons, and styling

## Overview

The Labels module teaches how to create and configure labels in Java Swing. Labels are fundamental UI components used to display non-editable text, images, or both.

## Component Details

### Label.java

A complete example demonstrating JLabel configuration and best practices.

**Features:**
- Text display with custom font
- Icon integration
- Text positioning relative to icon
- Component alignment
- Icon-text gap customization
- Thread-safe UI updates using SwingUtilities
- Integration with custom frame

**Code Structure:**
```java
SwingUtilities.invokeLater(() -> {
    // Create label with text
    JLabel label = new JLabel("Bro Do you even code");
    
    // Configure icon
    label.setIcon(new ImageIcon("path/to/icon.png"));
    
    // Set text position relative to icon
    label.setHorizontalTextPosition(SwingConstants.CENTER);
    label.setVerticalTextPosition(SwingConstants.BOTTOM);
    
    // Set label alignment in container
    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setVerticalAlignment(SwingConstants.CENTER);
    
    // Customize spacing and font
    label.setIconTextGap(10);
    label.setFont(new Font("SansSerif", Font.BOLD, 16));
    
    // Add to frame
    MyFrame frame = new MyFrame();
    frame.add(label);
});
```

## Running the Example

### Option 1: Command Line

```cmd
# Compile (requires Frames module)
javac -d bin src\Frames\*.java src\Labels\*.java

# Run
java -cp bin Labels.Label
```

### Option 2: IDE

1. Open `Label.java` in your IDE
2. Right-click and select "Run Label.main()"

## Learning Points

### 1. JLabel Text Positioning

#### Horizontal Text Position (relative to icon)

| Constant | Description | Visual |
|----------|-------------|---------|
| `SwingConstants.LEFT` | Text left of icon | `[Text] [Icon]` |
| `SwingConstants.CENTER` | Text centered on icon | `[Text/Icon]` |
| `SwingConstants.RIGHT` | Text right of icon | `[Icon] [Text]` |

#### Vertical Text Position (relative to icon)

| Constant | Description | Visual |
|----------|-------------|---------|
| `SwingConstants.TOP` | Text above icon | `[Text]`<br>`[Icon]` |
| `SwingConstants.CENTER` | Text centered on icon | `[Text+Icon]` |
| `SwingConstants.BOTTOM` | Text below icon | `[Icon]`<br>`[Text]` |

### 2. Label Alignment

Controls where the label appears within its allocated space:

```java
// Horizontal alignment
label.setHorizontalAlignment(SwingConstants.LEFT);    // Left edge
label.setHorizontalAlignment(SwingConstants.CENTER);  // Center (default)
label.setHorizontalAlignment(SwingConstants.RIGHT);   // Right edge

// Vertical alignment
label.setVerticalAlignment(SwingConstants.TOP);       // Top edge
label.setVerticalAlignment(SwingConstants.CENTER);    // Center (default)
label.setVerticalAlignment(SwingConstants.BOTTOM);    // Bottom edge
```

### 3. Font Customization

```java
// Font constructor: Font(name, style, size)
label.setFont(new Font("SansSerif", Font.BOLD, 16));

// Available styles
Font.PLAIN      // Normal text
Font.BOLD       // Bold text
Font.ITALIC     // Italic text
Font.BOLD | Font.ITALIC  // Bold and italic

// Common font families
"SansSerif", "Serif", "Monospaced", "Dialog", "Arial", "Times New Roman"
```

### 4. SwingUtilities.invokeLater()

**Why use it?**
- Ensures UI updates happen on the Event Dispatch Thread (EDT)
- Prevents threading issues
- Best practice for Swing applications

```java
SwingUtilities.invokeLater(() -> {
    // All UI code goes here
});
```

## Customization Guide

### Change Label Text

```java
// At creation
JLabel label = new JLabel("Your text here");

// After creation
label.setText("New text");

// HTML formatting
label.setText("<html>Line 1<br>Line 2</html>");
```

### Add or Change Icon

```java
// From file path
label.setIcon(new ImageIcon("path/to/image.png"));

// From resources
label.setIcon(new ImageIcon(getClass().getResource("/image.png")));

// Remove icon
label.setIcon(null);
```

### Change Colors

```java
// Text color
label.setForeground(Color.RED);
label.setForeground(new Color(255, 100, 50));

// Background color (must make opaque)
label.setOpaque(true);
label.setBackground(Color.YELLOW);
```

### Add Borders

```java
import javax.swing.border.*;

// Line border
label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

// Empty border (padding)
label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

// Titled border
label.setBorder(BorderFactory.createTitledBorder("Title"));

// Compound border (multiple borders)
Border outer = BorderFactory.createLineBorder(Color.BLACK);
Border inner = BorderFactory.createEmptyBorder(5, 5, 5, 5);
label.setBorder(BorderFactory.createCompoundBorder(outer, inner));
```

### Adjust Icon-Text Gap

```java
label.setIconTextGap(20); // 20 pixels between icon and text
```

## Layout Examples

### Text Below Icon (Current Example)

```java
label.setHorizontalTextPosition(SwingConstants.CENTER);
label.setVerticalTextPosition(SwingConstants.BOTTOM);
```
Result: Icon on top, text centered below

### Text Right of Icon

```java
label.setHorizontalTextPosition(SwingConstants.RIGHT);
label.setVerticalTextPosition(SwingConstants.CENTER);
```
Result: Icon on left, text to the right

### Icon-Only Label

```java
JLabel label = new JLabel();
label.setIcon(new ImageIcon("icon.png"));
// No text set
```

### Text-Only Label

```java
JLabel label = new JLabel("Just text, no icon");
// No icon set
```

## Advanced Techniques

### Multi-line Labels with HTML

```java
label.setText("<html>" +
    "<h1>Title</h1>" +
    "<p>This is a paragraph with <b>bold</b> and <i>italic</i> text.</p>" +
    "<ul>" +
    "<li>Item 1</li>" +
    "<li>Item 2</li>" +
    "</ul>" +
    "</html>");
```

### Dynamic Label Updates

```java
// In a timer or event handler
Timer timer = new Timer(1000, e -> {
    label.setText("Time: " + System.currentTimeMillis());
});
timer.start();
```

### Tooltips

```java
label.setToolTipText("This appears on hover");
```

### Click Events on Labels

```java
label.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Label clicked!");
    }
});

// Change cursor on hover
label.setCursor(new Cursor(Cursor.HAND_CURSOR));
```

## Common Issues

### Issue: Icon doesn't display
**Solution:** 
1. Verify file path is correct
2. Check file format (PNG, JPG, GIF supported)
3. Use absolute path or verify relative path from project root

```java
File iconFile = new File("path/to/icon.png");
System.out.println("Icon exists: " + iconFile.exists());
```

### Issue: Text is cut off
**Solution:** 
1. Increase frame/container size
2. Use HTML for text wrapping
3. Adjust label's preferred size

```java
label.setPreferredSize(new Dimension(300, 100));
```

### Issue: Background color doesn't show
**Solution:** Make label opaque

```java
label.setOpaque(true);
label.setBackground(Color.YELLOW);
```

### Issue: Alignment doesn't work
**Solution:** Ensure the label has enough space

```java
// Label needs more space than its content to show alignment
frame.setLayout(new BorderLayout());
frame.add(label, BorderLayout.CENTER);
```

## Quick Reference

### Essential Methods

| Method | Purpose |
|--------|---------|
| `setText(String)` | Set label text |
| `setIcon(Icon)` | Set label icon |
| `setFont(Font)` | Set text font |
| `setForeground(Color)` | Set text color |
| `setBackground(Color)` | Set background color |
| `setHorizontalAlignment(int)` | Align label in container |
| `setVerticalAlignment(int)` | Align label in container |
| `setHorizontalTextPosition(int)` | Position text relative to icon |
| `setVerticalTextPosition(int)` | Position text relative to icon |
| `setIconTextGap(int)` | Set spacing between icon and text |
| `setBorder(Border)` | Add border |
| `setToolTipText(String)` | Add tooltip |
| `setOpaque(boolean)` | Make background visible |

### Alignment Constants

```java
SwingConstants.LEFT
SwingConstants.CENTER
SwingConstants.RIGHT
SwingConstants.TOP
SwingConstants.BOTTOM
SwingConstants.LEADING  // Left in LTR, Right in RTL
SwingConstants.TRAILING // Right in LTR, Left in RTL
```

## Best Practices

1. Use `SwingUtilities.invokeLater()` for thread safety
2. Use HTML for complex text formatting
3. Set appropriate alignment for better layouts
4. Use meaningful label text for accessibility
5. Consider icon size (16x16, 24x24, 32x32 are common)
6. Use tooltips to provide additional information
7. Test with different font sizes for accessibility

## Next Steps

After mastering labels, explore:
- Buttons (clickable labels with actions)
- Text fields (editable text input)
- Panels and layout managers (organizing multiple labels)
- Custom label components (extending JLabel)

## Related Components

- **JButton** - Clickable component with text/icon
- **JTextField** - Editable text input
- **JTextArea** - Multi-line text display/input
- **JPanel** - Container for organizing labels

---

[Back to Main README](../../README.md)


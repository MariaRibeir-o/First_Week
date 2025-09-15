# First_Exercise - Swing GUI

This project is an introductory exercise in **Java Swing**, aiming to explore basic GUI classes to build simple user interfaces.

## 🎯 Objective

The exercise involves creating a graphical window in Java using:

- **JFrame** → Main window.  
- **JPanel** → Panel for organizing components.  
- **JLabel** → Text labels.  
- **JTextField** → Editable text fields.  
- **JButton** → Action button.  
- **JCheckBox** → Checkbox.  
- **FlowLayout** and **GridLayout** → Layout managers for arranging components.  

The window allows dynamic changes to:  
- The **window title**.  
- Its **width and height**.  
- Its **screen position** (top-left corner by default, or centered if the checkbox is selected).  

---

## 🖥️ Features

- Enter values in the text fields for **title, width, and height**.  
- Clicking the `update` button will:  
  - Update the window title.  
  - Resize the window according to the input values.  
  - If the **center** checkbox is selected, the window will move to the center of the screen.  
  - Otherwise, it will reset its position to `(0,0)`.  

---

## ⚙️ How to Run

1. Make sure you have **Java 17+** installed.  
2. Clone or copy the project files.  
3. Compile the main file:

   ```bash
   javac First_Exercise.java

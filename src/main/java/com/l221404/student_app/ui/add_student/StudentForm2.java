package com.l221404.student_app.ui.add_student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm2 extends JFrame {
    private JTextField nameField, dobField, addressField;
    private JComboBox<String> majorComboBox;
    private JTextField javaScoreField, cssScoreField, htmlScoreField;
    private JTextField marketingScoreField, salesScoreField;
    private JButton addButton, resetButton;
    private JPanel softwarePanel, economicsPanel, dynamicPanel;

    public StudentForm2() {
        setTitle("Student Registration Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for common fields
        JPanel commonPanel = new JPanel(new GridLayout(4, 2));
        commonPanel.setBorder(BorderFactory.createTitledBorder("Student Information"));

        // Student name
        commonPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        commonPanel.add(nameField);

        // Student date of birth
        commonPanel.add(new JLabel("Date of Birth (dd/MM/yyyy):"));
        dobField = new JTextField();
        commonPanel.add(dobField);

        // Student address
        commonPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        commonPanel.add(addressField);

        // Student major (ComboBox)
        commonPanel.add(new JLabel("Major:"));
        majorComboBox = new JComboBox<>(new String[]{"Software", "Economics"});
        commonPanel.add(majorComboBox);

        // Dynamic panel to swap between software and economics panels
        dynamicPanel = new JPanel(new CardLayout());

        // Panel for Software Major
        softwarePanel = new JPanel(new GridLayout(3, 2));
        softwarePanel.setBorder(BorderFactory.createTitledBorder("Software Scores"));

        // Set preferred size to control height
        Dimension scoreFieldSize = new Dimension(100, 25);  // Adjust height to 25 pixels

        javaScoreField = new JTextField();
        javaScoreField.setPreferredSize(scoreFieldSize);
        softwarePanel.add(new JLabel("Java Score:"));
        softwarePanel.add(javaScoreField);

        cssScoreField = new JTextField();
        cssScoreField.setPreferredSize(scoreFieldSize);
        softwarePanel.add(new JLabel("CSS Score:"));
        softwarePanel.add(cssScoreField);

        htmlScoreField = new JTextField();
        htmlScoreField.setPreferredSize(scoreFieldSize);
        softwarePanel.add(new JLabel("HTML Score:"));
        softwarePanel.add(htmlScoreField);

        // Panel for Economics Major
        economicsPanel = new JPanel(new GridLayout(2, 2));
        economicsPanel.setBorder(BorderFactory.createTitledBorder("Economics Scores"));

        marketingScoreField = new JTextField();
        marketingScoreField.setPreferredSize(scoreFieldSize);
        economicsPanel.add(new JLabel("Marketing Score:"));
        economicsPanel.add(marketingScoreField);

        salesScoreField = new JTextField();
        salesScoreField.setPreferredSize(scoreFieldSize);
        economicsPanel.add(new JLabel("Sales Score:"));
        economicsPanel.add(salesScoreField);

        // Add both panels to the dynamic panel
        dynamicPanel.add(softwarePanel, "Software");
        dynamicPanel.add(economicsPanel, "Economics");

        // Initially show the panel for Software Major
        CardLayout cl = (CardLayout)(dynamicPanel.getLayout());
        cl.show(dynamicPanel, "Software");

        // Major selection handler
        majorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMajor = (String) majorComboBox.getSelectedItem();
                if (selectedMajor.equals("Software")) {
                    cl.show(dynamicPanel, "Software");
                } else {
                    cl.show(dynamicPanel, "Economics");
                }
            }
        });

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        addButton = new JButton("Add Student");
        resetButton = new JButton("Reset");

        buttonPanel.add(addButton);
        buttonPanel.add(resetButton);

        // Add panels to frame
        add(commonPanel, BorderLayout.NORTH);
        add(dynamicPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.PAGE_END);

        // Button listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAddStudent();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });
    }

    // Handling Add Student logic
    private void handleAddStudent() {
        String name = nameField.getText();
        String dob = dobField.getText();
        String address = addressField.getText();
        String major = (String) majorComboBox.getSelectedItem();

        // Validate and fetch scores based on selected major
        if (major.equals("Software")) {
            String javaScore = javaScoreField.getText();
            String cssScore = cssScoreField.getText();
            String htmlScore = htmlScoreField.getText();
            // Process and validate Software scores
            System.out.println("Adding Software Student: " + name + ", " + dob + ", Java: " + javaScore);
        } else if (major.equals("Economics")) {
            String marketingScore = marketingScoreField.getText();
            String salesScore = salesScoreField.getText();
            // Process and validate Economics scores
            System.out.println("Adding Economics Student: " + name + ", " + dob + ", Marketing: " + marketingScore);
        }

        // Further validation and logic can be added here
        JOptionPane.showMessageDialog(this, "Student added successfully!");
    }

    // Reset form fields
    private void resetForm() {
        nameField.setText("");
        dobField.setText("");
        addressField.setText("");
        javaScoreField.setText("");
        cssScoreField.setText("");
        htmlScoreField.setText("");
        marketingScoreField.setText("");
        salesScoreField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentForm2 form = new StudentForm2();
            form.setVisible(true);
        });
    }
}
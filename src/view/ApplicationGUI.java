package view;

import application.Generator;

import javax.swing.*;

public class ApplicationGUI extends JFrame {
    private JPanel mainPanel;
    private JLabel lengthLabel;
    private JTextField lengthField;
    private JButton generateBtn;
    private JLabel resultLabel;
    private JTextField resultField;

    public ApplicationGUI() {
        setTitle("Password Generator");
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);

        ImageIcon img = new ImageIcon("img/password-generator-ico.jpg");
        setIconImage(img.getImage());

        generateBtn.addActionListener(e -> {
            try {
                int length = Integer.parseInt(lengthField.getText());

                if (length >= 4) {
                    resultField.setText(Generator.generatePassword(length));
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Error: The length was not sufficient",
                            "Password Generator",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(
                        null,
                        "Error: The input was not an integer as expected.",
                        "Password Generator",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
    }
}
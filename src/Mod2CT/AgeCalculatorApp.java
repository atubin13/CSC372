package Mod2CT;

//import the needed java utilities
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeCalculatorApp {
    private final JTextField birthdateField;
    private final JLabel resultLabel;

    //GUI setup for calculator
    public AgeCalculatorApp() {
        JFrame frame = new JFrame("Age Calculator");
        JPanel panel = new JPanel();
        //Input field and label above
        JLabel birthdateLabel = new JLabel("Enter your birthdate (MM/dd/yyyy):");
        birthdateField = new JTextField(10);
        //Button for age calculation
        JButton calculateButton = new JButton("Calculate Age");
        resultLabel = new JLabel();

        calculateButton.addActionListener(e -> calculateAge());

        //Sets the layout and size
        panel.setLayout(new FlowLayout());
        panel.add(birthdateLabel);
        panel.add(birthdateField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    //Try and catch to make sure date is entered in the proper format
    private void calculateAge() {
        String birthdateStr = birthdateField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date birthdate = sdf.parse(birthdateStr);
            Date currentDate = new Date();
            long ageInMillis = currentDate.getTime() - birthdate.getTime();
            long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365);

            resultLabel.setText("Your age is: " + ageInYears + " years");
        } catch (ParseException e) {
            resultLabel.setText("Invalid date format. Please use MM/dd/yyyy.");
        }
    }

    //EDT execution statement
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AgeCalculatorApp::new);
    }
}

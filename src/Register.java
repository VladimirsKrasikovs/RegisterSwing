import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {

    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfNumber;
    private JComboBox cbCountry;
    private JTextField tfCity;
    private JPasswordField tfPassword;
    private JRadioButton male;
    private JRadioButton female;
    private JButton btnRegister;
    private JPanel Registration;

    private JTextField textField1;
    private JTextArea text1;

    private JFrame frame;

    public Register(){

        frame = new JFrame ("Registration");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(650,450));
        frame.setResizable(false);

        frame.add(Registration);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        text1.setEditable(false);


        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String inString = tfName.getText();
                String inString2 = tfEmail.getText();
                String inString3= tfNumber.getText();
                String inString4 = tfCity.getText();


                text1.setText("Your input field values are:"+"\n"+ inString + "\n"+inString2 + "\n" + inString3+"\n"+inString4);
            }
        });
    }

    public static void main(String[] args) {
        new Register();
    }


    }



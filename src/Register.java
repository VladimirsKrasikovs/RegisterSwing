import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registr extends JDialog {
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfNumber;
    private JComboBox cbCountry;
    private JTextField tfCity;
    private JTextField tfStreet;
    private JPasswordField tfPassword;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton btnRegister;
    private JPanel Registration;
    private JList list1;
    private JTextField result;


    public Registr (JFrame parent){
        super (parent);
        setTitle("Create new account");
        setContentPane(Registration);
        setMinimumSize(new Dimension(600,500));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfName.setText(list1.toString());


            }
        });
    }

   // private void submitData() {
        //if (tfName.getText().equals("") || tfEmail.getText().equals("") || tfNumber.getText().equals("")){
           // JOptionPane.showMessageDialog(this,"Please enter WORD");
       // } else{
            //tfName.setText(result.getText());
            //tfEmail.setText(result.getText());


       // }
    //}

    public static void main(String[] args) {
        Registr form = new Registr(null);
    }

    }




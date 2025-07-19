package bank.management.system;


import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {

    
    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, upazilaTextField, zilaTextField, postcodeTextField;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;
    JButton next;
    
    SignupOne() {
        setLayout(null);
        
        Random ran = new Random();
      random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM No." + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 32));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
       personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
       name.setBounds(100, 140, 100, 30);
        add(name);
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
       fname.setBounds(100, 190, 200, 30);
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
       dob.setBounds(100, 240, 200, 30);
        add(dob);
        
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
       gender.setBounds(100, 290, 200, 30);
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300, 290, 100, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
         female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
      email.setBounds(100, 340, 200, 30);
        add(email);
        
         emailTextField = new JTextField();
       emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
      emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
      marital.setBounds(100, 390, 200, 30);
        add(marital);
        
         married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 70, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalrgroup = new ButtonGroup();
        maritalrgroup.add(married);
        maritalrgroup.add(unmarried);
      maritalrgroup.add(other);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
      address.setBounds(100, 440, 200, 30);
        add(address);
        
       addressTextField = new JTextField();
       addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
      addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel upazila = new JLabel("Upazila:");
        upazila.setFont(new Font("Raleway", Font.BOLD, 20));
     upazila.setBounds(100, 490, 200, 30);
        add(upazila);
        
         upazilaTextField = new JTextField();
       upazilaTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       upazilaTextField.setBounds(300, 490, 400, 30);
        add(upazilaTextField);
        
        JLabel zila = new JLabel("Zila:");
        zila.setFont(new Font("Raleway", Font.BOLD, 20));
      zila.setBounds(100, 540, 200, 30);
        add(zila);
        
         zilaTextField = new JTextField();
       zilaTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       zilaTextField.setBounds(300, 540, 400, 30);
        add(zilaTextField);
        
        JLabel postcode = new JLabel("Post Code:");
       postcode.setFont(new Font("Raleway", Font.BOLD, 20));
      postcode.setBounds(100, 590, 200, 30);
        add(postcode);
        
         postcodeTextField = new JTextField();
       postcodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
      postcodeTextField.setBounds(300, 590, 400, 40);
        add(postcodeTextField);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font ("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random; // long
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        
        }else if (female.isSelected()) {
        }
        
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        
        }else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()){
            marital = "other";
        
        }
        
        String address = addressTextField.getText();
        String upazila = upazilaTextField.getText();
        String zila = zilaTextField.getText();
        String postcode = postcodeTextField.getText();
        
        
        try {
            if (name.equals("")){
                
                JOptionPane.showMessageDialog(null, "Name is Required");
             } else {
            Conn c = new Conn();
            String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+upazila+"', '"+postcode+"', '"+zila+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupTwo(formno).setVisible(true);

        
        }
        
        }catch (Exception e) {
            System.out.println(e);
        
        }
    }
    
    public static void main(String args[]) {
        
        new SignupOne();
    
    }
    
}

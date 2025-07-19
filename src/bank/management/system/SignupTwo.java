package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {

    
    
    JTextField br, nid;
    JRadioButton syes, sno, eyes, eno;
    
    JButton next;
    JComboBox religion, category, occupation, education, income;
    String formno;
    
    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
       additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
       name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu", "Islam", "Buddha", "Christan", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
       fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        
        
        String valCategory[] = {"General", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
       dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomecategory[] = {"Null", "< 20,000", "< 50,000", "<1,00,000", "Upto 5,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
       income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
       gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        
        JLabel email = new JLabel("Qalification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
      email.setBounds(100, 315, 200, 30);
        add(email);
        
        String educationLevel[] = {"JSC", "SSC", "HSC", "", "Bachelor's", "Master's", "PhD", "Other"};
       education = new JComboBox(educationLevel);
        education.setBounds(300, 315, 400, 30);
       education.setBackground(Color.WHITE);
        add(education);
        
         
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
      marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String occupations[] = {"Teacher", "Farmer", "Employed", "Businessman", "", "Student", "Retired", "Other"};
       occupation = new JComboBox(occupations);
        occupation.setBounds(300, 390, 400, 30);
       occupation.setBackground(Color.WHITE);
        add(occupation);
        
         JLabel address = new JLabel("BR Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
      address.setBounds(100, 440, 200, 30);
        add(address);
        
       br = new JTextField();
        br.setFont(new Font("Raleway", Font.BOLD, 14));
      br.setBounds(300, 440, 400, 30);
        add( br);
        
        JLabel upazila = new JLabel("NID Number:");
        upazila.setFont(new Font("Raleway", Font.BOLD, 20));
     upazila.setBounds(100, 490, 200, 30);
        add(upazila);
        
         nid = new JTextField();
       nid .setFont(new Font("Raleway", Font.BOLD, 14));
       nid .setBounds(300, 490, 400, 30);
        add(nid );
        
        JLabel zila = new JLabel("Senior Citizen:");
        zila.setFont(new Font("Raleway", Font.BOLD, 20));
      zila.setBounds(100, 540, 200, 30);
        add(zila);
        
         syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
         syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
         sno.setBounds(450, 540, 100, 30);
         sno.setBackground(Color.WHITE);
        add( sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        JLabel postcode = new JLabel("Existing Account:");
       postcode.setFont(new Font("Raleway", Font.BOLD, 20));
      postcode.setBounds(100, 590, 200, 30);
        add(postcode);
        
         eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
         eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
         eno.setBounds(450, 590, 100, 30);
         eno.setBackground(Color.WHITE);
        add( eno);
        
        ButtonGroup existinggroup = new ButtonGroup();
       existinggroup.add(eyes);
       existinggroup.add(eno);
        
        
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
       
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
       String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
           seniorcitizen = "Yes";
        
        }else if (sno.isSelected()) {
            seniorcitizen = "No";
        }
        
       
        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        
        }else if (eno.isSelected()) {
         existingaccount = "No";
        
        }
        
        String sbr = br.getText();
        String snid = nid.getText();
        
        
        try {
            
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+sbr+"', '"+snid+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);

        
        
        
        }catch (Exception e) {
            System.out.println(e);
        
        }
    }
    
    public static void main(String args[]) {
        
        new SignupTwo("");
    
    }
    
}

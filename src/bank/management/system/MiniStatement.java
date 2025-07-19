package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {

    MiniStatement(String pinnumber) {
        setTitle("Mini Statement");

        setLayout(null);

        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);

        JLabel bank = new JLabel("Bank of Radi BD");
        bank.setBounds(150, 20, 150, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        try {
            Conn conn = new Conn();

            // ✅ FIX 1: Corrected the table name and column
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '" + pinnumber + "'");
            while (rs.next()) {
                String cardNum = rs.getString("cardnumber");
                card.setText("Card Number: " + cardNum.substring(0, 4) + "xxxxxxxx" + cardNum.substring(12));
            }

        } catch (Exception e) {
            System.out.println("Card number error: " + e);
        }

        try {
            Conn conn = new Conn();
            int bal = 0;

            // ✅ FIX 2: This already works fine — shows all transactions for this PIN
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");
            StringBuilder statement = new StringBuilder("<html>");
            while (rs.next()) {
                statement.append(rs.getString("date")).append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(rs.getString("type")).append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append("BDT ").append(rs.getString("amount")).append("<br><br>");

                // Calculate balance
                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            statement.append("</html>");
            mini.setText(statement.toString());

            balance.setText("Your current account balance is: BDT " + bal);

        } catch (Exception e) {
            System.out.println("Transaction history error: " + e);
        }

        getContentPane().setBackground(Color.WHITE);
        setSize(400, 600);
        setLocation(20, 20);
        setVisible(true);
    }

    public static void main(String args[]) {
        new MiniStatement("1234"); // Use a test pin here
    }
}

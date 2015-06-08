/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.flomedia.lm5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Matt
 */
public class CheckListener implements ActionListener{

    JTextField a;
    JLabel labela;
    CheckListener(JTextField jta, JLabel label) {
        a=jta;
        labela = label;
    }

    CheckListener(JTextField jta) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String pattern = "((([0-9]+(\\.[0-9]+)?(\\+|\\-|\\*|\\:|\\^)?)+|(\\(([0-9]+(\\.[0-9]+)?(\\+|\\-|\\*|\\:|\\^)?)+\\)(\\+|\\-|\\*|\\:|\\^)?))+;)+";
       boolean result = a.getText().matches(pattern);
       if(result){
           labela.setForeground(Color.GREEN);
           labela.setText("Poprawny");
       }
       else {
           labela.setForeground(Color.RED);
           labela.setText("Nie poprawny");
       }
           
    }
    
}

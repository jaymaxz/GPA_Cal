/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Max
 */
public class Gpa implements ActionListener{
    
    int no = 0 ;
    JFrame frame ;
    JTextField number ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gpa gpa1 = new Gpa() ;
        
        // TODO code application logic here
    }
    
    public Gpa(){
        frame = new JFrame("GPA Cal ©Vesta #SE #UOK") ;
        JLabel label = new JLabel("Number of Subjects (max 20)") ;
        JLabel label2 = new JLabel("Please enter only this semesters' number of Subjects.") ;
        JLabel label3 = new JLabel("You can enter your previous gpa in next dialog.") ;
        number = new JTextField() ;
        JButton go = new JButton("Go") ;
        
        frame.add(number) ;
        frame.add(label) ;
        frame.add(label2) ;
        frame.add(label3) ;
        frame.add(go) ;
        
        number.setBounds(150,150,200,50) ;
        go.setBounds(225,250,50,50) ;
        label.setBounds(150,100,200,50) ;
        label2.setBounds(50,350,350,50) ;
        label3.setBounds(50,375,350,50) ;
        
        frame.setLayout(null) ;
        frame.setSize(500,500) ;
        frame.setVisible(true) ;
        frame.setLocation(500,100) ;
        frame.setResizable(false) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        
        go.addActionListener(this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        no = Integer.parseInt(number.getText()) ;
        frame.setVisible(false) ;
        Calculator cal = new Calculator(no) ;
    }
}

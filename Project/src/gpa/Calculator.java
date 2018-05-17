/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Max
 */
public class Calculator implements ActionListener {
    
    JFrame calc ;
    JLabel[] l = new JLabel[21] ;
    JLabel[] m = new JLabel[21] ;
    JComboBox[] t = new JComboBox[20];
    JComboBox[] k = new JComboBox[20];
    JTextField gpa = new JTextField("0") ;
    JTextField crdt = new JTextField("0") ;
    JLabel result = new JLabel();
    int n = 0 ;
    double[] a = new double[21] ;
    int[] b = new int[21] ;

    Calculator(int no) {
        
        n = no ;
        
        calc = new JFrame("GPA Cal ©Vesta #SE #UOK");
        JButton gen = new JButton("Genarate"); 
        
        for(int i=0; i<no; i++){
            l[i] = new JLabel("Subject "+(i+1)+" Grade");
            calc.add(l[i]) ;
            l[i].setBounds(50,25*i,100,25) ;
            
            t[i] = new JComboBox(new String[] {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","E"}) ;
            calc.add(t[i]) ;
            t[i].setBounds(150,25*i,50,25);
            
            m[i] = new JLabel("Credits");
            calc.add(m[i]) ;
            m[i].setBounds(250,25*i,100,25) ;
            
            k[i] = new JComboBox(new String[] {"1","2","3","4","5","6","7","8","9","10"}) ;
            calc.add(k[i]) ;
            k[i].setBounds(350,25*i,50,25);
        }
        
        l[no] = new JLabel("Previuos GPA ") ;
        calc.add(l[no]) ;
        l[no].setBounds(50,25*no,100,25) ;
        
        m[no] = new JLabel("Credits") ;
        calc.add(m[no]) ;
        m[no].setBounds(250,25*no,100,25) ;
        
        calc.add(gen) ;
        gen.setBounds(200,25*no+50,100,50) ;
        
        calc.add(gpa) ;
        gpa.setBounds(150,25*no,50,25);
        
        calc.add(crdt) ;
        crdt.setBounds(350,25*no,50,25) ;
        
        calc.add(result) ;
        result.setBounds(150,25*no+100,200,50) ;
        
        calc.setLayout(null) ;
        calc.setSize(500,25*no+200) ;
        calc.setVisible(true) ;
        calc.setLocation(500,100) ;
        calc.setResizable(false) ;
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        
        gen.addActionListener(this);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
         
        for(int i=0; i<n; i++){
            switch(t[i].getSelectedItem().toString()){
                case "A+" :
                    a[i] = 4.0 ;
                    break ;
                case "A" :
                    a[i] = 4.0 ;
                    break ;
                case "A-" :
                    a[i] = 3.7 ;
                    break ;
                case "B+" :
                    a[i] = 3.3 ;
                    break ;
                case "B" :
                    a[i] = 3.0 ;
                    break ;
                case "B-" :
                    a[i] = 2.7 ;
                    break ;
                case "C+" :
                    a[i] = 2.3 ;
                    break ;
                case "C" :
                    a[i] = 2.0 ;
                    break ;
                case "C-" :
                    a[i] = 1.7 ;
                    break ;
                case "D+" :
                    a[i] = 1.3 ;
                    break ;
                case "D" :
                    a[i] = 1.0 ;
                    break ;
                case "E" :
                    a[i] = 0.0 ;
                    break ;
            }
            switch(Integer.parseInt(k[i].getSelectedItem().toString())){
                case 1 :
                    b[i] = 1 ;
                    break ;
                case 2 :
                    b[i] = 2 ;
                    break ;
                case 3 :
                    b[i] = 3 ;
                    break ;
                case 4 :
                    b[i] = 4 ;
                    break ;
                case 5 :
                    b[i] = 5 ;
                    break ;
                case 6 :
                    b[i] = 6 ;
                    break ;
                case 7 :
                    b[i] = 7 ;
                    break ;
                case 8 :
                    b[i] = 8 ;
                    break ;
                case 9 :
                    b[i] = 9 ;
                    break ;
                case 10 :
                    b[i] = 10 ;
                    break ;
            }
        }
        
        a[n] = Double.parseDouble(gpa.getText()) ;  
        b[n] = Integer.parseInt(crdt.getText()) ;

        double y = 0.0 ;
        int z = 0 ;

        for(int i=0; i<=n; i++){
            y = (y + a[i] * b[i]) ;
            z  = z + b[i] ;
        }   
        result.setText("Your GPA is "+ String.valueOf(y/z));
    }
}

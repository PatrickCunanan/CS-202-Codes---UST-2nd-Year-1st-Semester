package cs202project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Trace extends Main{
    static JFrame tr = new JFrame("Trace");
    
    static JTextField trace, rows, columns;
    static JTextArea curmtrx;
    static JPanel p1;
    static JButton mtrx, traceon, clear;
    static JScrollPane sc1, sc2;
    static int r, c, s;
    static String num[][];
    /**
     * @wbp.parser.entryPoint
     */
    static void TRCActionPerformed(ActionEvent a) throws Exception{
	tr.setSize(350,300);
        tr.setLocation(250,250);
        tr.getContentPane().setLayout(null);
        tr.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tr.setResizable(false);
	
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setSize(350,300);
        p1.setBackground(SystemColor.textHighlight);
        
      
        mtrx = new JButton("Set Values");
        mtrx.setBackground(SystemColor.textHighlightText);
        mtrx.setFont(new Font("Arial Black", Font.PLAIN, 11));mtrx.setBounds(220,10,100,30);
        traceon = new JButton("Get TRACE"); 
        traceon.setBackground(SystemColor.textHighlightText);
        traceon.setFont(new Font("Arial Black", Font.PLAIN, 11));traceon.setBounds(180,200,120,50);
        clear = new JButton("Clear"); 
        clear.setBackground(SystemColor.textHighlightText);
        clear.setFont(new Font("Arial Black", Font.PLAIN, 11));clear.setBounds(45,200,120,50);
        
        JLabel l1 = new JLabel("Set Matrix Size:");  
        l1.setFont(new Font("Arial", Font.PLAIN, 11));l1.setBounds(20,10,100,30);
        JLabel l2 = new JLabel("TRACE:");  
        l2.setFont(new Font("Arial", Font.PLAIN, 11));l2.setBounds(180,100,100,30);
        JLabel l3 = new JLabel("X"); l3.setBounds(155,10,100,30);
        JLabel l4 = new JLabel("MATRIX:"); 
        l4.setFont(new Font("Arial", Font.PLAIN, 11));l4.setBounds(90,50,100,30);
       
                
        trace = new JTextField();trace.setBounds(230,100,35,30);trace.setEditable(false);
        rows = new JTextField();rows.setBounds(115,10,35,30);
        columns = new JTextField();columns.setBounds(170,10,35,30);
        
               
        curmtrx = new JTextArea();
        curmtrx.setEditable(false);
        
        sc1 = new JScrollPane(curmtrx);
        sc1.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sc1.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sc1.setBounds(50,80,120,100);
        
        Font font2 = new Font("Verdana", Font.BOLD, 15);
        curmtrx.setFont(font2);
        
        p1.add(mtrx);  p1.add(traceon);p1.add(clear);
        p1.add(sc1);   p1.add(trace);  p1.add(rows);   p1.add(columns);
        p1.add(l1);    p1.add(l2);     p1.add(l3);     p1.add(l4);
        
        tr.getContentPane().add(p1); 
        tr.setVisible(true);
        
        bset b1 = new bset();
        mtrx.addActionListener(b1);
        bsolve b2 = new bsolve();
        traceon.addActionListener(b2);
        bclear b3 = new bclear();
        clear.addActionListener(b3);
    }
    
    
   
    static public class bset implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            r = Integer.parseInt(rows.getText());
            c = Integer.parseInt(columns.getText());
            
            if(r == c){
            num = new String[r][c];
            
            for(int j =0; j<r; j++ ){
                for(int k = 0; k<c; k++){
                    num[j][k] = JOptionPane.showInputDialog ("Enter value for a["+(j+1)+"]["+(k+1)+"]");
                    
                    curmtrx.append(num[j][k] +"   ");
                }
                curmtrx.append("\n");
            } 
            }
            else{
                JOptionPane.showMessageDialog(null, "Must be a square matrix","Error", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    static public class bsolve implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            r = Integer.parseInt(rows.getText());
            c = Integer.parseInt(columns.getText());
            int n = 0;
           
            for(int j =0; j<r; j++ ){
                for(int k = 0; k<c; k++){
                    
                    if(j == k){
                        n += Integer.parseInt(num[j][k]);
                              
                    }
                  
                }
            }
            String total = Integer.toString(n);
            trace.setText(total);
        }
    }
    static public class bclear implements ActionListener{
        public void actionPerformed(ActionEvent ae){
               
               curmtrx.setText("");
               trace.setText("");    
        }
    }
}


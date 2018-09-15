package cs202project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Transpose extends Main{
    static JFrame sm = new JFrame("Transpose");
    
    static JTextField cons, rows, columns;
    static JTextArea curmtrx, transtrx;
    static JPanel p1, p2;
    static JButton mtrx, scalarx, clear;
    static JScrollPane sc1, sc2;
    static int r, c, s;
    static String num[][];
    /**
     * @wbp.parser.entryPoint
     */
    static void TRAActionPerformed(ActionEvent a) throws Exception{
	sm.setSize(600,300);
        sm.setLocation(250,250);
        sm.getContentPane().setLayout(null);
        sm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        sm.setResizable(false);
	
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,330,300);
        p1.setBackground(SystemColor.textHighlight);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(330,0,270,300);
        p2.setBackground(SystemColor.activeCaption);
        
        mtrx = new JButton("Set Values");
        mtrx.setFont(new Font("Arial Black", Font.PLAIN, 11));
        mtrx.setBackground(SystemColor.textHighlightText);mtrx.setBounds(220,10,100,30);
        scalarx = new JButton("Transpose"); 
        scalarx.setFont(new Font("Arial Black", Font.PLAIN, 11));
        scalarx.setBackground(SystemColor.textHighlightText);scalarx.setBounds(160,200,120,50);
        clear = new JButton("Clear"); 
        clear.setBackground(SystemColor.textHighlightText);
        clear.setFont(new Font("Arial Black", Font.PLAIN, 11));clear.setBounds(30,200,120,50);
        
        JLabel l1 = new JLabel("Set Matrix Size:");  
        l1.setFont(new Font("Arial", Font.PLAIN, 11));l1.setBounds(20,10,100,30);
        JLabel l3 = new JLabel("X"); l3.setBounds(155,10,100,30);
        JLabel l4 = new JLabel("MATRIX:"); 
        l4.setFont(new Font("Arial", Font.PLAIN, 11));l4.setBounds(150,50,100,30);
        JLabel l5 = new JLabel("TRANSPOSE:"); l5.setBounds(75,20,150,30);
                
        
        rows = new JTextField();rows.setBounds(115,10,35,30);
        columns = new JTextField();columns.setBounds(170,10,35,30);
        
               
        curmtrx = new JTextArea();
        curmtrx.setEditable(false);
        
        sc1 = new JScrollPane(curmtrx);
        sc1.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sc1.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sc1.setBounds(110,80,120,100);
        
        transtrx = new JTextArea();
        transtrx.setEditable(false);
        
        sc2 = new JScrollPane(transtrx);
        sc2.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sc2.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sc2.setBounds(35,50,200,200);
        
        Font font2 = new Font("Verdana", Font.BOLD, 15);
        curmtrx.setFont(font2);
        transtrx.setFont(font2);
        l5.setFont(new Font("Arial Black", Font.PLAIN, 15));
        
        p1.add(mtrx);  p1.add(scalarx);p1.add(clear);
        p1.add(sc1);   p2.add(sc2);    p2.add(l5);
        p1.add(rows);  p1.add(columns);p1.add(l4);
        p1.add(l1);    p1.add(l3);     
        
       
        sm.getContentPane().add(p1); sm.getContentPane().add(p2);
        sm.setVisible(true);
        
        bset b1 = new bset();
        mtrx.addActionListener(b1);
        bsolve b2 = new bsolve();
        scalarx.addActionListener(b2);
        bclear b3 = new bclear();
        clear.addActionListener(b3);
    }
    
    
   
    static public class bset implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            r = Integer.parseInt(rows.getText());
            c = Integer.parseInt(columns.getText());
            
            num = new String[r][c];
            
            for(int j =0; j<r; j++ ){
                for(int k = 0; k<c; k++){
                    num[j][k] = JOptionPane.showInputDialog ("Enter value for a["+(j+1)+"]["+(k+1)+"]");
                    
                    curmtrx.append(num[j][k] +"   ");
                }
                curmtrx.append("\n");
            }        
        }
    }
    static public class bsolve implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            r = Integer.parseInt(rows.getText());
            c = Integer.parseInt(columns.getText());
           
            for(int j =0; j<c; j++ ){
                for(int k = 0; k<r; k++){
                    transtrx.append(num[k][j] + "  ");
                   
                }
                transtrx.append("\n");
            }        
        }
    }
    static public class bclear implements ActionListener{
        public void actionPerformed(ActionEvent ae){
               
               curmtrx.setText("");
               transtrx.setText("");
               
        }
    }
}


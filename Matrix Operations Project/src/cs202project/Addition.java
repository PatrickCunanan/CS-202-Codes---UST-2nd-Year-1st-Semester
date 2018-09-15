package cs202project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Addition extends Main {
    static JFrame JF = new JFrame("Addition");
    static JTextField row1, col1, row2,col2;
    static JTextArea matrix1, matrix2, addedmatrix;
    static JLabel lblmatrix1, lblmatrix2, lblmatrix3, lblmatrix4, result, x1, x2, plus; 
    static JButton btnmatrix1, btnmatrix2, clear, addmatrix;
    static JPanel p1, p2;
    static JScrollPane mtrx1, mtrx2, mtrx3;
    static int mr1, mr2, mc1, mc2;
    static String num1[][], num2[][];
    
    /**
     * @wbp.parser.entryPoint
     */
    static void AddActionPerformed (ActionEvent a) throws Exception{
       JF.setSize(600,350);
       JF.setLocation(250,250);
       JF.getContentPane().setLayout(null);
       JF.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       JF.setResizable(false);
       JF.setVisible(true);
       
       p1 = new JPanel();
       p1.setLayout(null);
       p1.setBounds(0,0,350,350);
       p1.setBackground(SystemColor.textHighlight);
       
       p2 = new JPanel();
       p2.setLayout(null);
       p2.setBounds(350,0,270,350);
       p2.setBackground(SystemColor.activeCaption);
       
       lblmatrix1 = new JLabel("Size of Matrix 1:");
       lblmatrix1.setFont(new Font("Arial", Font.PLAIN, 11));
       lblmatrix1.setBounds(20,10,150,30);
       
       lblmatrix2 = new JLabel("Size of Matrix 2:");
       lblmatrix2.setFont(new Font("Arial", Font.PLAIN, 11));
       lblmatrix2.setBounds(20,50,150,30);
       
       lblmatrix3 = new JLabel("Matrix 1");
       lblmatrix3.setFont(new Font("Arial", Font.PLAIN, 11));
       lblmatrix3.setBounds(70,90,150,30);
       
       lblmatrix4 = new JLabel("Matrix 2");
       lblmatrix4.setFont(new Font("Arial", Font.PLAIN, 11));
       lblmatrix4.setBounds(240,90,150,30);
       
       result = new JLabel("Addition of Matrix:");
       result.setBounds(400, 5, 200, 30);
       
       x1 = new JLabel("X");
       x1.setBounds(175,10,150,30);
       
       x2 = new JLabel("X");
       x2.setBounds(175,50,150,30);
       
       row1 = new JTextField();
       row1.setBounds(130, 10, 30, 30);
       
       row2 = new JTextField();
       row2.setBounds(130, 50, 30, 30);
       
       col1 = new JTextField();
       col1.setBounds(200, 10, 30, 30);
       
       col2 = new JTextField();
       col2.setBounds(200, 50, 30, 30);
       
       btnmatrix1 = new JButton("Set Values");
       btnmatrix1.setFont(new Font("Arial Black", Font.PLAIN, 11));
       btnmatrix1.setBackground(SystemColor.textHighlightText);
       btnmatrix1.setBounds(240,10,100,30);
       
       btnmatrix2 = new JButton("Set Values");
       btnmatrix2.setFont(new Font("Arial Black", Font.PLAIN, 11));
       btnmatrix2.setBackground(SystemColor.textHighlightText);
       btnmatrix2.setBounds(240,50,100,30);
       
       addmatrix = new JButton("Add Matrices"); 
       addmatrix.setFont(new Font("Arial Black", Font.PLAIN, 11));
       addmatrix.setBackground(SystemColor.textHighlightText);
       addmatrix.setBounds(200,250,120,50);
       
       clear = new JButton("Clear");
       clear.setBackground(SystemColor.textHighlightText);
       clear.setFont(new Font("Arial Black", Font.PLAIN, 11));
       clear.setBounds(30,250,120,50);
       
       matrix1 = new JTextArea();
       matrix1.setEditable(false);      
       mtrx1 = new JScrollPane(matrix1);
       mtrx1.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
       mtrx1.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       mtrx1.setBounds(35,120,120,120);
       
       matrix2 = new JTextArea();
       matrix2.setEditable(false);      
       mtrx2 = new JScrollPane(matrix2);
       mtrx2.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
       mtrx2.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       mtrx2.setBounds(200,120,120,120);
       
       addedmatrix = new JTextArea();
       addedmatrix.setEditable(false);
       mtrx3 = new JScrollPane(addedmatrix);
       mtrx3.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
       mtrx3.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       mtrx3.setBounds(360,30,230,280);
       
       Font font2 = new Font("Verdana", Font.BOLD, 15);
       matrix1.setFont(font2);
       matrix2.setFont(font2);
       result.setFont(new Font("Arial Black", Font.PLAIN, 15));
       
       JF.getContentPane().add(btnmatrix1);      JF.getContentPane().add(lblmatrix1);
       JF.getContentPane().add(btnmatrix2);      JF.getContentPane().add(lblmatrix2);     JF.getContentPane().add(lblmatrix3);
       JF.getContentPane().add(addmatrix);       JF.getContentPane().add(x1);             JF.getContentPane().add(lblmatrix4);
       JF.getContentPane().add(clear);           JF.getContentPane().add(x2);             JF.getContentPane().add(row1);            
       JF.getContentPane().add(row2);            JF.getContentPane().add(mtrx3);          JF.getContentPane().add(result);
       JF.getContentPane().add(col1);            JF.getContentPane().add(col2);           JF.getContentPane().add(mtrx2);
       JF.getContentPane().add(mtrx1);           JF.getContentPane().add(p1);              
           
           plus = new JLabel("+");
           plus.setBounds(175, 127, 6, 101);
           p1.add(plus);
           plus.setFont(new Font("Arial", Font.PLAIN, 11));JF.getContentPane().add(p2);

       getMatrix1 gm1 = new getMatrix1();
       btnmatrix1.addActionListener(gm1);
       getMatrix2 gm2 = new getMatrix2();
       btnmatrix2.addActionListener(gm2);
       clearscrn cls = new clearscrn();
       clear.addActionListener(cls);
       getResult gr = new getResult();
       addmatrix.addActionListener(gr);
    }
    
        static public class getMatrix1 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            mr1 = Integer.parseInt(row1.getText());
            mc1 = Integer.parseInt(col1.getText());
            
            num1 = new String[mr1][mc1];
            
            for(int j =0; j<mr1; j++ ){
                for(int k = 0; k<mc1; k++){
                    num1[j][k] = JOptionPane.showInputDialog ("Enter value for a["+(j+1)+"]["+(k+1)+"]");
                    
                    matrix1.append(num1[j][k] +"   ");
                }
                matrix1.append("\n");
            }        
        }
    }
        
       static public class getMatrix2 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            mr2 = Integer.parseInt(row2.getText());
            mc2 = Integer.parseInt(col2.getText());
            
            num2 = new String[mr2][mc2];
            
            for(int j =0; j<mr2; j++ ){
                for(int k = 0; k<mc2; k++){
                    num2[j][k] = JOptionPane.showInputDialog ("Enter value for a["+(j+1)+"]["+(k+1)+"]");
                    
                    matrix2.append(num2[j][k] +"   ");
                }
                matrix2.append("\n");
            }        
        }
    }
    
       static public class getResult implements ActionListener{
           public void actionPerformed(ActionEvent ae){
                   mr1 = Integer.parseInt(row1.getText());
                   mc1 = Integer.parseInt(col1.getText());
                   mr2 = Integer.parseInt(row2.getText());
                   mc2 = Integer.parseInt(col2.getText());
                   if (mr1 == mr2 && mc1 == mc2){
                       for(int j =0; j<mr1; j++ ){
                            for(int k = 0; k<mc1; k++){
                    
                                  int n = Integer.parseInt(num1[j][k]);
                                  int m = Integer.parseInt(num2[j][k]);
                                  int x = m + n;
                        
                        String results = Integer.toString(x);
                        addedmatrix.append(results +"   ");
                }
                            addedmatrix.append("\n");
                   }

           }else
                   JOptionPane.showMessageDialog(JF, "The dimensions of both matrices must be equal", "error", JOptionPane.ERROR_MESSAGE);
       }
    }
       
        static public class clearscrn implements ActionListener{
        public void actionPerformed(ActionEvent ae){
               
               matrix1.setText("");
               matrix2.setText("");
               addedmatrix.setText("");
               
        }
    }
}

package cs202project;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Main {

	public static void Window(){
		JFrame f = new JFrame("JFrame");
	    f.getContentPane().setBackground(UIManager.getColor("List.foreground"));
	    SpringLayout springLayout = new SpringLayout();
	    f.getContentPane().setLayout(springLayout);
	    
	    JPanel panel = new JPanel();
	    springLayout.putConstraint(SpringLayout.NORTH, panel, 46, SpringLayout.NORTH, f.getContentPane());
	    panel.setBackground(SystemColor.textHighlight);
	    springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, f.getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, panel, 351, SpringLayout.NORTH, f.getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, panel, 703, SpringLayout.WEST, f.getContentPane());
	    f.getContentPane().add(panel);
	    
	    JLabel lblOperationOfMatrices = new JLabel("OPERATION OF MATRICES CALCULATOR");
	    springLayout.putConstraint(SpringLayout.SOUTH, lblOperationOfMatrices, -2, SpringLayout.NORTH, panel);
	    lblOperationOfMatrices.setHorizontalAlignment(SwingConstants.CENTER);
	    springLayout.putConstraint(SpringLayout.WEST, lblOperationOfMatrices, -711, SpringLayout.EAST, f.getContentPane());
	    SpringLayout sl_panel = new SpringLayout();
	    panel.setLayout(sl_panel);
	    
	    JButton btnNewButton = new JButton("Addition");
	    btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    btnNewButton.setBackground(SystemColor.textHighlightText);
	    sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 37, SpringLayout.NORTH, panel);
	    sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, 37, SpringLayout.WEST, panel);
	    sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, 107, SpringLayout.NORTH, panel);
	    sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -491, SpringLayout.EAST, panel);
	    panel.add(btnNewButton);
	    
	    btnNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent i) {
                try {
                        Addition.AddActionPerformed(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
	    
	    JButton btnSubtraction = new JButton("Subtraction");
	    btnSubtraction.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    btnSubtraction.setBackground(SystemColor.textHighlightText);
	    sl_panel.putConstraint(SpringLayout.NORTH, btnSubtraction, 38, SpringLayout.NORTH, panel);
	    sl_panel.putConstraint(SpringLayout.WEST, btnSubtraction, 60, SpringLayout.EAST, btnNewButton);
	    sl_panel.putConstraint(SpringLayout.SOUTH, btnSubtraction, 108, SpringLayout.NORTH, panel);
	    sl_panel.putConstraint(SpringLayout.EAST, btnSubtraction, 225, SpringLayout.EAST, btnNewButton);
	    panel.add(btnSubtraction);
	    
	    btnSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent i) {
                    try {
                        Subtraction.SubtractActionPerformed(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
	    
	    JButton btnMultiplication = new JButton("Multiplication");
	    btnMultiplication.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    btnMultiplication.setBackground(SystemColor.textHighlightText);
	    sl_panel.putConstraint(SpringLayout.NORTH, btnMultiplication, 37, SpringLayout.NORTH, panel);
	    sl_panel.putConstraint(SpringLayout.WEST, btnMultiplication, 56, SpringLayout.EAST, btnSubtraction);
	    sl_panel.putConstraint(SpringLayout.SOUTH, btnMultiplication, 107, SpringLayout.NORTH, panel);
	    sl_panel.putConstraint(SpringLayout.EAST, btnMultiplication, 221, SpringLayout.EAST, btnSubtraction);
	    panel.add(btnMultiplication);
	    
	    btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent i) {
                    try {
                        Multiplication.MultiplyActionPerformed(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
	    
	    JButton btnScalarMultiplication = new JButton("Scalar Multiplication");
	    btnScalarMultiplication.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    btnScalarMultiplication.setBackground(SystemColor.textHighlightText);
	    sl_panel.putConstraint(SpringLayout.NORTH, btnScalarMultiplication, 46, SpringLayout.SOUTH, btnNewButton);
	    sl_panel.putConstraint(SpringLayout.WEST, btnScalarMultiplication, 37, SpringLayout.WEST, panel);
	    sl_panel.putConstraint(SpringLayout.SOUTH, btnScalarMultiplication, 116, SpringLayout.SOUTH, btnNewButton);
	    sl_panel.putConstraint(SpringLayout.EAST, btnScalarMultiplication, 202, SpringLayout.WEST, panel);
	    panel.add(btnScalarMultiplication);
	            
        btnScalarMultiplication.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent i) {
                    try {
                        ScalarMultiplication.SMActionPerformed(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            
	    JButton btnTrace = new JButton("Trace");
	    btnTrace.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    btnTrace.setBackground(SystemColor.textHighlightText);
	    sl_panel.putConstraint(SpringLayout.NORTH, btnTrace, 45, SpringLayout.SOUTH, btnSubtraction);
	    sl_panel.putConstraint(SpringLayout.WEST, btnTrace, 0, SpringLayout.WEST, btnSubtraction);
	    sl_panel.putConstraint(SpringLayout.SOUTH, btnTrace, 0, SpringLayout.SOUTH, btnScalarMultiplication);
	    sl_panel.putConstraint(SpringLayout.EAST, btnTrace, 0, SpringLayout.EAST, btnSubtraction);
	    panel.add(btnTrace);
            
	    btnTrace.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent i) {
                    try {
                        Trace.TRCActionPerformed(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
	    JButton btnTranspose = new JButton("Transpose");
	    btnTranspose.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    btnTranspose.setBackground(SystemColor.textHighlightText);
	    sl_panel.putConstraint(SpringLayout.NORTH, btnTranspose, 46, SpringLayout.SOUTH, btnMultiplication);
	    sl_panel.putConstraint(SpringLayout.WEST, btnTranspose, 0, SpringLayout.WEST, btnMultiplication);
	    sl_panel.putConstraint(SpringLayout.SOUTH, btnTranspose, 0, SpringLayout.SOUTH, btnScalarMultiplication);
	    sl_panel.putConstraint(SpringLayout.EAST, btnTranspose, -45, SpringLayout.EAST, panel);
	    panel.add(btnTranspose);
            
        btnTranspose.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent i) {
                    try {
                        Transpose.TRAActionPerformed(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
	    
	    JButton btnAbout = new JButton("About");
	    btnAbout.setFont(new Font("Arial", Font.PLAIN, 11));
	    btnAbout.setBackground(SystemColor.controlShadow);
	    sl_panel.putConstraint(SpringLayout.SOUTH, btnAbout, -10, SpringLayout.SOUTH, panel);
	    sl_panel.putConstraint(SpringLayout.EAST, btnAbout, -10, SpringLayout.EAST, panel);
	    panel.add(btnAbout);
	    springLayout.putConstraint(SpringLayout.EAST, lblOperationOfMatrices, -2, SpringLayout.EAST, f.getContentPane());
	    f.getContentPane().add(lblOperationOfMatrices);
            
	    btnAbout.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent i) {
                    try {
                        About.AboutActionPerformed(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
	    
            
            
	    lblOperationOfMatrices.setFont(new Font("Arial Black", Font.PLAIN, 23));
	    lblOperationOfMatrices.setForeground(SystemColor.text);
	    f.setTitle("CS202 Program");
	    f.setBackground(Color.LIGHT_GRAY);
	    f.setSize(729, 400);
	    f.setLocation(300,200);
	    f.setVisible(true);
	    f.setResizable(false);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
            
            
	}
	public static void main(String[] args) {
		Window();
	}
        
       
}

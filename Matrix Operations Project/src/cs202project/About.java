package cs202project;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class About extends Main{

	/**
	 * @wbp.parser.entryPoint
	 */
	static void AboutActionPerformed(ActionEvent a) throws Exception{
		JFrame sf = new JFrame("SubJFrame");
	    sf.getContentPane().setBackground(SystemColor.textHighlight);
	    sf.setTitle("About");
	    sf.setBackground(Color.LIGHT_GRAY);
	    sf.setSize(368, 295);
	    sf.setLocation(300,200);
	    SpringLayout springLayout = new SpringLayout();
	    sf.getContentPane().setLayout(springLayout);
	    sf.setVisible(true);
	    sf.setResizable(false);
	    sf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    
	    JLabel lblCsProject = new JLabel("CS202 Project");
	    springLayout.putConstraint(SpringLayout.EAST, lblCsProject, 0, SpringLayout.EAST, sf.getContentPane());
	    lblCsProject.setHorizontalAlignment(SwingConstants.CENTER);
	    lblCsProject.setFont(new Font("Arial Black", Font.BOLD, 20));
	    sf.getContentPane().add(lblCsProject);
	    
	    JLabel lblOperationOfMatrices = new JLabel("Operation of Matrices");
	    springLayout.putConstraint(SpringLayout.WEST, lblOperationOfMatrices, 0, SpringLayout.WEST, lblCsProject);
	    springLayout.putConstraint(SpringLayout.EAST, lblOperationOfMatrices, 0, SpringLayout.EAST, lblCsProject);
	    springLayout.putConstraint(SpringLayout.NORTH, lblOperationOfMatrices, 10, SpringLayout.NORTH, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, lblOperationOfMatrices, 31, SpringLayout.NORTH, sf.getContentPane());
	    lblOperationOfMatrices.setFont(new Font("Tahoma", Font.BOLD, 17));
	    lblOperationOfMatrices.setHorizontalAlignment(SwingConstants.CENTER);
	    sf.getContentPane().add(lblOperationOfMatrices);
	    
	    JLabel lblCalculator = new JLabel("Calculator");
	    springLayout.putConstraint(SpringLayout.NORTH, lblCalculator, 6, SpringLayout.SOUTH, lblOperationOfMatrices);
	    springLayout.putConstraint(SpringLayout.WEST, lblCalculator, 0, SpringLayout.WEST, lblCsProject);
	    springLayout.putConstraint(SpringLayout.EAST, lblCalculator, 0, SpringLayout.EAST, lblCsProject);
	    lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
	    lblCalculator.setFont(new Font("Tahoma", Font.BOLD, 17));
	    sf.getContentPane().add(lblCalculator);
	    
	    JLabel lblMembers = new JLabel("Members:");
	    springLayout.putConstraint(SpringLayout.NORTH, lblMembers, 16, SpringLayout.SOUTH, lblCalculator);
	    springLayout.putConstraint(SpringLayout.WEST, lblCsProject, 0, SpringLayout.WEST, lblMembers);
	    springLayout.putConstraint(SpringLayout.WEST, lblMembers, 0, SpringLayout.WEST, sf.getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, lblMembers, 362, SpringLayout.WEST, sf.getContentPane());
	    lblMembers.setHorizontalAlignment(SwingConstants.CENTER);
	    lblMembers.setFont(new Font("Tahoma", Font.BOLD, 17));
	    sf.getContentPane().add(lblMembers);
	    
	    JLabel lblPhilipAngJr = new JLabel("Philip Ang Jr.");
	    springLayout.putConstraint(SpringLayout.NORTH, lblPhilipAngJr, 6, SpringLayout.SOUTH, lblMembers);
	    springLayout.putConstraint(SpringLayout.WEST, lblPhilipAngJr, 0, SpringLayout.WEST, lblMembers);
	    springLayout.putConstraint(SpringLayout.EAST, lblPhilipAngJr, 0, SpringLayout.EAST, lblMembers);
	    lblPhilipAngJr.setHorizontalAlignment(SwingConstants.CENTER);
	    lblPhilipAngJr.setFont(new Font("Tahoma", Font.BOLD, 17));
	    sf.getContentPane().add(lblPhilipAngJr);
	    
	    JLabel lblPatrickBryanCunanan = new JLabel("Patrick Bryan Cunanan");
	    springLayout.putConstraint(SpringLayout.NORTH, lblPatrickBryanCunanan, 6, SpringLayout.SOUTH, lblPhilipAngJr);
	    springLayout.putConstraint(SpringLayout.WEST, lblPatrickBryanCunanan, 0, SpringLayout.WEST, lblMembers);
	    springLayout.putConstraint(SpringLayout.EAST, lblPatrickBryanCunanan, 0, SpringLayout.EAST, sf.getContentPane());
	    lblPatrickBryanCunanan.setHorizontalAlignment(SwingConstants.CENTER);
	    lblPatrickBryanCunanan.setFont(new Font("Tahoma", Font.BOLD, 17));
	    sf.getContentPane().add(lblPatrickBryanCunanan);
	    
	    JLabel lblKimPatrickDalanon = new JLabel("Kim Patrick Dalanon");
	    springLayout.putConstraint(SpringLayout.NORTH, lblKimPatrickDalanon, 6, SpringLayout.SOUTH, lblPatrickBryanCunanan);
	    springLayout.putConstraint(SpringLayout.WEST, lblKimPatrickDalanon, 0, SpringLayout.WEST, lblMembers);
	    springLayout.putConstraint(SpringLayout.EAST, lblKimPatrickDalanon, 0, SpringLayout.EAST, lblMembers);
	    lblKimPatrickDalanon.setHorizontalAlignment(SwingConstants.CENTER);
	    lblKimPatrickDalanon.setFont(new Font("Tahoma", Font.BOLD, 17));
	    sf.getContentPane().add(lblKimPatrickDalanon);
	    
	    JLabel lblKyleChesterMadamba = new JLabel("Kyle Chester Madamba");
	    springLayout.putConstraint(SpringLayout.NORTH, lblCsProject, 6, SpringLayout.SOUTH, lblKyleChesterMadamba);
	    springLayout.putConstraint(SpringLayout.EAST, lblKyleChesterMadamba, 0, SpringLayout.EAST, lblMembers);
	    springLayout.putConstraint(SpringLayout.NORTH, lblKyleChesterMadamba, 6, SpringLayout.SOUTH, lblKimPatrickDalanon);
	    springLayout.putConstraint(SpringLayout.WEST, lblKyleChesterMadamba, 0, SpringLayout.WEST, lblMembers);
	    lblKyleChesterMadamba.setHorizontalAlignment(SwingConstants.CENTER);
	    lblKyleChesterMadamba.setFont(new Font("Tahoma", Font.BOLD, 17));
	    sf.getContentPane().add(lblKyleChesterMadamba);
	}
}

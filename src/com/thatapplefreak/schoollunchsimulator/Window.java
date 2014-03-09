package com.thatapplefreak.schoollunchsimulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class Window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	JTextPane textPane = new JTextPane();
	
	final JComboBox comboBox = new JComboBox();

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		comboBox.setBounds(71, 12, 46, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5", "6", "7", "8"}));
		contentPane.add(comboBox);
		
		JButton btnStartSimulation = new JButton("Start Simulation");
		btnStartSimulation.setBounds(10, 43, 107, 23);
		btnStartSimulation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Runner.run(Window.this, Float.parseFloat((String) comboBox.getSelectedItem()));
			}
		});
		contentPane.add(btnStartSimulation);

		JLabel lblBudget = new JLabel("Budget  $");
		lblBudget.setBounds(10, 15, 46, 14);
		contentPane.add(lblBudget);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(158, 12, 316, 438);
		contentPane.add(scrollPane);
		
		scrollPane.setViewportView(textPane);
	}
}

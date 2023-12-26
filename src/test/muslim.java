package test;

import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class muslim extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField output;

	/**
	 * Create the panel.
	 */
	public muslim() {
		setLayout(null);
		
		output = new JTextField();
		output.setEditable(false);
		output.setBounds(12, 98, 151, 107);
		add(output);
		output.setColumns(10);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(12, 269, 426, 19);
		add(toolBar);
		
		JButton btnTimes = new JButton("Times");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnTimes);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnSettings);

	}
	



}

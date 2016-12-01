package pokemon_move_tracker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EditEncounters {

	private JFrame frmEncounterEditor;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditEncounters window = new EditEncounters();
					window.frmEncounterEditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditEncounters() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEncounterEditor = new JFrame();
		frmEncounterEditor.setResizable(false);
		frmEncounterEditor.setIconImage(Toolkit.getDefaultToolkit().getImage(Frame1.class.getResource("/pokemon_move_tracker/shiny_charm.gif")));
		frmEncounterEditor.setTitle("Encounter Editor");
		frmEncounterEditor.setBounds(100, 100, 423, 204);
		frmEncounterEditor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter The Number of Encounters");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isInt(textField.getText())){
					Frame1.setEncounters(Integer.parseInt(textField.getText()));
					frmEncounterEditor.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Please ensure you entered a number");
				}
			}
		});
		btnSubmit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(frmEncounterEditor.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(351, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		frmEncounterEditor.getContentPane().setLayout(groupLayout);
		frmEncounterEditor.getRootPane().setDefaultButton(btnSubmit);
	}
	
	//sanitizes input
	private boolean isInt(String s){
		try {
			Integer.parseInt(s);
			return true;
		}catch (Exception e){
			return false;
		}
	}
}

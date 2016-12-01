package pokemon_move_tracker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class HelpEditEncounters {

	private JFrame frmHowToEdit;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpEditEncounters window = new HelpEditEncounters();
					window.frmHowToEdit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelpEditEncounters() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHowToEdit = new JFrame();
		frmHowToEdit.setIconImage(Toolkit.getDefaultToolkit().getImage(Frame1.class.getResource("/pokemon_move_tracker/shiny_charm.gif")));
		frmHowToEdit.setTitle("How To Edit Encounters");
		frmHowToEdit.setResizable(false);
		frmHowToEdit.setBounds(100, 100, 817, 333);
		frmHowToEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTextPane txtpnSettingEncountersCan = new JTextPane();
		txtpnSettingEncountersCan.setBackground(SystemColor.menu);
		txtpnSettingEncountersCan.setEditable(false);
		txtpnSettingEncountersCan.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtpnSettingEncountersCan.setText("Setting encounters can be an important feature.  If you decide to close the window, the state of the encounters is not changed.  This means when you open the program again, the number of encounters is reset.  Taking this under consideration, a feature to manually change the number of encounters has been added.  Here are the steps to edit the number of encounters:\r\n\t1.\tClick on the edit menu located next to the help menu on the top of the application.\r\n\t2.\tClick on \u201CEdit Encounters\u201D\r\n\t3.\tEnter in the desired numbers\r\n\r\nIf you wish to reset the number of encounters, follow the steps below:\r\n\t1.\tClick on the edit menu located next to the help menu on the top of the application.\r\n\t2.\tClick on \u201Creset encounters\u201D\r\n");
		GroupLayout groupLayout = new GroupLayout(frmHowToEdit.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnSettingEncountersCan, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnSettingEncountersCan, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
					.addContainerGap())
		);
		frmHowToEdit.getContentPane().setLayout(groupLayout);
	}
}

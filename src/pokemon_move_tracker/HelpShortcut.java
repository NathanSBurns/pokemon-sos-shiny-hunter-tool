package pokemon_move_tracker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class HelpShortcut {

	private JFrame frmShortcuts;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpShortcut window = new HelpShortcut();
					window.frmShortcuts.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelpShortcut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShortcuts = new JFrame();
		frmShortcuts.setIconImage(Toolkit.getDefaultToolkit().getImage(Frame1.class.getResource("/pokemon_move_tracker/shiny_charm.gif")));
		frmShortcuts.setResizable(false);
		frmShortcuts.setTitle("Shortcuts");
		frmShortcuts.setBounds(100, 100, 450, 300);
		frmShortcuts.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JTextPane txtpnAsOfRight = new JTextPane();
		txtpnAsOfRight.setEditable(false);
		txtpnAsOfRight.setBackground(SystemColor.menu);
		txtpnAsOfRight.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtpnAsOfRight.setText(
				"As of right now, there is only one keyboard shortcut.  The shortcut is on the main window (where the encounter count is located).  If you want to increment the encounter number, just press \u201CEnter.\u201D  More shortcuts will be added in later updates.");
		GroupLayout groupLayout = new GroupLayout(frmShortcuts.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(txtpnAsOfRight, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(txtpnAsOfRight, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
						.addContainerGap()));
		frmShortcuts.getContentPane().setLayout(groupLayout);
	}

}

package pokemon_move_tracker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;

public class HelpAbout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpAbout window = new HelpAbout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelpAbout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 611, 421);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTextPane txtpnThisProgramWas = new JTextPane();
		txtpnThisProgramWas.setBackground(SystemColor.menu);
		txtpnThisProgramWas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtpnThisProgramWas.setEditable(false);
		txtpnThisProgramWas.setText("\tThis program was written by Nathan Scot Burns (AKA Hyginx) using Eclipse (Version: Mars.2 Release (4.5.2)) and the WindowBuilder plugin. The reason why I made this program was because I needed a reliable way to keep track of Pok\u00E9mon moves when using the S.O.S shiny hunting method to help maximize my S.O.S shiny hunting efficiency in Pok\u00E9mon Sun/Moon.  \r\n\tMy hope is to expand the project to include a variety of shiny hunting methods, but before I do that, I will be working on improving the current version (adding more features and eventually designing a decent background).  Unfortunately, I am only able to work on this program during what little freetime I have so updates might not be a frequent occurrence.  However, in the meantime, I hope you enjoy using this program.  \r\n");
		
		JTextPane txtpnIfYouHave = new JTextPane();
		txtpnIfYouHave.setBackground(SystemColor.menu);
		txtpnIfYouHave.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtpnIfYouHave.setText("If you have any problems while using this program, please let me know using one of the following contacts:\r\n\r\nEmail \u2013 nateb@hotmail.com.\r\nTwitter \u2013 twitter.com/Hyginx");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtpnIfYouHave, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
						.addComponent(txtpnThisProgramWas, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnThisProgramWas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnIfYouHave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}

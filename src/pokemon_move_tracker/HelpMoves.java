package pokemon_move_tracker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;

public class HelpMoves {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpMoves window = new HelpMoves();
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
	public HelpMoves() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JTextPane txtpnInOrderTo = new JTextPane();
		txtpnInOrderTo.setEditable(false);
		txtpnInOrderTo.setBackground(SystemColor.menu);
		txtpnInOrderTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtpnInOrderTo.setText(
				"In order to select a move, click on one of the text areas.  A window should pop up with a list of moves.  You can either scroll down to select a move or you can type the name of the move (typing will immediately go to a move matching the input).  Once the desired move is highlighted, hit the \u201CSelect\u201D button or press \u201CEnter\u201D on the keyboard to select the move.");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(txtpnInOrderTo, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(txtpnInOrderTo, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
						.addContainerGap()));
		frame.getContentPane().setLayout(groupLayout);
	}

}

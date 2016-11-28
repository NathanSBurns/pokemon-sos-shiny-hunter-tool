/*Written by Nathan Scott Burns (AKA Hyginx)*/
package pokemon_move_tracker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Frame1 {

	private JFrame frame;
	private static int currentTextArea;
	private static JTextArea move1TextArea = new JTextArea();
	private static JTextArea move2TextArea = new JTextArea();
	private static JTextArea move3TextArea = new JTextArea();
	private static JTextArea move4TextArea = new JTextArea();
	private static JLabel move1PP = new JLabel("20");
	private static JLabel move2PP = new JLabel("20");
	private static JLabel move3PP = new JLabel("20");
	private static JLabel move4PP = new JLabel("20");
	private JLabel numberOfEncounters = new JLabel("1");
	private JLabel odds = new JLabel(Double.parseDouble(numberOfEncounters.getText()) * 100 / 512 + "%");

	public static int getCurrentTextArea() {
		return currentTextArea;
	}

	public static void setMove(String newMove) {
		switch (currentTextArea) {
		case 1:
			move1TextArea.setText(newMove);
			break;
		case 2:
			move2TextArea.setText(newMove);
			break;
		case 3:
			move3TextArea.setText(newMove);
			break;
		case 4:
			move4TextArea.setText(newMove);
			break;
		}
	}

	public static void setMovePP(String movepp) {
		switch (currentTextArea) {
		case 1:
			move1PP.setText(movepp);
			break;
		case 2:
			move2PP.setText(movepp);
			break;
		case 3:
			move3PP.setText(movepp);
			break;
		case 4:
			move4PP.setText(movepp);
			break;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evnt) {
				if (evnt.getKeyCode() == KeyEvent.VK_UP || evnt.getKeyCode() == KeyEvent.VK_KP_UP) {
					numberOfEncounters.setText((Integer.parseInt(numberOfEncounters.getText()) + 1) + "");
					odds.setText(Double.parseDouble(numberOfEncounters.getText()) * 100 / 512 + "%");
				} else if (evnt.getKeyCode() == KeyEvent.VK_DOWN || evnt.getKeyCode() == KeyEvent.VK_KP_DOWN) {
					numberOfEncounters.setText((Integer.parseInt(numberOfEncounters.getText()) - 1) + "");
					odds.setText(Double.parseDouble(numberOfEncounters.getText()) * 100 / 512 + "%");
				}
			}
		});

		frame.setBounds(100, 100, 828, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		move1TextArea.setEditable(false);

		// used to select move 1
		move1TextArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				currentTextArea = 1;
				MoveSelector.moveSelector();
			}
		});
		move1TextArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));

		JLabel lblMove = new JLabel("Move 1");
		lblMove.setFont(new Font("Tahoma", Font.PLAIN, 18));

		move1PP.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel lblEncounters = new JLabel("Encounters:");
		lblEncounters.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblOdds = new JLabel("Odds:");
		lblOdds.setFont(new Font("Tahoma", Font.PLAIN, 20));

		numberOfEncounters.setFont(new Font("Tahoma", Font.PLAIN, 20));

		odds.setFont(new Font("Tahoma", Font.PLAIN, 20));

		// increments PP count
		JButton pp1Up = new JButton("+");
		pp1Up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				move1PP.setText((Integer.parseInt(move1PP.getText()) + 1) + "");
			}
		});
		pp1Up.setFont(new Font("Tahoma", Font.PLAIN, 18));

		// Decrement PP count
		JButton pp1Down = new JButton("\u2013");
		pp1Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(Integer.parseInt(move1PP.getText()) < 1)) {
					move1PP.setText((Integer.parseInt(move1PP.getText()) - 1) + "");
				}
			}
		});
		pp1Down.setFont(new Font("Tahoma", Font.PLAIN, 18));

		move2PP.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton pp2Down = new JButton("\u2013");
		pp2Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(Integer.parseInt(move2PP.getText()) < 1)) {
					move2PP.setText((Integer.parseInt(move2PP.getText()) - 1) + "");
				}
			}
		});
		pp2Down.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				move2PP.setText((Integer.parseInt(move2PP.getText()) + 1) + "");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		move2TextArea.setEditable(false);

		// used to select move 2
		move2TextArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				currentTextArea = 2;
				MoveSelector.moveSelector();
			}
		});
		move2TextArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));

		JLabel lblMove_1 = new JLabel("Move 2");
		lblMove_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		move3PP.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_4 = new JButton("\u2013");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(Integer.parseInt(move3PP.getText()) < 1)) {
					move3PP.setText((Integer.parseInt(move3PP.getText()) - 1) + "");
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_5 = new JButton("+");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				move3PP.setText((Integer.parseInt(move3PP.getText()) + 1) + "");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		move3TextArea.setEditable(false);

		// used to select move 3
		move3TextArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				currentTextArea = 3;
				MoveSelector.moveSelector();
			}
		});
		move3TextArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));

		JLabel lblMove_2 = new JLabel("Move 3");
		lblMove_2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		move4PP.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_6 = new JButton("\u2013");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(Integer.parseInt(move4PP.getText()) < 1)) {
					move4PP.setText((Integer.parseInt(move4PP.getText()) - 1) + "");
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_7 = new JButton("+");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				move4PP.setText((Integer.parseInt(move4PP.getText()) + 1) + "");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		move4TextArea.setEditable(false);

		// used to select move 4
		move4TextArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				currentTextArea = 4;
				MoveSelector.moveSelector();
			}
		});
		move4TextArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));

		JLabel lblMove_3 = new JLabel("Move 4");
		lblMove_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

		// Increases encounter count and calculates odds percentage
		JButton button_8 = new JButton("+");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberOfEncounters.setText((Integer.parseInt(numberOfEncounters.getText()) + 1) + "");
				odds.setText(Double.parseDouble(numberOfEncounters.getText()) * 100 / 512 + "%");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 18));

		// Decreases encounter count and calculates odds percentage
		JButton button_9 = new JButton("\u2013");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(Integer.parseInt(numberOfEncounters.getText()) < 0)) {
					numberOfEncounters.setText((Integer.parseInt(numberOfEncounters.getText()) - 1) + "");
					odds.setText(Double.parseDouble(numberOfEncounters.getText()) * 100 / 512 + "%");
				}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getRootPane().setDefaultButton(button_8);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(10)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblMove, GroupLayout.PREFERRED_SIZE, 109,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(move1TextArea, GroupLayout.PREFERRED_SIZE, 142,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(move1PP, GroupLayout.PREFERRED_SIZE, 21,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(pp1Up, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE)
												.addGap(1)
												.addComponent(pp1Down, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE)
												.addGap(90)
												.addComponent(lblEncounters, GroupLayout.PREFERRED_SIZE, 119,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(numberOfEncounters, GroupLayout.PREFERRED_SIZE, 67,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE)
												.addGap(1).addComponent(button_9, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblMove_1, GroupLayout.PREFERRED_SIZE, 109,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(move2TextArea, GroupLayout.PREFERRED_SIZE, 142,
																GroupLayout.PREFERRED_SIZE))
												.addGap(10)
												.addComponent(move2PP, GroupLayout.PREFERRED_SIZE, 21,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE)
												.addGap(1)
												.addComponent(pp2Down, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE)
												.addGap(90)
												.addComponent(lblOdds, GroupLayout.PREFERRED_SIZE, 119,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10).addComponent(odds, GroupLayout.PREFERRED_SIZE, 150,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(lblMove_2, GroupLayout.PREFERRED_SIZE, 109,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(move3TextArea, GroupLayout.PREFERRED_SIZE, 142,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(move3PP, GroupLayout.PREFERRED_SIZE, 21,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE)
												.addGap(1).addComponent(button_4, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(lblMove_3, GroupLayout.PREFERRED_SIZE, 109,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(move4TextArea, GroupLayout.PREFERRED_SIZE, 142,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(move4PP, GroupLayout.PREFERRED_SIZE, 21,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE)
												.addGap(1).addComponent(button_6, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(11)
				.addComponent(lblMove, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(move1TextArea, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup().addGap(5).addComponent(move1PP,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(pp1Up, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(pp1Down, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup().addGap(5).addComponent(lblEncounters))
						.addGroup(groupLayout.createSequentialGroup().addGap(5).addComponent(numberOfEncounters))
						.addGroup(groupLayout.createSequentialGroup().addGap(5).addComponent(button_8,
								GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGap(5).addComponent(button_9,
								GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
				.addGap(3)
				.addGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblMove_1, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(move2TextArea, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addGap(36).addComponent(move2PP,
										GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addGap(31).addComponent(button_3,
										GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addGap(31).addComponent(pp2Down,
										GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addGap(8).addComponent(lblOdds))
								.addGroup(groupLayout.createSequentialGroup().addGap(8).addComponent(odds)))
				.addGap(11).addComponent(lblMove_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(move3TextArea, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup().addGap(5).addComponent(move3PP,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGap(11).addComponent(lblMove_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(move4TextArea, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup().addGap(5).addComponent(move4PP,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))));
		frame.getContentPane().setLayout(groupLayout);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenu mnBasics = new JMenu("Basics");
		mnHelp.add(mnBasics);

		JMenuItem mntmNewMenuItem = new JMenuItem("Adding Moves");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpMoves.open();
			}
		});
		mnBasics.add(mntmNewMenuItem);
		// Opens the window that lists the currently available shortcuts
		JMenuItem mntmShortcuts = new JMenuItem("Shortcuts");
		mntmShortcuts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpShortcut.open();
			}
		});
		mnBasics.add(mntmShortcuts);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpAbout.open();
			}
		});
		mnBasics.add(mntmAbout);
	}
}

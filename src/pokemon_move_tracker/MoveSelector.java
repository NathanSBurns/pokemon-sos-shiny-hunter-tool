package pokemon_move_tracker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MoveSelector {

	private JFrame frame;
	private static JList list = new JList();

	/**
	 * Launch the application.
	 */
	public static void moveSelector() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoveSelector window = new MoveSelector();
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
	public MoveSelector() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			// pressing enter acts as pressing the submit button.
			public void keyPressed(KeyEvent evnt) {
				if (evnt.getKeyCode() == KeyEvent.VK_ENTER) {
					// sets move 1 to the selected move
					Frame1.setMove(list.getSelectedValue().toString());
					// sets the PP
					setPP();
				}
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSelectAMove = new JLabel("Select a move");
		lblSelectAMove.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblSelectAMove.setBounds(247, 11, 151, 34);
		frame.getContentPane().add(lblSelectAMove);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 19, 197, 239);
		frame.getContentPane().add(scrollPane);

		scrollPane.setViewportView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "10,000,000 Volt Thunderbolt", "Absorb", "Accelerock", "Acid",
					"Acid Armor", "Acid Downpour", "Acid Downpour", "Acid Spray", "Acrobatics", "Acupressure",
					"Aerial Ace", "Aeroblast", "After You", "Agility", "Air Cutter", "Air Slash", "All-Out Pummeling",
					"All-Out Pummeling", "Ally Switch", "Amnesia", "Anchor Shot", "Ancient Power", "Aqua Jet",
					"Aqua Ring", "Aqua Tail", "Arm Thrust", "Aromatherapy", "Aromatic Mist", "Assist", "Assurance",
					"Astonish", "Attack Order", "Attract", "Aura Sphere", "Aurora Beam", "Aurora Veil", "Autotomize",
					"Avalanche", "Baby-Doll Eyes", "Baneful Bunker", "Barrage", "Barrier", "Baton Pass", "Beak Blast",
					"Beat Up", "Belch", "Belly Drum", "Bestow", "Bide", "Bind", "Bite*", "Black Hole Eclipse",
					"Black Hole Eclipse", "Blast Burn", "Blaze Kick", "Blizzard", "Block", "Bloom Doom", "Bloom Doom",
					"Blue Flare", "Body Slam", "Bolt Strike", "Bone Club", "Bone Rush", "Bonemerang", "Boomburst",
					"Bounce", "Brave Bird", "Breakneck Blitz", "Breakneck Blitz", "Brick Break", "Brine",
					"Brutal Swing", "Bubble", "Bubble Beam", "Bug Bite", "Bug Buzz", "Bulk Up", "Bulldoze",
					"Bullet Punch", "Bullet Seed", "Burn Up", "Calm Mind", "Camouflage", "Captivate", "Catastropika",
					"Celebrate", "Charge", "Charge Beam", "Charm*", "Chatter", "Chip Away", "Circle Throw", "Clamp",
					"Clanging Scales", "Clear Smog", "Close Combat", "Coil", "Comet Punch", "Confide", "Confuse Ray",
					"Confusion", "Constrict", "Continental Crush", "Continental Crush", "Conversion", "Conversion 2",
					"Copycat", "Core Enforcer", "Corkscrew Crash", "Corkscrew Crash", "Cosmic Power", "Cotton Guard",
					"Cotton Spore", "Counter", "Covet", "Crabhammer", "Crafty Shield", "Cross Chop", "Cross Poison",
					"Crunch", "Crush Claw", "Crush Grip", "Curse*", "Cut", "Dark Pulse", "Dark Void", "Darkest Lariat",
					"Dazzling Gleam", "Defend Order", "Defense Curl", "Defog", "Destiny Bond", "Detect",
					"Devastating Drake", "Devastating Drake", "Diamond Storm", "Dig", "Disable", "Disarming Voice",
					"Discharge", "Dive", "Dizzy Punch", "Doom Desire", "Double Hit", "Double Kick", "Double Slap",
					"Double Team", "Double-Edge", "Draco Meteor", "Dragon Ascent", "Dragon Breath", "Dragon Claw",
					"Dragon Dance", "Dragon Hammer", "Dragon Pulse", "Dragon Rage", "Dragon Rush", "Dragon Tail",
					"Drain Punch", "Draining Kiss", "Dream Eater", "Drill Peck", "Drill Run", "Drumpf Card",
					"Dual Chop", "Dynamic Punch", "Earth Power", "Earthquake", "Echoed Voice", "Eerie Impulse",
					"Egg Bomb", "Electric Terrain", "Electrify", "Electro Ball", "Electroweb", "Embargo", "Ember",
					"Encore", "Endeavor", "Endure", "Energy Ball", "Entrainment", "Eruption", "Explosion",
					"Extrasensory", "Extreme Evoboost", "Extreme Speed", "Facade", "Fairy Lock", "Fairy Wind",
					"Fake Out", "Fake Tears", "False Swipe", "Feather Dance", "Feint", "Feint Attack", "Fell Stinger",
					"Fiery Dance", "Final Gambit", "Fire Blast", "Fire Fang", "Fire Lash", "Fire Pledge", "Fire Punch",
					"Fire Spin", "First Impression", "Fissure", "Flail", "Flame Burst", "Flame Charge", "Flame Wheel",
					"Flamethrower", "Flare Blitz", "Flash", "Flash Cannon", "Flatter", "Fleur Cannon", "Fling",
					"Floral Healing", "Flower Shield", "Fly", "Flying Press", "Focus Blast", "Focus Energy",
					"Focus Punch", "Follow Me", "Force Palm", "Foresight", "Forest's Curse", "Foul Play",
					"Freeze Shock", "Freeze-Dry", "Frenzy Plant", "Frost Breath", "Frustration", "Fury Attack",
					"Fury Cutter", "Fury Swipes", "Fusion Bolt", "Fusion Flare", "Future Sight", "Gastro Acid",
					"Gear Grind", "Gear Up", "Genesis Supernova", "Geomancy", "Giga Drain", "Giga Impact",
					"Gigavolt Havoc", "Gigavolt Havoc", "Glaciate", "Glare", "Grass Knot", "Grass Pledge",
					"Grass Whistle", "Grassy Terrain", "Gravity", "Growl", "Growth", "Grudge", "Guard Split",
					"Guard Swap", "Guardian of Alola", "Guillotine", "Gunk Shot", "Gust*", "Gyro Ball", "Hail",
					"Hammer Arm", "Happy Hour", "Harden", "Haze", "Head Charge", "Head Smash", "Headbutt", "Heal Bell",
					"Heal Block", "Heal Order", "Heal Pulse", "Healing Wish", "Heart Stamp", "Heart Swap", "Heat Crash",
					"Heat Wave", "Heavy Slam", "Helping Hand", "Hex", "Hidden Power", "High Horsepower",
					"High Jump Kick", "Hold Back", "Hold Hands", "Hone Claws", "Horn Attack", "Horn Drill",
					"Horn Leech", "Howl", "Hurricane", "Hydro Cannon", "Hydro Pump", "Hydro Vortex", "Hydro Vortex",
					"Hyper Beam", "Hyper Fang", "Hyper Voice", "Hyperspace Fury", "Hyperspace Hole", "Hypnosis",
					"Ice Ball", "Ice Beam", "Ice Burn", "Ice Fang", "Ice Hammer", "Ice Punch", "Ice Shard",
					"Icicle Crash", "Icicle Spear", "Icy Wind", "Imprison", "Incinerate", "Inferno",
					"Inferno Overdrive", "Inferno Overdrive", "Infestation", "Ingrain", "Instruct", "Ion Deluge",
					"Iron Defense", "Iron Head", "Iron Tail", "Judgment", "Jump Kick", "Karate Chop*", "Kinesis",
					"King's Shield", "Knock Off", "Land's Wrath", "Laser Focus", "Last Resort", "Lava Plume",
					"Leaf Blade", "Leaf Storm", "Leaf Tornado", "Leafage", "Leech Life", "Leech Seed", "Leer", "Lick",
					"Light of Ruin", "Light Screen", "Liquidation", "Lock-On", "Lovely Kiss", "Low Kick", "Low Sweep",
					"Lucky Chant", "Lunar Dance", "Lunge", "Luster Purge", "Mach Punch", "Magic Coat", "Magic Room",
					"Magical Leaf", "Magma Storm", "Magnet Bomb", "Magnet Rise", "Magnetic Flux", "Magnitude",
					"Malicious Moonsault", "Mat Block", "Me First", "Mean Look", "Meditate", "Mega Drain", "Mega Kick",
					"Mega Punch", "Megahorn", "Memento", "Metal Burst", "Metal Claw", "Metal Sound", "Meteor Mash",
					"Metronome", "Milk Drink", "Mimic", "Mind Reader", "Minimize", "Miracle Eye", "Mirror Coat",
					"Mirror Move", "Mirror Shot", "Mist", "Mist Ball", "Misty Terrain", "Moonblast", "Moongeist Beam",
					"Moonlight*", "Morning Sun", "Mud Bomb", "Mud Shot", "Mud Sport", "Mud-Slap", "Muddy Water",
					"Multi-Attack", "Mystical Fire", "Nasty Plot", "Natural Gift", "Nature Power", "Nature's Madness",
					"Needle Arm", "Never-Ending Nightmare", "Never-Ending Nightmare", "Night Daze", "Night Shade",
					"Night Slash", "Nightmare", "Noble Roar", "Nuzzle", "Oblivion Wing", "Oceanic Operetta",
					"Octazooka", "Odor Sleuth", "Ominous Wind", "Origin Pulse", "Outrage", "Overheat", "Pain Split",
					"Parabolic Charge", "Parting Shot", "Pay Day", "Payback", "Peck", "Perish Song", "Petal Blizzard",
					"Petal Dance", "Phantom Force", "Pin Missile", "Play Nice", "Play Rough", "Pluck", "Poison Fang",
					"Poison Gas", "Poison Jab", "Poison Powder", "Poison Sting", "Poison Tail", "Pollen Puff", "Pound",
					"Powder", "Powder Snow", "Power Gem", "Power Split", "Power Swap", "Power Trick", "Power Trip",
					"Power Whip", "Power-Up Punch", "Precipice Blades", "Present", "Prismatic Laser", "Protect",
					"Psybeam", "Psych Up", "Psychic", "Psychic Fangs", "Psychic Terrain", "Psycho Boost", "Psycho Cut",
					"Psycho Shift", "Psyshock", "Psystrike", "Psywave", "Pulverizing Pancake", "Punishment", "Purify",
					"Pursuit", "Quash", "Quick Attack", "Quick Guard", "Quiver Dance", "Rage", "Rage Powder",
					"Rain Dance", "Rapid Spin", "Razor Leaf", "Razor Shell", "Razor Wind", "Recover", "Recycle",
					"Reflect", "Reflect Type", "Refresh", "Relic Song", "Rest", "Retaliate", "Return",
					"Revelation Dance", "Revenge", "Reversal", "Roar", "Roar of Time", "Rock Blast", "Rock Climb",
					"Rock Polish", "Rock Slide", "Rock Smash", "Rock Throw", "Rock Tomb", "Rock Wrecker", "Role Play",
					"Rolling Kick", "Rollout", "Roost", "Rototiller", "Round", "Sacred Fire", "Sacred Sword",
					"Safeguard", "Sand Attack*", "Sand Tomb", "Sandstorm", "Savage Spin-Out", "Savage Spin-Out",
					"Scald", "Scary Face", "Scratch", "Screech", "Searing Shot", "Secret Power", "Secret Sword",
					"Seed Bomb", "Seed Flare", "Seismic Toss", "Self-Destruct", "Shadow Ball", "Shadow Bone",
					"Shadow Claw", "Shadow Force", "Shadow Punch", "Shadow Sneak", "Sharpen", "Shattered Psyche",
					"Shattered Psyche", "Sheer Cold", "Shell Smash", "Shell Trap", "Shift Gear", "Shock Wave",
					"Shore Up", "Signal Beam", "Silver Wind", "Simple Beam", "Sing", "Sinister Arrow Raid", "Sketch",
					"Skill Swap", "Skull Bash", "Sky Attack", "Sky Drop", "Sky Uppercut", "Slack Off", "Slam", "Slash",
					"Sleep Powder", "Sleep Talk", "Sludge", "Sludge Bomb", "Sludge Wave", "Smack Down", "Smart Strike",
					"Smelling Salts", "Smog", "Smokescreen", "Snarl", "Snatch", "Snore", "Soak", "Soft-Boiled",
					"Solar Beam", "Solar Blade", "Sonic Boom", "Soul-Stealing 7-Star Strike", "Spacial Rend", "Spark",
					"Sparkling Aria", "Spectral Thief", "Speed Swap", "Spider Web", "Spike Cannon", "Spikes",
					"Spiky Shield", "Spirit Shackle", "Spit Up", "Spite", "Splash", "Spore", "Spotlight",
					"Stealth Rock", "Steam Eruption", "Steamroller", "Steel Wing", "Sticky Web", "Stockpile",
					"Stoked Sparksurfer", "Stomp", "Stomping Tantrum", "Stone Edge", "Stored Power", "Storm Throw",
					"Strength", "Strength Sap", "String Shot", "Struggle", "Struggle Bug", "Stun Spore", "Submission",
					"Substitute", "Subzero Slammer", "Subzero Slammer", "Sucker Punch", "Sunny Day", "Sunsteel Strike",
					"Super Fang", "Superpower", "Supersonic", "Supersonic Skystrike", "Supersonic Skystrike", "Surf",
					"Swagger", "Swallow", "Sweet Kiss*", "Sweet Scent", "Swift", "Switcheroo", "Swords Dance",
					"Synchronoise", "Synthesis", "Tackle", "Tail Glow", "Tail Slap", "Tail Whip", "Tailwind",
					"Take Down", "Taunt", "Tearful Look", "Techno Blast", "Tectonic Rage", "Tectonic Rage",
					"Teeter Dance", "Telekinesis", "Teleport", "Thief", "Thousand Arrows", "Thousand Waves", "Thrash",
					"Throat Chop", "Thunder", "Thunder Fang", "Thunder Punch", "Thunder Shock", "Thunder Wave",
					"Thunderbolt", "Tickle", "Topsy-Turvy", "Torment", "Toxic", "Toxic Spikes", "Toxic Thread",
					"Transform", "Tri Attack", "Trick", "Trick Room", "Trick-or-Treat", "Triple Kick", "Trop Kick",
					"Twineedle", "Twinkle Tackle", "Twinkle Tackle", "Twister", "U-turn", "Uproar", "V-create",
					"Vacuum Wave", "Venom Drench", "Venoshock", "Vice Grip", "Vine Whip", "Vital Throw", "Volt Switch",
					"Volt Tackle", "Wake-Up Slap", "Water Gun", "Water Pledge", "Water Pulse", "Water Shuriken*",
					"Water Sport", "Water Spout", "Waterfall", "Weather Ball", "Whirlpool", "Whirlwind", "Wide Guard",
					"Wild Charge", "Will-O-Wisp", "Wing Attack", "Wish", "Withdraw", "Wonder Room", "Wood Hammer",
					"Work Up", "Worry Seed", "Wrap", "Wring Out", "X-Scissor", "Yawn", "Zap Cannon", "Zen Headbutt",
					"Zing Zap" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// sets move 1 to the selected move
				Frame1.setMove(list.getSelectedValue().toString());
				// sets the PP
				setPP();
				frame.dispose();
			}
		});
		btnSelect.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnSelect.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSelect);
		frame.getRootPane().setDefaultButton(btnSelect);

	}

	public static void setPP() {
		switch (list.getSelectedIndex()) {
		case 0:
			Frame1.setMovePP("1");
			break;
		case 1:
			Frame1.setMovePP("25");
			break;
		case 2:
			Frame1.setMovePP("20");
			break;
		case 3:
			Frame1.setMovePP("30");
			break;
		case 4:
			Frame1.setMovePP("20");
			break;
		case 5:
			Frame1.setMovePP("1");
			break;
		case 6:
			Frame1.setMovePP("1");
			break;
		case 7:
			Frame1.setMovePP("20");
			break;
		case 8:
			Frame1.setMovePP("15");
			break;
		case 9:
			Frame1.setMovePP("30");
			break;
		case 10:
			Frame1.setMovePP("20");
			break;
		case 11:
			Frame1.setMovePP("5");
			break;
		case 12:
			Frame1.setMovePP("15");
			break;
		case 13:
			Frame1.setMovePP("30");
			break;
		case 14:
			Frame1.setMovePP("25");
			break;
		case 15:
			Frame1.setMovePP("15");
			break;
		case 16:
			Frame1.setMovePP("1");
			break;
		case 17:
			Frame1.setMovePP("1");
			break;
		case 18:
			Frame1.setMovePP("15");
			break;
		case 19:
			Frame1.setMovePP("20");
			break;
		case 20:
			Frame1.setMovePP("20");
			break;
		case 21:
			Frame1.setMovePP("5");
			break;
		case 22:
			Frame1.setMovePP("20");
			break;
		case 23:
			Frame1.setMovePP("20");
			break;
		case 24:
			Frame1.setMovePP("10");
			break;
		case 25:
			Frame1.setMovePP("20");
			break;
		case 26:
			Frame1.setMovePP("5");
			break;
		case 27:
			Frame1.setMovePP("20");
			break;
		case 28:
			Frame1.setMovePP("20");
			break;
		case 29:
			Frame1.setMovePP("10");
			break;
		case 30:
			Frame1.setMovePP("15");
			break;
		case 31:
			Frame1.setMovePP("15");
			break;
		case 32:
			Frame1.setMovePP("15");
			break;
		case 33:
			Frame1.setMovePP("20");
			break;
		case 34:
			Frame1.setMovePP("20");
			break;
		case 35:
			Frame1.setMovePP("20");
			break;
		case 36:
			Frame1.setMovePP("15");
			break;
		case 37:
			Frame1.setMovePP("10");
			break;
		case 38:
			Frame1.setMovePP("30");
			break;
		case 39:
			Frame1.setMovePP("10");
			break;
		case 40:
			Frame1.setMovePP("20");
			break;
		case 41:
			Frame1.setMovePP("20");
			break;
		case 42:
			Frame1.setMovePP("40");
			break;
		case 43:
			Frame1.setMovePP("15");
			break;
		case 44:
			Frame1.setMovePP("10");
			break;
		case 45:
			Frame1.setMovePP("10");
			break;
		case 46:
			Frame1.setMovePP("10");
			break;
		case 47:
			Frame1.setMovePP("15");
			break;
		case 48:
			Frame1.setMovePP("10");
			break;
		case 49:
			Frame1.setMovePP("20");
			break;
		case 50:
			Frame1.setMovePP("25");
			break;
		case 51:
			Frame1.setMovePP("1");
			break;
		case 52:
			Frame1.setMovePP("1");
			break;
		case 53:
			Frame1.setMovePP("5");
			break;
		case 54:
			Frame1.setMovePP("10");
			break;
		case 55:
			Frame1.setMovePP("5");
			break;
		case 56:
			Frame1.setMovePP("5");
			break;
		case 57:
			Frame1.setMovePP("1");
			break;
		case 58:
			Frame1.setMovePP("1");
			break;
		case 59:
			Frame1.setMovePP("5");
			break;
		case 60:
			Frame1.setMovePP("15");
			break;
		case 61:
			Frame1.setMovePP("5");
			break;
		case 62:
			Frame1.setMovePP("20");
			break;
		case 63:
			Frame1.setMovePP("10");
			break;
		case 64:
			Frame1.setMovePP("10");
			break;
		case 65:
			Frame1.setMovePP("10");
			break;
		case 66:
			Frame1.setMovePP("5");
			break;
		case 67:
			Frame1.setMovePP("15");
			break;
		case 68:
			Frame1.setMovePP("1");
			break;
		case 69:
			Frame1.setMovePP("1");
			break;
		case 70:
			Frame1.setMovePP("15");
			break;
		case 71:
			Frame1.setMovePP("10");
			break;
		case 72:
			Frame1.setMovePP("20");
			break;
		case 73:
			Frame1.setMovePP("30");
			break;
		case 74:
			Frame1.setMovePP("20");
			break;
		case 75:
			Frame1.setMovePP("20");
			break;
		case 76:
			Frame1.setMovePP("10");
			break;
		case 77:
			Frame1.setMovePP("20");
			break;
		case 78:
			Frame1.setMovePP("20");
			break;
		case 79:
			Frame1.setMovePP("30");
			break;
		case 80:
			Frame1.setMovePP("30");
			break;
		case 81:
			Frame1.setMovePP("5");
			break;
		case 82:
			Frame1.setMovePP("20");
			break;
		case 83:
			Frame1.setMovePP("20");
			break;
		case 84:
			Frame1.setMovePP("20");
			break;
		case 85:
			Frame1.setMovePP("1");
			break;
		case 86:
			Frame1.setMovePP("40");
			break;
		case 87:
			Frame1.setMovePP("20");
			break;
		case 88:
			Frame1.setMovePP("10");
			break;
		case 89:
			Frame1.setMovePP("20");
			break;
		case 90:
			Frame1.setMovePP("20");
			break;
		case 91:
			Frame1.setMovePP("20");
			break;
		case 92:
			Frame1.setMovePP("10");
			break;
		case 93:
			Frame1.setMovePP("15");
			break;
		case 94:
			Frame1.setMovePP("5");
			break;
		case 95:
			Frame1.setMovePP("15");
			break;
		case 96:
			Frame1.setMovePP("5");
			break;
		case 97:
			Frame1.setMovePP("20");
			break;
		case 98:
			Frame1.setMovePP("15");
			break;
		case 99:
			Frame1.setMovePP("20");
			break;
		case 100:
			Frame1.setMovePP("10");
			break;
		case 101:
			Frame1.setMovePP("25");
			break;
		case 102:
			Frame1.setMovePP("35");
			break;
		case 103:
			Frame1.setMovePP("1");
			break;
		case 104:
			Frame1.setMovePP("1");
			break;
		case 105:
			Frame1.setMovePP("30");
			break;
		case 106:
			Frame1.setMovePP("30");
			break;
		case 107:
			Frame1.setMovePP("20");
			break;
		case 108:
			Frame1.setMovePP("10");
			break;
		case 109:
			Frame1.setMovePP("1");
			break;
		case 110:
			Frame1.setMovePP("1");
			break;
		case 111:
			Frame1.setMovePP("20");
			break;
		case 112:
			Frame1.setMovePP("10");
			break;
		case 113:
			Frame1.setMovePP("40");
			break;
		case 114:
			Frame1.setMovePP("20");
			break;
		case 115:
			Frame1.setMovePP("25");
			break;
		case 116:
			Frame1.setMovePP("10");
			break;
		case 117:
			Frame1.setMovePP("10");
			break;
		case 118:
			Frame1.setMovePP("5");
			break;
		case 119:
			Frame1.setMovePP("20");
			break;
		case 120:
			Frame1.setMovePP("15");
			break;
		case 121:
			Frame1.setMovePP("10");
			break;
		case 122:
			Frame1.setMovePP("5");
			break;
		case 123:
			Frame1.setMovePP("10");
			break;
		case 124:
			Frame1.setMovePP("30");
			break;
		case 125:
			Frame1.setMovePP("15");
			break;
		case 126:
			Frame1.setMovePP("10");
			break;
		case 127:
			Frame1.setMovePP("10");
			break;
		case 128:
			Frame1.setMovePP("10");
			break;
		case 129:
			Frame1.setMovePP("10");
			break;
		case 130:
			Frame1.setMovePP("40");
			break;
		case 131:
			Frame1.setMovePP("15");
			break;
		case 132:
			Frame1.setMovePP("5");
			break;
		case 133:
			Frame1.setMovePP("5");
			break;
		case 134:
			Frame1.setMovePP("1");
			break;
		case 135:
			Frame1.setMovePP("1");
			break;
		case 136:
			Frame1.setMovePP("5");
			break;
		case 137:
			Frame1.setMovePP("10");
			break;
		case 138:
			Frame1.setMovePP("20");
			break;
		case 139:
			Frame1.setMovePP("15");
			break;
		case 140:
			Frame1.setMovePP("15");
			break;
		case 141:
			Frame1.setMovePP("10");
			break;
		case 142:
			Frame1.setMovePP("10");
			break;
		case 143:
			Frame1.setMovePP("5");
			break;
		case 144:
			Frame1.setMovePP("10");
			break;
		case 145:
			Frame1.setMovePP("30");
			break;
		case 146:
			Frame1.setMovePP("10");
			break;
		case 147:
			Frame1.setMovePP("15");
			break;
		case 148:
			Frame1.setMovePP("15");
			break;
		case 149:
			Frame1.setMovePP("5");
			break;
		case 150:
			Frame1.setMovePP("5");
			break;
		case 151:
			Frame1.setMovePP("20");
			break;
		case 152:
			Frame1.setMovePP("15");
			break;
		case 153:
			Frame1.setMovePP("20");
			break;
		case 154:
			Frame1.setMovePP("15");
			break;
		case 155:
			Frame1.setMovePP("10");
			break;
		case 156:
			Frame1.setMovePP("10");
			break;
		case 157:
			Frame1.setMovePP("10");
			break;
		case 158:
			Frame1.setMovePP("10");
			break;
		case 159:
			Frame1.setMovePP("10");
			break;
		case 160:
			Frame1.setMovePP("10");
			break;
		case 161:
			Frame1.setMovePP("15");
			break;
		case 162:
			Frame1.setMovePP("20");
			break;
		case 163:
			Frame1.setMovePP("10");
			break;
		case 164:
			Frame1.setMovePP("5");
			break;
		case 165:
			Frame1.setMovePP("15");
			break;
		case 166:
			Frame1.setMovePP("5");
			break;
		case 167:
			Frame1.setMovePP("10");
			break;
		case 168:
			Frame1.setMovePP("10");
			break;
		case 169:
			Frame1.setMovePP("15");
			break;
		case 170:
			Frame1.setMovePP("15");
			break;
		case 171:
			Frame1.setMovePP("10");
			break;
		case 172:
			Frame1.setMovePP("10");
			break;
		case 173:
			Frame1.setMovePP("20");
			break;
		case 174:
			Frame1.setMovePP("10");
			break;
		case 175:
			Frame1.setMovePP("15");
			break;
		case 176:
			Frame1.setMovePP("15");
			break;
		case 177:
			Frame1.setMovePP("25");
			break;
		case 178:
			Frame1.setMovePP("5");
			break;
		case 179:
			Frame1.setMovePP("5");
			break;
		case 180:
			Frame1.setMovePP("10");
			break;
		case 181:
			Frame1.setMovePP("10");
			break;
		case 182:
			Frame1.setMovePP("15");
			break;
		case 183:
			Frame1.setMovePP("5");
			break;
		case 184:
			Frame1.setMovePP("5");
			break;
		case 185:
			Frame1.setMovePP("20");
			break;
		case 186:
			Frame1.setMovePP("1");
			break;
		case 187:
			Frame1.setMovePP("5");
			break;
		case 188:
			Frame1.setMovePP("20");
			break;
		case 189:
			Frame1.setMovePP("10");
			break;
		case 190:
			Frame1.setMovePP("30");
			break;
		case 191:
			Frame1.setMovePP("10");
			break;
		case 192:
			Frame1.setMovePP("20");
			break;
		case 193:
			Frame1.setMovePP("40");
			break;
		case 194:
			Frame1.setMovePP("15");
			break;
		case 195:
			Frame1.setMovePP("10");
			break;
		case 196:
			Frame1.setMovePP("20");
			break;
		case 197:
			Frame1.setMovePP("25");
			break;
		case 198:
			Frame1.setMovePP("10");
			break;
		case 199:
			Frame1.setMovePP("5");
			break;
		case 200:
			Frame1.setMovePP("5");
			break;
		case 201:
			Frame1.setMovePP("15");
			break;
		case 202:
			Frame1.setMovePP("15");
			break;
		case 203:
			Frame1.setMovePP("10");
			break;
		case 204:
			Frame1.setMovePP("15");
			break;
		case 205:
			Frame1.setMovePP("15");
			break;
		case 206:
			Frame1.setMovePP("10");
			break;
		case 207:
			Frame1.setMovePP("5");
			break;
		case 208:
			Frame1.setMovePP("15");
			break;
		case 209:
			Frame1.setMovePP("15");
			break;
		case 210:
			Frame1.setMovePP("20");
			break;
		case 211:
			Frame1.setMovePP("25");
			break;
		case 212:
			Frame1.setMovePP("15");
			break;
		case 213:
			Frame1.setMovePP("15");
			break;
		case 214:
			Frame1.setMovePP("20");
			break;
		case 215:
			Frame1.setMovePP("10");
			break;
		case 216:
			Frame1.setMovePP("15");
			break;
		case 217:
			Frame1.setMovePP("5");
			break;
		case 218:
			Frame1.setMovePP("10");
			break;
		case 219:
			Frame1.setMovePP("10");
			break;
		case 220:
			Frame1.setMovePP("10");
			break;
		case 221:
			Frame1.setMovePP("15");
			break;
		case 222:
			Frame1.setMovePP("10");
			break;
		case 223:
			Frame1.setMovePP("5");
			break;
		case 224:
			Frame1.setMovePP("30");
			break;
		case 225:
			Frame1.setMovePP("20");
			break;
		case 226:
			Frame1.setMovePP("20");
			break;
		case 227:
			Frame1.setMovePP("10");
			break;
		case 228:
			Frame1.setMovePP("40");
			break;
		case 229:
			Frame1.setMovePP("20");
			break;
		case 230:
			Frame1.setMovePP("15");
			break;
		case 231:
			Frame1.setMovePP("5");
			break;
		case 232:
			Frame1.setMovePP("20");
			break;
		case 233:
			Frame1.setMovePP("5");
			break;
		case 234:
			Frame1.setMovePP("10");
			break;
		case 235:
			Frame1.setMovePP("20");
			break;
		case 236:
			Frame1.setMovePP("20");
			break;
		case 237:
			Frame1.setMovePP("20");
			break;
		case 238:
			Frame1.setMovePP("15");
			break;
		case 239:
			Frame1.setMovePP("5");
			break;
		case 240:
			Frame1.setMovePP("5");
			break;
		case 241:
			Frame1.setMovePP("10");
			break;
		case 242:
			Frame1.setMovePP("10");
			break;
		case 243:
			Frame1.setMovePP("15");
			break;
		case 244:
			Frame1.setMovePP("20");
			break;
		case 245:
			Frame1.setMovePP("1");
			break;
		case 246:
			Frame1.setMovePP("10");
			break;
		case 247:
			Frame1.setMovePP("10");
			break;
		case 248:
			Frame1.setMovePP("5");
			break;
		case 249:
			Frame1.setMovePP("1");
			break;
		case 250:
			Frame1.setMovePP("1");
			break;
		case 251:
			Frame1.setMovePP("10");
			break;
		case 252:
			Frame1.setMovePP("30");
			break;
		case 253:
			Frame1.setMovePP("20");
			break;
		case 254:
			Frame1.setMovePP("10");
			break;
		case 255:
			Frame1.setMovePP("15");
			break;
		case 256:
			Frame1.setMovePP("10");
			break;
		case 257:
			Frame1.setMovePP("5");
			break;
		case 258:
			Frame1.setMovePP("40");
			break;
		case 259:
			Frame1.setMovePP("20");
			break;
		case 260:
			Frame1.setMovePP("5");
			break;
		case 261:
			Frame1.setMovePP("10");
			break;
		case 262:
			Frame1.setMovePP("10");
			break;
		case 263:
			Frame1.setMovePP("1");
			break;
		case 264:
			Frame1.setMovePP("5");
			break;
		case 265:
			Frame1.setMovePP("5");
			break;
		case 266:
			Frame1.setMovePP("35");
			break;
		case 267:
			Frame1.setMovePP("5");
			break;
		case 268:
			Frame1.setMovePP("10");
			break;
		case 269:
			Frame1.setMovePP("10");
			break;
		case 270:
			Frame1.setMovePP("30");
			break;
		case 271:
			Frame1.setMovePP("30");
			break;
		case 272:
			Frame1.setMovePP("30");
			break;
		case 273:
			Frame1.setMovePP("15");
			break;
		case 274:
			Frame1.setMovePP("5");
			break;
		case 275:
			Frame1.setMovePP("15");
			break;
		case 276:
			Frame1.setMovePP("5");
			break;
		case 277:
			Frame1.setMovePP("15");
			break;
		case 278:
			Frame1.setMovePP("10");
			break;
		case 279:
			Frame1.setMovePP("10");
			break;
		case 280:
			Frame1.setMovePP("10");
			break;
		case 281:
			Frame1.setMovePP("25");
			break;
		case 282:
			Frame1.setMovePP("10");
			break;
		case 283:
			Frame1.setMovePP("10");
			break;
		case 284:
			Frame1.setMovePP("10");
			break;
		case 285:
			Frame1.setMovePP("10");
			break;
		case 286:
			Frame1.setMovePP("20");
			break;
		case 287:
			Frame1.setMovePP("10");
			break;
		case 288:
			Frame1.setMovePP("15");
			break;
		case 289:
			Frame1.setMovePP("10");
			break;
		case 290:
			Frame1.setMovePP("10");
			break;
		case 291:
			Frame1.setMovePP("40");
			break;
		case 292:
			Frame1.setMovePP("40");
			break;
		case 293:
			Frame1.setMovePP("15");
			break;
		case 294:
			Frame1.setMovePP("25");
			break;
		case 295:
			Frame1.setMovePP("5");
			break;
		case 296:
			Frame1.setMovePP("10");
			break;
		case 297:
			Frame1.setMovePP("40");
			break;
		case 298:
			Frame1.setMovePP("10");
			break;
		case 299:
			Frame1.setMovePP("5");
			break;
		case 300:
			Frame1.setMovePP("5");
			break;
		case 301:
			Frame1.setMovePP("1");
			break;
		case 302:
			Frame1.setMovePP("1");
			break;
		case 303:
			Frame1.setMovePP("5");
			break;
		case 304:
			Frame1.setMovePP("15");
			break;
		case 305:
			Frame1.setMovePP("10");
			break;
		case 306:
			Frame1.setMovePP("5");
			break;
		case 307:
			Frame1.setMovePP("5");
			break;
		case 308:
			Frame1.setMovePP("20");
			break;
		case 309:
			Frame1.setMovePP("20");
			break;
		case 310:
			Frame1.setMovePP("10");
			break;
		case 311:
			Frame1.setMovePP("5");
			break;
		case 312:
			Frame1.setMovePP("15");
			break;
		case 313:
			Frame1.setMovePP("10");
			break;
		case 314:
			Frame1.setMovePP("15");
			break;
		case 315:
			Frame1.setMovePP("30");
			break;
		case 316:
			Frame1.setMovePP("10");
			break;
		case 317:
			Frame1.setMovePP("30");
			break;
		case 318:
			Frame1.setMovePP("15");
			break;
		case 319:
			Frame1.setMovePP("10");
			break;
		case 320:
			Frame1.setMovePP("5");
			break;
		case 321:
			Frame1.setMovePP("1");
			break;
		case 322:
			Frame1.setMovePP("1");
			break;
		case 323:
			Frame1.setMovePP("20");
			break;
		case 324:
			Frame1.setMovePP("20");
			break;
		case 325:
			Frame1.setMovePP("20");
			break;
		case 326:
			Frame1.setMovePP("15");
			break;
		case 327:
			Frame1.setMovePP("25");
			break;
		case 328:
			Frame1.setMovePP("15");
			break;
		case 329:
			Frame1.setMovePP("15");
			break;
		case 330:
			Frame1.setMovePP("15");
			break;
		case 331:
			Frame1.setMovePP("10");
			break;
		case 332:
			Frame1.setMovePP("10");
			break;
		case 333:
			Frame1.setMovePP("25");
			break;
		case 334:
			Frame1.setMovePP("15");
			break;
		case 335:
			Frame1.setMovePP("10");
			break;
		case 336:
			Frame1.setMovePP("20");
			break;
		case 337:
			Frame1.setMovePP("10");
			break;
		case 338:
			Frame1.setMovePP("30");
			break;
		case 339:
			Frame1.setMovePP("5");
			break;
		case 340:
			Frame1.setMovePP("15");
			break;
		case 341:
			Frame1.setMovePP("15");
			break;
		case 342:
			Frame1.setMovePP("5");
			break;
		case 343:
			Frame1.setMovePP("10");
			break;
		case 344:
			Frame1.setMovePP("40");
			break;
		case 345:
			Frame1.setMovePP("10");
			break;
		case 346:
			Frame1.setMovePP("10");
			break;
		case 347:
			Frame1.setMovePP("30");
			break;
		case 348:
			Frame1.setMovePP("30");
			break;
		case 349:
			Frame1.setMovePP("5");
			break;
		case 350:
			Frame1.setMovePP("30");
			break;
		case 351:
			Frame1.setMovePP("10");
			break;
		case 352:
			Frame1.setMovePP("5");
			break;
		case 353:
			Frame1.setMovePP("10");
			break;
		case 354:
			Frame1.setMovePP("20");
			break;
		case 355:
			Frame1.setMovePP("20");
			break;
		case 356:
			Frame1.setMovePP("30");
			break;
		case 357:
			Frame1.setMovePP("10");
			break;
		case 358:
			Frame1.setMovePP("15");
			break;
		case 359:
			Frame1.setMovePP("5");
			break;
		case 360:
			Frame1.setMovePP("30");
			break;
		case 361:
			Frame1.setMovePP("15");
			break;
		case 362:
			Frame1.setMovePP("10");
			break;
		case 363:
			Frame1.setMovePP("20");
			break;
		case 364:
			Frame1.setMovePP("5");
			break;
		case 365:
			Frame1.setMovePP("20");
			break;
		case 366:
			Frame1.setMovePP("10");
			break;
		case 367:
			Frame1.setMovePP("20");
			break;
		case 368:
			Frame1.setMovePP("30");
			break;
		case 369:
			Frame1.setMovePP("1");
			break;
		case 370:
			Frame1.setMovePP("10");
			break;
		case 371:
			Frame1.setMovePP("20");
			break;
		case 372:
			Frame1.setMovePP("5");
			break;
		case 373:
			Frame1.setMovePP("40");
			break;
		case 374:
			Frame1.setMovePP("15");
			break;
		case 375:
			Frame1.setMovePP("5");
			break;
		case 376:
			Frame1.setMovePP("20");
			break;
		case 377:
			Frame1.setMovePP("10");
			break;
		case 378:
			Frame1.setMovePP("10");
			break;
		case 379:
			Frame1.setMovePP("10");
			break;
		case 380:
			Frame1.setMovePP("35");
			break;
		case 381:
			Frame1.setMovePP("40");
			break;
		case 382:
			Frame1.setMovePP("10");
			break;
		case 383:
			Frame1.setMovePP("10");
			break;
		case 384:
			Frame1.setMovePP("10");
			break;
		case 385:
			Frame1.setMovePP("10");
			break;
		case 386:
			Frame1.setMovePP("5");
			break;
		case 387:
			Frame1.setMovePP("10");
			break;
		case 388:
			Frame1.setMovePP("40");
			break;
		case 389:
			Frame1.setMovePP("20");
			break;
		case 390:
			Frame1.setMovePP("20");
			break;
		case 391:
			Frame1.setMovePP("10");
			break;
		case 392:
			Frame1.setMovePP("30");
			break;
		case 393:
			Frame1.setMovePP("5");
			break;
		case 394:
			Frame1.setMovePP("10");
			break;
		case 395:
			Frame1.setMovePP("15");
			break;
		case 396:
			Frame1.setMovePP("5");
			break;
		case 397:
			Frame1.setMovePP("5");
			break;
		case 398:
			Frame1.setMovePP("5");
			break;
		case 399:
			Frame1.setMovePP("10");
			break;
		case 400:
			Frame1.setMovePP("15");
			break;
		case 401:
			Frame1.setMovePP("15");
			break;
		case 402:
			Frame1.setMovePP("10");
			break;
		case 403:
			Frame1.setMovePP("10");
			break;
		case 404:
			Frame1.setMovePP("10");
			break;
		case 405:
			Frame1.setMovePP("10");
			break;
		case 406:
			Frame1.setMovePP("20");
			break;
		case 407:
			Frame1.setMovePP("15");
			break;
		case 408:
			Frame1.setMovePP("20");
			break;
		case 409:
			Frame1.setMovePP("10");
			break;
		case 410:
			Frame1.setMovePP("15");
			break;
		case 411:
			Frame1.setMovePP("1");
			break;
		case 412:
			Frame1.setMovePP("1");
			break;
		case 413:
			Frame1.setMovePP("10");
			break;
		case 414:
			Frame1.setMovePP("15");
			break;
		case 415:
			Frame1.setMovePP("15");
			break;
		case 416:
			Frame1.setMovePP("15");
			break;
		case 417:
			Frame1.setMovePP("30");
			break;
		case 418:
			Frame1.setMovePP("20");
			break;
		case 419:
			Frame1.setMovePP("10");
			break;
		case 420:
			Frame1.setMovePP("1");
			break;
		case 421:
			Frame1.setMovePP("10");
			break;
		case 422:
			Frame1.setMovePP("40");
			break;
		case 423:
			Frame1.setMovePP("5");
			break;
		case 424:
			Frame1.setMovePP("10");
			break;
		case 425:
			Frame1.setMovePP("10");
			break;
		case 426:
			Frame1.setMovePP("5");
			break;
		case 427:
			Frame1.setMovePP("20");
			break;
		case 428:
			Frame1.setMovePP("20");
			break;
		case 429:
			Frame1.setMovePP("20");
			break;
		case 430:
			Frame1.setMovePP("20");
			break;
		case 431:
			Frame1.setMovePP("10");
			break;
		case 432:
			Frame1.setMovePP("35");
			break;
		case 433:
			Frame1.setMovePP("5");
			break;
		case 434:
			Frame1.setMovePP("15");
			break;
		case 435:
			Frame1.setMovePP("10");
			break;
		case 436:
			Frame1.setMovePP("10");
			break;
		case 437:
			Frame1.setMovePP("20");
			break;
		case 438:
			Frame1.setMovePP("20");
			break;
		case 439:
			Frame1.setMovePP("10");
			break;
		case 440:
			Frame1.setMovePP("20");
			break;
		case 441:
			Frame1.setMovePP("15");
			break;
		case 442:
			Frame1.setMovePP("40");
			break;
		case 443:
			Frame1.setMovePP("20");
			break;
		case 444:
			Frame1.setMovePP("35");
			break;
		case 445:
			Frame1.setMovePP("35");
			break;
		case 446:
			Frame1.setMovePP("25");
			break;
		case 447:
			Frame1.setMovePP("15");
			break;
		case 448:
			Frame1.setMovePP("35");
			break;
		case 449:
			Frame1.setMovePP("20");
			break;
		case 450:
			Frame1.setMovePP("25");
			break;
		case 451:
			Frame1.setMovePP("20");
			break;
		case 452:
			Frame1.setMovePP("10");
			break;
		case 453:
			Frame1.setMovePP("10");
			break;
		case 454:
			Frame1.setMovePP("10");
			break;
		case 455:
			Frame1.setMovePP("10");
			break;
		case 456:
			Frame1.setMovePP("10");
			break;
		case 457:
			Frame1.setMovePP("20");
			break;
		case 458:
			Frame1.setMovePP("10");
			break;
		case 459:
			Frame1.setMovePP("15");
			break;
		case 460:
			Frame1.setMovePP("10");
			break;
		case 461:
			Frame1.setMovePP("10");
			break;
		case 462:
			Frame1.setMovePP("20");
			break;
		case 463:
			Frame1.setMovePP("10");
			break;
		case 464:
			Frame1.setMovePP("10");
			break;
		case 465:
			Frame1.setMovePP("10");
			break;
		case 466:
			Frame1.setMovePP("10");
			break;
		case 467:
			Frame1.setMovePP("5");
			break;
		case 468:
			Frame1.setMovePP("20");
			break;
		case 469:
			Frame1.setMovePP("10");
			break;
		case 470:
			Frame1.setMovePP("10");
			break;
		case 471:
			Frame1.setMovePP("10");
			break;
		case 472:
			Frame1.setMovePP("15");
			break;
		case 473:
			Frame1.setMovePP("1");
			break;
		case 474:
			Frame1.setMovePP("5");
			break;
		case 475:
			Frame1.setMovePP("20");
			break;
		case 476:
			Frame1.setMovePP("20");
			break;
		case 477:
			Frame1.setMovePP("15");
			break;
		case 478:
			Frame1.setMovePP("30");
			break;
		case 479:
			Frame1.setMovePP("15");
			break;
		case 480:
			Frame1.setMovePP("20");
			break;
		case 481:
			Frame1.setMovePP("20");
			break;
		case 482:
			Frame1.setMovePP("20");
			break;
		case 483:
			Frame1.setMovePP("5");
			break;
		case 484:
			Frame1.setMovePP("40");
			break;
		case 485:
			Frame1.setMovePP("25");
			break;
		case 486:
			Frame1.setMovePP("10");
			break;
		case 487:
			Frame1.setMovePP("10");
			break;
		case 488:
			Frame1.setMovePP("10");
			break;
		case 489:
			Frame1.setMovePP("10");
			break;
		case 490:
			Frame1.setMovePP("20");
			break;
		case 491:
			Frame1.setMovePP("15");
			break;
		case 492:
			Frame1.setMovePP("20");
			break;
		case 493:
			Frame1.setMovePP("10");
			break;
		case 494:
			Frame1.setMovePP("10");
			break;
		case 495:
			Frame1.setMovePP("5");
			break;
		case 496:
			Frame1.setMovePP("20");
			break;
		case 497:
			Frame1.setMovePP("15");
			break;
		case 498:
			Frame1.setMovePP("10");
			break;
		case 499:
			Frame1.setMovePP("15");
			break;
		case 500:
			Frame1.setMovePP("20");
			break;
		case 501:
			Frame1.setMovePP("5");
			break;
		case 502:
			Frame1.setMovePP("10");
			break;
		case 503:
			Frame1.setMovePP("20");
			break;
		case 504:
			Frame1.setMovePP("20");
			break;
		case 505:
			Frame1.setMovePP("10");
			break;
		case 506:
			Frame1.setMovePP("15");
			break;
		case 507:
			Frame1.setMovePP("15");
			break;
		case 508:
			Frame1.setMovePP("15");
			break;
		case 509:
			Frame1.setMovePP("5");
			break;
		case 510:
			Frame1.setMovePP("10");
			break;
		case 511:
			Frame1.setMovePP("15");
			break;
		case 512:
			Frame1.setMovePP("20");
			break;
		case 513:
			Frame1.setMovePP("10");
			break;
		case 514:
			Frame1.setMovePP("10");
			break;
		case 515:
			Frame1.setMovePP("15");
			break;
		case 516:
			Frame1.setMovePP("5");
			break;
		case 517:
			Frame1.setMovePP("15");
			break;
		case 518:
			Frame1.setMovePP("25");
			break;
		case 519:
			Frame1.setMovePP("15");
			break;
		case 520:
			Frame1.setMovePP("15");
			break;
		case 521:
			Frame1.setMovePP("20");
			break;
		case 522:
			Frame1.setMovePP("1");
			break;
		case 523:
			Frame1.setMovePP("1");
			break;
		case 524:
			Frame1.setMovePP("15");
			break;
		case 525:
			Frame1.setMovePP("10");
			break;
		case 526:
			Frame1.setMovePP("35");
			break;
		case 527:
			Frame1.setMovePP("40");
			break;
		case 528:
			Frame1.setMovePP("5");
			break;
		case 529:
			Frame1.setMovePP("20");
			break;
		case 530:
			Frame1.setMovePP("10");
			break;
		case 531:
			Frame1.setMovePP("15");
			break;
		case 532:
			Frame1.setMovePP("5");
			break;
		case 533:
			Frame1.setMovePP("20");
			break;
		case 534:
			Frame1.setMovePP("5");
			break;
		case 535:
			Frame1.setMovePP("15");
			break;
		case 536:
			Frame1.setMovePP("10");
			break;
		case 537:
			Frame1.setMovePP("15");
			break;
		case 538:
			Frame1.setMovePP("5");
			break;
		case 539:
			Frame1.setMovePP("20");
			break;
		case 540:
			Frame1.setMovePP("30");
			break;
		case 541:
			Frame1.setMovePP("30");
			break;
		case 542:
			Frame1.setMovePP("1");
			break;
		case 543:
			Frame1.setMovePP("1");
			break;
		case 544:
			Frame1.setMovePP("5");
			break;
		case 545:
			Frame1.setMovePP("15");
			break;
		case 546:
			Frame1.setMovePP("5");
			break;
		case 547:
			Frame1.setMovePP("10");
			break;
		case 548:
			Frame1.setMovePP("20");
			break;
		case 549:
			Frame1.setMovePP("10");
			break;
		case 550:
			Frame1.setMovePP("15");
			break;
		case 551:
			Frame1.setMovePP("5");
			break;
		case 552:
			Frame1.setMovePP("15");
			break;
		case 553:
			Frame1.setMovePP("15");
			break;
		case 554:
			Frame1.setMovePP("1");
			break;
		case 555:
			Frame1.setMovePP("1");
			break;
		case 556:
			Frame1.setMovePP("10");
			break;
		case 557:
			Frame1.setMovePP("10");
			break;
		case 558:
			Frame1.setMovePP("5");
			break;
		case 559:
			Frame1.setMovePP("10");
			break;
		case 560:
			Frame1.setMovePP("15");
			break;
		case 561:
			Frame1.setMovePP("10");
			break;
		case 562:
			Frame1.setMovePP("20");
			break;
		case 563:
			Frame1.setMovePP("20");
			break;
		case 564:
			Frame1.setMovePP("15");
			break;
		case 565:
			Frame1.setMovePP("10");
			break;
		case 566:
			Frame1.setMovePP("20");
			break;
		case 567:
			Frame1.setMovePP("10");
			break;
		case 568:
			Frame1.setMovePP("10");
			break;
		case 569:
			Frame1.setMovePP("15");
			break;
		case 570:
			Frame1.setMovePP("10");
			break;
		case 571:
			Frame1.setMovePP("10");
			break;
		case 572:
			Frame1.setMovePP("20");
			break;
		case 573:
			Frame1.setMovePP("20");
			break;
		case 574:
			Frame1.setMovePP("15");
			break;
		case 575:
			Frame1.setMovePP("10");
			break;
		case 576:
			Frame1.setMovePP("15");
			break;
		case 577:
			Frame1.setMovePP("20");
			break;
		case 578:
			Frame1.setMovePP("10");
			break;
		case 579:
			Frame1.setMovePP("10");
			break;
		case 580:
			Frame1.setMovePP("10");
			break;
		case 581:
			Frame1.setMovePP("20");
			break;
		case 582:
			Frame1.setMovePP("1");
			break;
		case 583:
			Frame1.setMovePP("5");
			break;
		case 584:
			Frame1.setMovePP("20");
			break;
		case 585:
			Frame1.setMovePP("10");
			break;
		case 586:
			Frame1.setMovePP("10");
			break;
		case 587:
			Frame1.setMovePP("10");
			break;
		case 588:
			Frame1.setMovePP("10");
			break;
		case 589:
			Frame1.setMovePP("15");
			break;
		case 590:
			Frame1.setMovePP("20");
			break;
		case 591:
			Frame1.setMovePP("10");
			break;
		case 592:
			Frame1.setMovePP("10");
			break;
		case 593:
			Frame1.setMovePP("10");
			break;
		case 594:
			Frame1.setMovePP("10");
			break;
		case 595:
			Frame1.setMovePP("40");
			break;
		case 596:
			Frame1.setMovePP("15");
			break;
		case 597:
			Frame1.setMovePP("15");
			break;
		case 598:
			Frame1.setMovePP("20");
			break;
		case 599:
			Frame1.setMovePP("5");
			break;
		case 600:
			Frame1.setMovePP("20");
			break;
		case 601:
			Frame1.setMovePP("25");
			break;
		case 602:
			Frame1.setMovePP("20");
			break;
		case 603:
			Frame1.setMovePP("20");
			break;
		case 604:
			Frame1.setMovePP("1");
			break;
		case 605:
			Frame1.setMovePP("20");
			break;
		case 606:
			Frame1.setMovePP("10");
			break;
		case 607:
			Frame1.setMovePP("5");
			break;
		case 608:
			Frame1.setMovePP("10");
			break;
		case 609:
			Frame1.setMovePP("10");
			break;
		case 610:
			Frame1.setMovePP("15");
			break;
		case 611:
			Frame1.setMovePP("10");
			break;
		case 612:
			Frame1.setMovePP("40");
			break;
		case 613:
			Frame1.setMovePP("1");
			break;
		case 614:
			Frame1.setMovePP("20");
			break;
		case 615:
			Frame1.setMovePP("30");
			break;
		case 616:
			Frame1.setMovePP("20");
			break;
		case 617:
			Frame1.setMovePP("10");
			break;
		case 618:
			Frame1.setMovePP("1");
			break;
		case 619:
			Frame1.setMovePP("1");
			break;
		case 620:
			Frame1.setMovePP("5");
			break;
		case 621:
			Frame1.setMovePP("5");
			break;
		case 622:
			Frame1.setMovePP("5");
			break;
		case 623:
			Frame1.setMovePP("10");
			break;
		case 624:
			Frame1.setMovePP("5");
			break;
		case 625:
			Frame1.setMovePP("20");
			break;
		case 626:
			Frame1.setMovePP("1");
			break;
		case 627:
			Frame1.setMovePP("1");
			break;
		case 628:
			Frame1.setMovePP("15");
			break;
		case 629:
			Frame1.setMovePP("15");
			break;
		case 630:
			Frame1.setMovePP("10");
			break;
		case 631:
			Frame1.setMovePP("10");
			break;
		case 632:
			Frame1.setMovePP("20");
			break;
		case 633:
			Frame1.setMovePP("20");
			break;
		case 634:
			Frame1.setMovePP("10");
			break;
		case 635:
			Frame1.setMovePP("20");
			break;
		case 636:
			Frame1.setMovePP("10");
			break;
		case 637:
			Frame1.setMovePP("5");
			break;
		case 638:
			Frame1.setMovePP("35");
			break;
		case 639:
			Frame1.setMovePP("20");
			break;
		case 640:
			Frame1.setMovePP("10");
			break;
		case 641:
			Frame1.setMovePP("30");
			break;
		case 642:
			Frame1.setMovePP("15");
			break;
		case 643:
			Frame1.setMovePP("20");
			break;
		case 644:
			Frame1.setMovePP("20");
			break;
		case 645:
			Frame1.setMovePP("20");
			break;
		case 646:
			Frame1.setMovePP("5");
			break;
		case 647:
			Frame1.setMovePP("1");
			break;
		case 648:
			Frame1.setMovePP("1");
			break;
		case 649:
			Frame1.setMovePP("20");
			break;
		case 650:
			Frame1.setMovePP("15");
			break;
		case 651:
			Frame1.setMovePP("20");
			break;
		case 652:
			Frame1.setMovePP("25");
			break;
		case 653:
			Frame1.setMovePP("10");
			break;
		case 654:
			Frame1.setMovePP("10");
			break;
		case 655:
			Frame1.setMovePP("10");
			break;
		case 656:
			Frame1.setMovePP("15");
			break;
		case 657:
			Frame1.setMovePP("10");
			break;
		case 658:
			Frame1.setMovePP("15");
			break;
		case 659:
			Frame1.setMovePP("15");
			break;
		case 660:
			Frame1.setMovePP("30");
			break;
		case 661:
			Frame1.setMovePP("20");
			break;
		case 662:
			Frame1.setMovePP("15");
			break;
		case 663:
			Frame1.setMovePP("20");
			break;
		case 664:
			Frame1.setMovePP("20");
			break;
		case 665:
			Frame1.setMovePP("15");
			break;
		case 666:
			Frame1.setMovePP("10");
			break;
		case 667:
			Frame1.setMovePP("20");
			break;
		case 668:
			Frame1.setMovePP("20");
			break;
		case 669:
			Frame1.setMovePP("10");
			break;
		case 670:
			Frame1.setMovePP("10");
			break;
		case 671:
			Frame1.setMovePP("10");
			break;
		case 672:
			Frame1.setMovePP("5");
			break;
		case 673:
			Frame1.setMovePP("20");
			break;
		case 674:
			Frame1.setMovePP("10");
			break;
		case 675:
			Frame1.setMovePP("15");
			break;
		case 676:
			Frame1.setMovePP("20");
			break;
		case 677:
			Frame1.setMovePP("1");
			break;
		case 678:
			Frame1.setMovePP("1");
			break;
		case 679:
			Frame1.setMovePP("20");
			break;
		case 680:
			Frame1.setMovePP("20");
			break;
		case 681:
			Frame1.setMovePP("10");
			break;
		case 682:
			Frame1.setMovePP("5");
			break;
		case 683:
			Frame1.setMovePP("30");
			break;
		case 684:
			Frame1.setMovePP("20");
			break;
		case 685:
			Frame1.setMovePP("10");
			break;
		case 686:
			Frame1.setMovePP("30");
			break;
		case 687:
			Frame1.setMovePP("25");
			break;
		case 688:
			Frame1.setMovePP("10");
			break;
		case 689:
			Frame1.setMovePP("20");
			break;
		case 690:
			Frame1.setMovePP("15");
			break;
		case 691:
			Frame1.setMovePP("10");
			break;
		case 692:
			Frame1.setMovePP("25");
			break;
		case 693:
			Frame1.setMovePP("10");
			break;
		case 694:
			Frame1.setMovePP("20");
			break;
		case 695:
			Frame1.setMovePP("20");
			break;
		case 696:
			Frame1.setMovePP("15");
			break;
		case 697:
			Frame1.setMovePP("5");
			break;
		case 698:
			Frame1.setMovePP("15");
			break;
		case 699:
			Frame1.setMovePP("10");
			break;
		case 700:
			Frame1.setMovePP("15");
			break;
		case 701:
			Frame1.setMovePP("20");
			break;
		case 702:
			Frame1.setMovePP("10");
			break;
		case 703:
			Frame1.setMovePP("15");
			break;
		case 704:
			Frame1.setMovePP("15");
			break;
		case 705:
			Frame1.setMovePP("35");
			break;
		case 706:
			Frame1.setMovePP("10");
			break;
		case 707:
			Frame1.setMovePP("40");
			break;
		case 708:
			Frame1.setMovePP("10");
			break;
		case 709:
			Frame1.setMovePP("15");
			break;
		case 710:
			Frame1.setMovePP("30");
			break;
		case 711:
			Frame1.setMovePP("10");
			break;
		case 712:
			Frame1.setMovePP("20");
			break;
		case 713:
			Frame1.setMovePP("5");
			break;
		case 714:
			Frame1.setMovePP("15");
			break;
		case 715:
			Frame1.setMovePP("10");
			break;
		case 716:
			Frame1.setMovePP("5");
			break;
		case 717:
			Frame1.setMovePP("15");
			break;
		case 718:
			Frame1.setMovePP("10");
			break;
		}

	}
}

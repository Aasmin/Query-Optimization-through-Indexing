package oui;

import java.awt.*;	//applet wala package hai
import javax.swing.*;	//swing library hai, and swing de andr hunda JFrame
/**
 * app.java che main thing is to derive JFrame and setVisible krna.
 * and 4 panels ko lgana
 */
public class App extends JFrame {	// JFrame object bnan naal window dikh di
	JTabbedPane tabPane;	// tabPane naal niche wale 4 tabs enable hon giya
	HomePanel homePanel;
	DataPanel dataPanel;
	IndexPanel indexPanel;
	QueryPanel queryPanel;
	
	public App() {
		tabPane = new JTabbedPane();
		tabPane.setFont(new Font("Comic Sans MS", 1, 30));
		tabPane.setBackground(Color.DARK_GRAY);
		tabPane.setForeground(Color.WHITE);
		
		homePanel = new HomePanel(tabPane);
		dataPanel = new DataPanel(tabPane);
		indexPanel = new IndexPanel(tabPane);
		queryPanel = new QueryPanel(tabPane);
		
		super.add(tabPane); //jframe
		
		pack();
		
		super.setTitle("RDBMS Index Implementation");
		super.setExtendedState(MAXIMIZED_BOTH);	//horizontally and vertically poore screen ka size lelo
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	// JVM nu close krda, agr nahi close kran ge then application close hon te pichhe JVM chalda rhu and machine will get hang
		super.setVisible(true);	
	}
}

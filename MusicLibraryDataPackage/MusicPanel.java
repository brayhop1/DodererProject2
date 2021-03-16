package MusicLibraryDataPackage;

import java.util.*;
import java.io.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import MusicLibraryDataPackage.Collection;

import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MusicPanel extends JPanel {
	private final int WIDTH = 800, HEIGHT = 500;
	private JPanel controlPanel;

	private Collection myLibrary;

	/**
	 * Create the panel.
	 */
	public MusicPanel() {
		myLibrary = new Collection();

		controlPanel = new JPanel();
		controlPanel.setPreferredSize(new Dimension(500, 550));
		controlPanel.setBackground(Color.GRAY);
		controlPanel.setLayout(null);

		add(controlPanel);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(0, 486, 500, 14);
		controlPanel.add(progressBar);

		JButton btnPlaypause = new JButton("Play/Pause");
		btnPlaypause.setBounds(210, 452, 89, 23);
		controlPanel.add(btnPlaypause);

		JButton btnSkip = new JButton("Skip");
		btnSkip.setBounds(290, 452, 81, 23);
		btnSkip.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				//Collection.remove();
				System.out.println("No song to skip.");
			}
		});
		controlPanel.add(btnSkip);

		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(130, 452, 85, 23);
		btnPrevious.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				//Collection.remove();
				System.out.println("No previous song.");
			}
		});
		controlPanel.add(btnPrevious);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 495, 22);
		controlPanel.add(menuBar);

		JButton btnRemoveSong = new JButton("Remove Song");
		btnRemoveSong.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				//Collection.remove();
				System.out.println("No song to remove.");
			}
		});
		menuBar.add(btnRemoveSong);

		JButton btnEditASong = new JButton("Edit a Song");
		menuBar.add(btnEditASong);
		
		JCheckBox chckbxMute = new JCheckBox("Mute?");
		menuBar.add(chckbxMute);

		JRadioButton rdbtnFavorite = new JRadioButton("Favorite");
		rdbtnFavorite.setBounds(290, 400, 80, 23);
		controlPanel.add(rdbtnFavorite);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MusicPanel.class.getResource("/MusicLibraryDataPackage/flink_squirrel_200_color.jpg")));
		lblNewLabel.setBounds(141, 126, 211, 253);
		controlPanel.add(lblNewLabel);

		JLabel lblPlaying = new JLabel("Songs:");
		lblPlaying.setBounds(63, 99, 39, 14);
		controlPanel.add(lblPlaying);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(112, 94, 259, 41);
		controlPanel.add(scrollPane);
		
		// FIX THIS!!!
		JTextArea textArea = new JTextArea();
		textArea.setText(myLibrary.toString());
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("by Brayden Hopkins");
		lblNewLabel_1.setBounds(350, 35, 125, 14);
		controlPanel.add(lblNewLabel_1);

	}
}

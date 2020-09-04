package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.OgrenciModel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class OgrenciUI extends JFrame {

	private JPanel contentPane;
	public JDesktopPane desktopPane;
	public JMenuItem mnItemOgrenciListesi;
	public JMenuItem mnItemOgrenciIslemleri;
	public 	JButton btnNewButton ;
	public OgrenciUI() {
		Init();
		this.setVisible(true);
	}

	private void Init() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 537);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnOgrenci = new JMenu("Ogrenci");
		menuBar.add(mnOgrenci);

		mnItemOgrenciListesi = new JMenuItem("Öðrenci Listesi");
		mnOgrenci.add(mnItemOgrenciListesi);

		mnItemOgrenciIslemleri = new JMenuItem("Öðrenci Ýþlemleri");
		mnOgrenci.add(mnItemOgrenciIslemleri);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(desktopPane,
				GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE));
		
		JLabel lblWelcome = new JLabel("Ho\u015F Geldiniz");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 41));
		lblWelcome.setBounds(251, 174, 230, 139);
		desktopPane.add(lblWelcome);
		
		 btnNewButton = new JButton("New button");
		btnNewButton.setBounds(69, 379, 89, 23);
		desktopPane.add(btnNewButton);
		contentPane.setLayout(gl_contentPane);
	}

	public void createFrame(JInternalFrame frame) {
		//
		frame.setVisible(true);
		desktopPane.add(frame);
		try {
			frame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
			System.out.println(e);
		}
		setContentPane(desktopPane);
		desktopPane.putClientProperty("JDesktopPane.dragMode", "outline");
	}
}

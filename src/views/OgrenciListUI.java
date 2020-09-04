package views;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.OgrenciModel;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OgrenciListUI extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable tblOgrenciler;

	static int openFrameCount = 0;
	static final int xOffset = 30, yOffset = 30;
	private JTextField txtSearchKey;

	public OgrenciListUI() {
		super("Document #" + (++openFrameCount), true, true, true, true);
		setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
		Init();
	}

	private void Init() {
		setBounds(100, 100, 644, 469);
		JScrollPane scrollPane = new JScrollPane();

		JLabel lblNewLabel = new JLabel("ARAMA MEN\u00DCS\u00DC");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));

		JLabel lblSearchKey = new JLabel("Aranacak Kelime");

		txtSearchKey = new JTextField();
		txtSearchKey.setColumns(10);

		JButton btnSearch = new JButton("Arama");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(15, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 594, GroupLayout.PREFERRED_SIZE))
						.addGap(38))
				.addGroup(Alignment.LEADING,
						groupLayout.createSequentialGroup().addContainerGap().addComponent(lblSearchKey).addGap(18)
								.addComponent(txtSearchKey, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(367, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup().addGap(155).addComponent(btnSearch)
						.addContainerGap(415, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSearchKey, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSearchKey, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnSearch)
						.addContainerGap(73, Short.MAX_VALUE)));

		tblOgrenciler = new JTable();
		tblOgrenciler.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Numara", "Ad", "Soyad", "\u015Eehir", "Adres", "Ya\u015F\u0131", "Memleketi" }));
		scrollPane.setViewportView(tblOgrenciler);
		getContentPane().setLayout(groupLayout);

	}

	public void setTableData(ArrayList<OgrenciModel> ogrenciler) {
		int rowCount = ogrenciler.size();

		Object[] baslik = { "Numara", "Ad", "Soyad", "Sehir", "Adres", "Yas", "Memleket" };
		Object[][] veri = new Object[rowCount][7];

		for (int i = 0; i < rowCount; i++) {
			veri[i][0] = ogrenciler.get(i).getNumara();
			veri[i][1] = ogrenciler.get(i).getAd();
			veri[i][2] = ogrenciler.get(i).getSoyad();
			veri[i][3] = ogrenciler.get(i).getSehir();
			veri[i][4] = ogrenciler.get(i).getAdres();
			veri[i][5] = ogrenciler.get(i).getYas();
			veri[i][6] = ogrenciler.get(i).getMemleket();
		}
		tblOgrenciler.setModel(new DefaultTableModel(veri, baslik));
	}

}

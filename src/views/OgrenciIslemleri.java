package views;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import models.OgrenciModel;

import java.awt.Font;
import javax.swing.ImageIcon;

public class OgrenciIslemleri extends JInternalFrame {
	public JTextField txtNumara;
	public JTextField txtAd;
	public JTextField txtSoyad;
	public JTextField txtSehir;
	public JTextField txtAdres;
	public JTextField txtYas;
	public JTextField txtMemleket;
	public JButton btnSave;
	public JButton btnDelete;
	public JButton btnGet;

	static int openFrameCount = 0;
	static final int xOffset = 30, yOffset = 30;
	
	public OgrenciIslemleri() {
		super("Document #" + (++openFrameCount), true, true, true, true);
		setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
		Init();
		this.setVisible(true);
	}

	public void setDataComponent(OgrenciModel ogr) {
		this.txtNumara.setText(String.valueOf(ogr.getNumara()));
		this.txtAd.setText(ogr.getAd());
		this.txtSoyad.setText(ogr.getSoyad());
		this.txtSehir.setText(ogr.getSehir());
		this.txtAdres.setText(ogr.getAdres());
		this.txtYas.setText(ogr.getYas());
		this.txtMemleket.setText(ogr.getMemleket());
	}

	public OgrenciModel getData() {
		if (txtNumara.getText() == "") {
			return new OgrenciModel(0, txtAd.getText(), txtSoyad.getText(), txtSehir.getText(), txtAdres.getText(),
					txtYas.getText(), txtMemleket.getText());
		}
		return new OgrenciModel(Integer.parseInt(txtNumara.getText()), txtAd.getText(), txtSoyad.getText(),
				txtSehir.getText(), txtAdres.getText(), txtYas.getText(), txtMemleket.getText());
	}

	public int ogrenciNo() {
		if (txtNumara.getText() == "") {
		 return 0;
	 }
	 return Integer.valueOf(txtNumara.getText());
 }
	public void Init() {

		setBounds(100, 100, 412, 447);

		JLabel lblNumara = new JLabel("Numara");

		JLabel lblAd = new JLabel("Ad");

		JLabel lblSoyad = new JLabel("Soyad");

		JLabel lblSehir = new JLabel("\u015Eehir");

		JLabel lblAdres = new JLabel("Adres");

		JLabel lblYas = new JLabel("Ya\u015F");

		JLabel lblMemleket = new JLabel("Memleket");

		txtNumara = new JTextField();
		txtNumara.setColumns(10);

		txtAd = new JTextField();
		txtAd.setColumns(10);

		txtSoyad = new JTextField();
		txtSoyad.setColumns(10);

		txtSehir = new JTextField();
		txtSehir.setColumns(10);

		txtAdres = new JTextField();
		txtAdres.setColumns(10);

		txtYas = new JTextField();
		txtYas.setColumns(10);

		txtMemleket = new JTextField();
		txtMemleket.setColumns(10);

		btnSave = new JButton("Save");
		btnSave.setIcon(
				new ImageIcon(OgrenciIslemleri.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));

		btnDelete = new JButton("Delete");
		btnDelete.setIcon(
				new ImageIcon(OgrenciIslemleri.class.getResource("/com/sun/java/swing/plaf/motif/icons/Error.gif")));

		JLabel lblNewLabel = new JLabel("\u00D6\u011Frenci \u0130\u015Flemleri");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 37));
		
		btnGet = new JButton("Öðrenciyi Getir");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(69, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addGap(17)
												.addComponent(lblAd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addComponent(lblNumara)
											.addComponent(lblSoyad, Alignment.TRAILING)
											.addComponent(lblSehir, Alignment.TRAILING)
											.addComponent(lblAdres, Alignment.TRAILING)
											.addComponent(lblYas, Alignment.TRAILING))
										.addComponent(lblMemleket))
									.addGap(32))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnSave)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtAd, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtNumara, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnGet))
										.addComponent(txtSoyad, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtSehir, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtAdres, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtYas, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtMemleket, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(54)
									.addComponent(btnDelete)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(65))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumara)
						.addComponent(txtNumara, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGet))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAd)
						.addComponent(txtAd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSoyad)
						.addComponent(txtSoyad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSehir)
						.addComponent(txtSehir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdres)
						.addComponent(txtAdres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYas)
						.addComponent(txtYas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMemleket)
						.addComponent(txtMemleket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnDelete))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

	}

}

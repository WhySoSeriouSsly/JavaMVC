package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dataaccess.DbUtil;
import models.OgrenciModel;
import models.OgrenciRowModel;

public class OgrenciListController {
	private Connection conn;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ArrayList<OgrenciModel> ogrenciler;

	public OgrenciListController() {

		conn = DbUtil.connection;
	}

	public ArrayList<OgrenciModel> getRecords() {
		OgrenciModel ogr;
		ogrenciler = new ArrayList<OgrenciModel>();

		try {
			stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ogrenci;");

			while (rs.next()) {
				int numara = rs.getInt("numara");
				String ad = rs.getString("ad");
				String soyad = rs.getString("soyad");
				String sehir = rs.getString("Sehir");
				String adres = rs.getString("Adres");
				String yas = rs.getString("Yas");
				String memleket = rs.getString("Memleketi");
				ogr = new OgrenciModel(numara, ad, soyad, sehir, adres, yas, memleket);
				ogrenciler.add(ogr);
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return ogrenciler;
	}

	public OgrenciModel getRecordByNumara(int numara) {
		if (String.valueOf(numara) == "") {
			JOptionPane.showMessageDialog(null, "Alanlarý Giriniz");
			return null;
		}

		OgrenciModel ogr = null;

		try {
			pstmt = this.conn.prepareStatement("select * from ogrenci where numara = ?");

			pstmt.setInt(1, numara);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				ogr = new OgrenciModel(rs.getInt("numara"), rs.getString("ad"), rs.getString("soyad"),
						rs.getString("sehir"), rs.getString("adres"), rs.getString("yas"), rs.getString("memleketi"));
			}

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return ogr;
	}

	public OgrenciModel getRecordByName(String ad) {
		OgrenciModel ogr = null;

		try {
			pstmt = this.conn.prepareStatement("select * from ogrenci where Ad = ?");

			pstmt.setString(1, ad);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				ogr = new OgrenciModel(rs.getInt("numara"), rs.getString("ad"), rs.getString("soyad"),
						rs.getString("sehir"), rs.getString("adres"), rs.getString("yas"), rs.getString("memleketi"));
			}

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return ogr;
	}

	public ArrayList<OgrenciRowModel> getRowRecords() {

		OgrenciRowModel ogr;
		ArrayList<OgrenciRowModel> ogrencilerRow = new ArrayList<OgrenciRowModel>();

		try {
			stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ogrenci;");

			while (rs.next()) {
				int numara = rs.getInt("numara");
				String ad = rs.getString("ad");
				ogr = new OgrenciRowModel(numara, ad);
				ogrencilerRow.add(ogr);
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return ogrencilerRow;
	}

	public void getSearchRecords() {
		
	}
}

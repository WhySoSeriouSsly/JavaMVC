package controllers;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import business.Validator;
import dataaccess.DbUtil;
import models.OgrenciModel;

public class OgrenciSaveController {

	private Connection conn = null;

	public OgrenciSaveController() {
		conn=DbUtil.connection;
	}

	public void insertRecord(OgrenciModel ogr) {
		if(Validator.validate(ogr)==false) {
			JOptionPane.showMessageDialog(null,"Alanlarý Giriniz.");
			return;
		};
		PreparedStatement pstmt = null;
		try {
			pstmt = this.conn.prepareStatement("insert into ogrenci (numara, ad, soyad) values(?, ?, ?) ");

			pstmt.setInt(1, ogr.getNumara());
			pstmt.setString(2, ogr.getAd());
			pstmt.setString(3, ogr.getSoyad());
			pstmt.executeUpdate();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}

	public void updateRecord(OgrenciModel ogr) {
		PreparedStatement pstmt = null;
		try {
			pstmt = this.conn.prepareStatement("update ogrenci set ad = ?, soyad = ? where numara = ?");

			pstmt.setString(1, ogr.getAd());
			pstmt.setString(2, ogr.getSoyad());
			pstmt.setInt(3, ogr.getNumara());

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

	}

}

package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dataaccess.DbUtil;

public class OgrenciDeleteController {
	private Connection conn = null;

	public OgrenciDeleteController() {
		conn = DbUtil.connection;
	}

	public void deleteRecord(int numara) {
		PreparedStatement pstmt = null;
		try {
			pstmt = this.conn.prepareStatement("delete from ogrenci where numara = ?");

			pstmt.setInt(1, numara);
			pstmt.executeUpdate();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}
}

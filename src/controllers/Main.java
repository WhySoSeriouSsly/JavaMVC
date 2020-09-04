package controllers;

import java.awt.EventQueue;
import java.sql.SQLException;

import dataaccess.DbUtil;
import views.OgrenciUI;

public class Main {
	public static void main(String[] args) {//project started.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DbUtil dbUtil=new DbUtil();
					dbUtil.baglanti();
					OgrenciMainController ogrenciController = new OgrenciMainController();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}

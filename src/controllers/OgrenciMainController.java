package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import models.OgrenciModel;
import views.OgrenciIslemleri;
import views.OgrenciListUI;
import views.OgrenciUI;

public class OgrenciMainController implements ActionListener {
	private OgrenciListController listController;
	private OgrenciSaveController saveController;
	private OgrenciDeleteController deleteController;
	private OgrenciUI ogrenciUi;
	private OgrenciListUI ogrenciList;
	private OgrenciIslemleri ogrenciIslem;
	public OgrenciMainController() {
		listController = new OgrenciListController();
		saveController = new OgrenciSaveController();
		deleteController = new OgrenciDeleteController();
		ogrenciUi = new OgrenciUI();
		ogrenciList = new OgrenciListUI();
		ogrenciList.setTableData(listController.getRecords());
		ogrenciIslem = new OgrenciIslemleri();
		ogrenciIslem.btnSave.addActionListener(this);
		ogrenciIslem.btnDelete.addActionListener(this);
		ogrenciUi.btnNewButton.addActionListener(this);
		ogrenciUi.mnItemOgrenciIslemleri.addActionListener(this);
		ogrenciUi.mnItemOgrenciListesi.addActionListener(this);
		ogrenciIslem.btnGet.addActionListener(this);
	}

	private void refreshTable() {
		ogrenciList.setTableData(listController.getRecords());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Öðrenci Listesi") {
			ogrenciUi.createFrame(ogrenciList);
		} else if (e.getActionCommand() == "Öðrenci Ýþlemleri") {
			ogrenciUi.createFrame(ogrenciIslem);
		} else if (e.getActionCommand() == "Save") {
			if (listController.getRecordByNumara(ogrenciIslem.ogrenciNo())==null) {
				saveController.insertRecord(ogrenciIslem.getData());
			}
		
			else {
			saveController.updateRecord(ogrenciIslem.getData());
			}
		
		} else if (e.getActionCommand() == "Delete") {
			deleteController.deleteRecord(Integer.parseInt(ogrenciIslem.txtNumara.getText()));
		} else if (e.getActionCommand() == "Search") {

		} else if (e.getActionCommand() == "Öðrenciyi Getir") {

			ogrenciIslem.setDataComponent(
					listController.getRecordByNumara(ogrenciIslem.ogrenciNo()));
		}
		refreshTable();
	}

}

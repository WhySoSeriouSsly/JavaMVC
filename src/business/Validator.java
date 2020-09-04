package business;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import models.OgrenciModel;

public class Validator {

	public static Boolean validate(OgrenciModel ogr) {

		if (ogr.getAd()=="" || 
				ogr.getNumara()==0||
				ogr.getSoyad()==""||
				ogr.getSehir()==""||
				ogr.getAdres()==""||
				ogr.getSehir()==""||
				ogr.getYas()=="") {
			return false;
		}
		return true;
	}

	public static boolean validatePrimaryKeySize(JTextField textfield) {

		if (textfield.getText().trim().length() > 50) {
			return false;
		}
		return true;
	}

	public static boolean validateTextArea(JTextArea textArea) {

		if (textArea.getText().trim().isEmpty()) {
			return false;
		}
		return true;
	}

	public static boolean validateTextFieldTurkishCharachter(JTextField textField) {

		if (textField.getText().contains("ı") == true || textField.getText().contains("İ") == true
				|| textField.getText().contains("ç") == true || textField.getText().contains("Ç") == true
				|| textField.getText().contains("Ğ") == true || textField.getText().contains("ğ") == true
				|| textField.getText().contains("İ") == true || textField.getText().contains("Ö") == true
				|| textField.getText().contains("ö") == true || textField.getText().contains("Ş") == true
				|| textField.getText().contains("ş") == true || textField.getText().contains("ü") == true
				|| textField.getText().contains("Ü") == true) {
			return false;
		}
		return true;
	}

	public static boolean validateTextAreaTurkishCharachter(JTextArea textArea) {

		if (textArea.getText().contains("ı") == true || textArea.getText().contains("İ") == true
				|| textArea.getText().contains("ç") == true || textArea.getText().contains("Ç") == true
				|| textArea.getText().contains("Ğ") == true || textArea.getText().contains("ğ") == true
				|| textArea.getText().contains("İ") == true || textArea.getText().contains("Ö") == true
				|| textArea.getText().contains("ö") == true || textArea.getText().contains("Ş") == true
				|| textArea.getText().contains("ş") == true || textArea.getText().contains("ü") == true
				|| textArea.getText().contains("Ü") == true) {
			return false;
		}
		return true;
	}

	public static boolean validateTextFieldLength(JTextField textField, int value) {
		if (textField.getText().length() > value) {
			return false;
		}
		return true;
	}
}

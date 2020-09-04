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

		if (textField.getText().contains("�") == true || textField.getText().contains("�") == true
				|| textField.getText().contains("�") == true || textField.getText().contains("�") == true
				|| textField.getText().contains("�") == true || textField.getText().contains("�") == true
				|| textField.getText().contains("�") == true || textField.getText().contains("�") == true
				|| textField.getText().contains("�") == true || textField.getText().contains("�") == true
				|| textField.getText().contains("�") == true || textField.getText().contains("�") == true
				|| textField.getText().contains("�") == true) {
			return false;
		}
		return true;
	}

	public static boolean validateTextAreaTurkishCharachter(JTextArea textArea) {

		if (textArea.getText().contains("�") == true || textArea.getText().contains("�") == true
				|| textArea.getText().contains("�") == true || textArea.getText().contains("�") == true
				|| textArea.getText().contains("�") == true || textArea.getText().contains("�") == true
				|| textArea.getText().contains("�") == true || textArea.getText().contains("�") == true
				|| textArea.getText().contains("�") == true || textArea.getText().contains("�") == true
				|| textArea.getText().contains("�") == true || textArea.getText().contains("�") == true
				|| textArea.getText().contains("�") == true) {
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

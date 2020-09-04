package models;

public class OgrenciRowModel {
	private int numara;
	
	public OgrenciRowModel() {
		
	}
	public OgrenciRowModel(int numara,String ad) {
		this.numara=numara;
		this.ad=ad;
	}
	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	private String ad;
}

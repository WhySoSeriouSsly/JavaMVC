package models;

public class OgrenciModel {

	private int numara;
	private String ad;
	private String soyad;
	private String sehir;
	private String adres;
	private String yas;
	private String memleket;

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getMemleket() {
		return memleket;
	}

	public void setMemleket(String memleket) {
		this.memleket = memleket;
	}

	public OgrenciModel() {

	}

	public OgrenciModel(int numara, String ad, String soyad,String sehir,String adres,String yas,String memleket) {
		this.numara = numara;
		this.ad = ad;
		this.soyad = soyad;
		this.sehir=sehir;
		this.adres=adres;
		this.yas=yas;
		this.memleket=memleket;
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

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

}

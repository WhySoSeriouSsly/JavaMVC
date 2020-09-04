package models;

public class OgrenciYasRowModel {
	private String yas;
	private String memleket;
	private String adres;

	public OgrenciYasRowModel() {
	}
	public OgrenciYasRowModel(String yas,String memleket,String adres) {
		this.yas=yas;
		this.memleket=memleket;
		this.adres=adres;
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
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
}

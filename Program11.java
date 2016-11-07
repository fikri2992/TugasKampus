import java.awt.Color;
public class Program11{
	public String nama;
	public Color warnaBulu;
	public int usia;
	public double bb;
	public boolean statusJinak;
	public String majikan;
		public void cetakInformasi(){	
			System.out.println("nama : " + nama);
			System.out.println("Warna : " + warnaBulu);
			System.out.println("Umur : " + usia);
			System.out.println("Berat: " + bb);
			System.out.println("Status? " + statusJinak);
			System.out.println("Majikan : " + majikan);}
		public void diAdopsi(String m){	
			majikan=m;
			statusJinak=true;}
		public boolean apakahJinak(){	
			return statusJinak;}
		public void diLepas(){	
			majikan="";
			statusJinak= false;}}

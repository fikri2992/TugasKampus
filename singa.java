public class Singa{
	public String nama;
	public int usia;
	public double tb;
	public double bb;
	public boolean statusJinak;
		public void cetakInformasi(){	
			System.out.println("Singa bernama : " + nama);
			System.out.println("Usia : " + usia);
			System.out.println("Tinggi Badan : " + tb);
			System.out.println("Berat Badan : " + bb);
			System.out.println("Jinak? " + statusJinak);}
		public boolean apakahJinak(){	
			return statusJinak;}
		public void diLepas(){	
			statusJinak= false;}}
class Program8{
	String judul;
	String artis;
	int tahunRilis;
	//Konstuktor
	public Program8(String judul, String artis, int tahunRilis){
		this.judul=judul;
		this.artis=artis;
		this.tahunRilis=tahunRilis;}
	public String infoJudul(){
		return(judul);}
	public String infoArtis(){
		return(artis);}
	public int infoTahunRilis(){
		return(tahunRilis);}
	public static void main(String args []){
		Program8 album = new Program8("I Love food", "Rzx",2026);
		System.out.println("Album:" + album.infoJudul());
		System.out.println("Artis: " + album.infoArtis());
		System.out.println("Tahun: " + album.infoTahunRilis());}}

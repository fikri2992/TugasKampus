import java.awt.Color;
public class Program12 {
	public static void main(String  args []){
		Program11 Memei = new Program11();
		Memei.warnaBulu = new Color(0,1,1);
		Memei.nama="Memei";
		Memei.usia=3;
		Memei.bb=4.5;
		Memei.diAdopsi("manusia");
		Memei.cetakInformasi();
		Program11 garong = new Program11();
		garong.warnaBulu = new Color(0,1,1);
		garong.nama="garongz";
		garong.usia=3;
		garong.bb=4.5;
		garong.diAdopsi("MangYahya");
		garong.cetakInformasi();
	}
}

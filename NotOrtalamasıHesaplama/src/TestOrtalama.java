import java.util.Scanner;

public class TestOrtalama {

	public static void main(String[] args) {
		
		
		int mat,fizik,kimya,turkce,tarih,muzik;
		int top=0;
		int ort ;
		int derssayisi=0;
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Matematik sınav sonucunuzu giriniz : ");
		mat = scanner.nextInt();
		top+=mat;
		derssayisi++;
		
		System.out.println("Fizik sınav sonucunuzu giriniz : ");
		fizik = scanner.nextInt();
		top+=fizik;
		derssayisi++;
		
		System.out.println("Kimya sınav sonucunuzu giriniz : ");
		kimya = scanner.nextInt();
		top+=kimya;
		derssayisi++;
		
		System.out.println("Türkçe sınav sonucunuzu giriniz : ");
		turkce=scanner.nextInt();
		top+=turkce;
		derssayisi++;
		
		System.out.println("Tarih sınav sonucunuzu giriniz : ");
		tarih=scanner.nextInt();
		top+=tarih;
		derssayisi++;
		
		System.out.println("Müzik sınav sonucunuzu giriniz : ");
		muzik=scanner.nextInt();
		top+=muzik;
		
		derssayisi++;
	
		
		
		
		
		System.out.println("Sınavlarınızın ortalaması = " + top/derssayisi);
		
		
		

	}

}

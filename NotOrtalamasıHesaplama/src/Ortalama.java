import java.util.Scanner;

public class Ortalama {

	public static void main(String[] args) {
		
		Scanner inp= new Scanner(System.in);
		
		System.out.print("Matematik notunu giriniz: ");
		
		int mat = inp.nextInt();
		
		System.out.print("Türkçe notunu giriniz: ");
		
		int turkce = inp.nextInt();
		
		System.out.print("Fizik notunu giriniz: ");
		
		int fizik = inp.nextInt();
		
		System.out.print("Kimya notunu girin: ");
		
		int kimya=inp.nextInt();
		
		int toplam = mat + fizik + turkce + kimya ;
		double ort = toplam/4;
		System.out.println("Not ortalamanız: " + ort);
		
		String sonuc = (ort >= 60) ? "Sınıfı geçtiniz" : "Sınıfta kaldınız" ;
		System.out.println(sonuc);
		
		
		
				
		
	}
		
		
		
	}
		

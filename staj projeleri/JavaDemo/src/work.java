
public class work {

	public static void main(String[] args) {
		
		/*int ogrenciSayisi =  12;
		String mesaj ="öğrenci sayısı : ";
		System.out.println( mesaj + ogrenciSayisi );
		System.out.println( mesaj + ogrenciSayisi );
		System.out.println( mesaj + ogrenciSayisi );
		System.out.println( mesaj + ogrenciSayisi) ; */
		
		
		
		
		/* int sayi =20; İF BLOKLARI
		if(sayi<20) {
			System.out.println("sayı 20'den küçüktür ");
		}else if(sayi==20) {
			System.out.println("sayı 20'ye eşittir");
		}else {
			System.out.println("sayı 20'den büyüktür");
		*/
		
		
	//------------------------------------	
		/* en büyük sayıyı bulma 
		int sayi1 = 29;
		int sayi2 = 25;
		int sayi3 = 26;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2){
			enBuyuk = sayi2;
		}
		if(enBuyuk <sayi3) {
		
			enBuyuk = sayi3;
			
		}
			
		System.out.println("en Büyük  = " +enBuyuk);
		*/
		
		//-----------------------------------
		
		/* switch bloklarıyla çalışmak
		char grade = 'A';
		
		switch (grade) {
			case'A':
				System.out.println("Mükemmel : Geçtiniz ");
				break;
			case'B':
			case'C':
				System.out.println("iyi : geçtiniz ");
				break;
			case 'D':
				System.out.println("fena değil : GEçtiniz ");
			case'F':
				System.out.println("maalesef kaldınız");
				break;
				*/
				
	//-----------------------------------	
		/*
		for(int i=0; i<10; i+=1) {
				System.out.println(i);
				
				}
		System.out.println(" FOR döngüsü bitti ");
		
		int i=2;
		
		while(i<10) {
			System.out.println(i);
			i+=2;
	
	}
	
		System.out.println("while döngüsü bitti");
		
		int j=100;
		do {
			System.out.println(j);
			j+=20;
			
		}while(j<10);
		System.out.println("do-while döngüsü bitti");
		
		*/
		//--------------------------------------
		/*
		String ogrenci1 = "engin";
		String ogrenci2 = "yusuf";
		String ogrenci3 = "salih";
		String ogrenci4 = "ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="engin";
		ogrenciler[1]="yusuf";
		ogrenciler[2]="salih";
		ogrenciler[3]="ahmet";

		for(int i=0; i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
			
		}
		System.out.println("----------------------");
		for(String ogrenci:ogrenciler ) {
			System.out.println(ogrenci);
		}

		*/
		
		//----------------------------------
		
		/*
		double[]myList = {1.2,1.3,4.3,5.6};
		double total=0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number;
			
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("toplam = " + total);
		System.out.println("en büyük = " + max);
	
	*/
	//-----------------------------
	/*
		String [][] sehirler = new String [3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "bursa ";
		sehirler[0][2] = "bilecik";
		sehirler[1][0] = "ankara";
		sehirler[1][1] = "konya";
		sehirler[1][2] = "kayseri";
		sehirler[2][0] = "diyarbakır";
		sehirler[2][1] = "şanlıurfa";
		sehirler[2][2] = "gaziantep";

		for(int i = 0; i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	 */
		
		String mesaj = "bugün hava çok güzel";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat("yaşasın"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		
	
	
	
	}
	
}




















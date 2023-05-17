
public class FirstClass {

	public static void main(String[] args) {  //main başlangıç noktası 
	
		//camelCase ilk kelimenin ilk harfi küçük sonrfaki kelimelerin ilk harfi büyük.

		
		String internetSubeButonu="İnternet Şubeye gir ";
		double dolarDun = 8.21 ;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = true;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun ) {
		
			System.out.println("Dolar düştü resmi");

		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");

		}
		
		else {
			System.out.println("Dolar eşittir resmi");

		}
		
		String kredi1 ="hızlı kredi";
		String kredi2 ="Mutlu emekli kredisi";
		String kredi3 ="konut kredisi";
		String kredi4 ="çiftci kredisi";
		String kredi5 ="Msb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler = 
			{
					"hızlı kredş ",
					"mutlu emekli kredisi ",
					"konut kredisi ",
					"çiftci kredisi",
					"Msb kredisi"
			};
		
		//foreach elemanları tek tek döner
		for(String kredi : krediler) {
		System.out.println(kredi);
		
		}
		
		for(int i = 0 ; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}

		int sayi1 =10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1 ="ankara";
		String sehir2 ="istanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);
		
		
		
		
	}
 
}
	

/*1. ödev javada veri tipleri 
	tam sayılar byte,short,integer,long,
	ondalıklı sayılar float ,double
	karakterler char
	mantıksal değerler boolean (true false)*/
	









package week1work;

public class StringsDemo {
	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		System.out.println(mesaj);
		System.out.println("---------------------");
		System.out.println("Eleman Sayısı: "+ mesaj.length());
		System.out.println("5. Eleman: "+ mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[25];
		mesaj.getChars(0,10,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println("---------------------");
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		System.out.println("---------------------");
		for (String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		
		
	}

}

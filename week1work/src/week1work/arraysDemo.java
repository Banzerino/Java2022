package week1work;



public class arraysDemo {
	public static void main(String[] args) {
		String ogrenci1 = "Ahsen";
		String ogrenci2 = "İrem";
		String ogrenci3 = "Ayşe";
		String ogrenci4 = "Derin";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("---------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ahsen";
		ogrenciler[1] = "İrem";
		ogrenciler[2] = "Ayşe";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("---------------------");
		
		for(String ogrenci:ogrenciler) {
		System.out.println(ogrenci);
		}
		
		
		
		
	}

}

package week1work;

public class asalSayi {
	public static void main(String[] args) {
		int number = 17;
		boolean isPrime = true;
		if (number == 0) {
			System.out.println("Geçersiz Sayı...");
			return;
		}
		
		if (number == 1) {
			System.out.println("Asal Sayı Değildir...");
			return;
		}
		
		for (int i = 2;i < number; i++) {
			if (number % i == 0)
				isPrime = false;		
		}
		
		if(isPrime) {
			System.out.println("Sayı Asaldır...");
		}
		
		else {
			System.out.println("Sayı Asal Değildir...");
		}
	}

}

package week1work;

public class reCapDemo2 {
	public static void main(String[] args) {
		double[] myList = {1.2,3.4,4.3,5.6};
		double total = 0;
		double max = myList[0];
		
		for (double i:myList) {
			if (max< i) {
				max = i;
			}
			total = total + i;
			System.out.println(i);
		}
		System.out.println("Toplam= "+total);
		System.out.println("En Büyük Sayımız= "+max);
		
	}

}

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hesaplamak istedi�iniz say�y� giriniz : ");
		
		int number = scan.nextInt();

		
		int count = 0;
		while(number != 0) {
			number = number / 10;
			count++;
			System.out.println("basamak say�s� : "+ count);
		}
		
		
		
	}

}

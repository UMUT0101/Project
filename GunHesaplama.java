import java.util.Scanner;

public class GunHesaplama {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[0-6] aras� say� giriniz: " );
		
		byte number = scan.nextByte();
		
		switch(number % 7) {
		
		case 0:{
			System.out.println("pazartesi "+"haftai�i");
			break;
		}
		case 1:{
			System.out.println("sal� "+"haftai�i");
		}
		case 2:{
			System.out.println("�ar�amba "+"haftai�i");
		}
		case 3:{
			System.out.println("per�embe "+"haftai�i");
		}
		case 4:{
			System.out.println("cuma "+"haftai�i");
			break;
		}
		case 5:{
			System.out.println("cumartesi "+"haftasonu");
		}
		case 6:{
			System.out.println("pazar "+"haftasonu");
		}
		
		
		
		}
		
		
	}

}

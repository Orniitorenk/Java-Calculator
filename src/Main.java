import java.util.Scanner;

public class Main {

	public static int subtractionFrom(int a,int b) 
	{		
		return(a-b);		
	}
	
	public static double divide(int a,int b) 
	{
		return ((double) a/b);
	}
	
	public static int add(int a,int b) 
	{
		return(a+b);
	}
	public static int add(int a,int b, int c) 
	{
		return(a+b+c);
	}
	
	public static int multiplication(int a, int b) 
	{
		return(a*b);
	}
	
	public static int multiplication(int a, int b, int c) 
	{
		return(a*b*c);
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		String islemler = "1. Toplama Ýslemi\n"
						+ "2. Cikarma Ýslemi\n"
						+ "3. Carpma Ýslemi\n"
						+ "4. Bolme Ýslemi\n"
						+ "Cikis icin q'ya basiniz.";
		System.out.println("*********************************");
		System.out.println(islemler);
		System.out.println("*********************************");
		
		while(true) {
			System.out.println("Islemi seciniz: ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan Cikiliyor.");
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Kac deger toplayacaksiniz? (2 veya 3)");
				
				int kacsayi = scanner.nextInt();
				if(kacsayi == 2) {
					System.out.print("a:");
					int a = scanner.nextInt();
					System.out.print("b: ");
					int b = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Girilen sayilarin toplamlari: " + (add(a , b)));
				}
				else if(kacsayi == 3) {
					System.out.print("a:");
					int a = scanner.nextInt();
					System.out.print("b:");
					int b = scanner.nextInt();
					System.out.print("c:");
					int c = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Girilen sayilarin toplamlari: " + add(a,b,c));
				}
				else {
					System.out.println("Bunun icin uygun bir method bulunmuyor.");
				}
			}
			else if(islem.equals("2")) {
				System.out.print("a:");
				int a = scanner.nextInt();
				System.out.print("b:");
				int b = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Girilen sayilarin farklari: " + subtractionFrom(a,b));
			}
			else if(islem.equals("3")) {
				System.out.println("Kac deger carpacaksiniz? (2 veya 3)");
				
				int kacsayi = scanner.nextInt();
				if(kacsayi == 2) {
					System.out.print("a:");
					int a = scanner.nextInt();
					System.out.print("b:");
					int b = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Girilen sayilarin carpimi: " + multiplication(a,b));
				}
				else if(kacsayi == 3) {
					System.out.print("a:");
					int a = scanner.nextInt();
					System.out.print("b:");
					int b = scanner.nextInt();
					System.out.print("c:");
					int c = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Girilen sayilarin carpimi: " + multiplication(a,b,c));
				}
				else {
					System.out.println("Bunun icin uygun bir method bulunmuyor.");
				}
				
				
			}
			else if(islem.equals("4")) {
				System.out.print("a:");
				int a = scanner.nextInt();
				System.out.print("b:");
				int b = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Girilen sayilarin bolumu: " + divide(a,b));
			}
			else {
				System.out.println("Gecersiz islem.");
			}
			
		}

	}

}

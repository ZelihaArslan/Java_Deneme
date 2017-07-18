import java.util.Scanner;


public class secenek {
	public static void main(String[] args)
	{
		Scanner oku=new Scanner(System.in);
		 
        String yazi;
        
        System.out.print("Adýnýz: ");
		yazi=oku.nextLine();
		
		System.out.println("Merhaba " + yazi + " nasýlsýn?");
		
		String name="Zeliha";
		 if(yazi.equals(name))
		 {
			 System.out.println("Amcan nasýl?");
		 }
		 
		
	
		int a,b;
		 int secenek;
		boolean calisir=true;
		
	System.out.print("Seceneði giriniz:");
	
		
		secenek=oku.nextInt();
		/*
		a=5;
		b=7;
		
	System.out.print("A= ");
		a=oku.nextInt();
		
		System.out.print("B= ");
		b=oku.nextInt();
		
		System.out.print("a"  +" + " + 	"b" + " = " + (a + b));  */
		
		 if(secenek==0 && calisir)
		{
		System.out.println("toplama");
		
		}
		else
		
		if(secenek==1 && calisir)
		{
			System.out.println("çarpma");
		
		}	
	System.out.println("programýn sonu!");	
		
} 
}



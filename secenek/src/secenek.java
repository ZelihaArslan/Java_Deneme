import java.util.Scanner;


public class secenek {
	public static void main(String[] args)
	{
		Scanner oku=new Scanner(System.in);
		 
        String yazi;
        
        System.out.print("Ad�n�z: ");
		yazi=oku.nextLine();
		
		System.out.println("Merhaba " + yazi + " nas�ls�n?");
		
		String name="Zeliha";
		 if(yazi.equals(name))
		 {
			 System.out.println("Amcan nas�l?");
		 }
		 
		
	
		int a,b;
		 int secenek;
		boolean calisir=true;
		
	System.out.print("Secene�i giriniz:");
	
		
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
			System.out.println("�arpma");
		
		}	
	System.out.println("program�n sonu!");	
		
} 
}



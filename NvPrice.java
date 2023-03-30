import java.util.*;
class NvPrice
{
		static String s1,s2,s3,cd,ans;
		static double d,e,f,orderprice;


		public static void nvsamount()
	 	{
	 	 
	  
	 	System.out.println();
	 	s1= "regular";
	 	s2= "medium";
	 	s3= "large";
	 	if(Driver.size.equals(s1))
	 	{
	 		 d=coldDrinks();
	 		System.out.print(" Cold Drink price is : "+d);
	 		double nvsr=190+d;
	 		orderprice=+nvsr;
	 		nvatoppings();
			
	 	}
	 	else if(Driver.size.equals(s2))
	 	{
	 		 d=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+d);
	 		 double nvsm=325+d;
	 		 orderprice=+nvsm;
	 		 nvatoppings();
		}
		else if(Driver.size.equals(s3))
		{
			 d=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+d);
	 	System.out.println();
			double nvsl=425;
			cd="yes";
			if(cd.equals(ans))
			{
				orderprice=+d+nvsl;
				System.out.println(" Total Amount : "+orderprice);
			}
			else
			{
						orderprice=+nvsl;
						System.out.println(" Total Amount : "+orderprice);
			} 
		}	
	 	 	

	 		
	 }

	  public static void ctamount()
	 {
	 	
	 	s1= "regular";
	 	s2= "medium";
	 	s3= "large";
	 	if(Driver.size.equals(s1))
	 	{
	 		 e=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+e);
	 	System.out.println();
	 		double ctr=210+e;
	 		orderprice=+ctr;
	 		nvatoppings();
			
	 	}
	 	else if(Driver.size.equals(s2))
	 	{
	 		 e=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+e);
	 	System.out.println();
	 		 double ctm=370+e;
	 		 orderprice=+ctm;
	 		 nvatoppings();
		}
		else if(Driver.size.equals(s3))
		{
			 e=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+e);
	 	System.out.println();
			double ctl=500;
			cd="yes";
			if(cd.equals(ans))
			{
				orderprice=+e+ctl;
				System.out.println(" Total Amount : "+orderprice);
			}
			else
			{
				orderprice=+ctl;
				System.out.println(" Total Amount : "+orderprice);
			}			
			 
		}	
	 	 	

	 		
	 }

	  public static void pbcamount()
	 {
	 	
	 	s1= "regular";
	 	s2= "medium";
	 	s3= "large";
	 	if(Driver.size.equals(s1))
	 	{
	 		 f=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+f);
	 	System.out.println();
	 		double pbcr=220+f;
	 		orderprice=+pbcr;
	 		nvatoppings();
			
	 	}
	 	else if(Driver.size.equals(s2))
	 	{
	 		 f=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+f);
	 	System.out.println();
	 		 double pbcm=380+f;
	 		 orderprice=+pbcm;
	 		 nvatoppings();
		}
		else if(Driver.size.equals(s3))
		{
			f=coldDrinks();
	 		System.out.print(" Cold Drink price is : "+f);
	 		System.out.println();
			double pbcl=525;
			cd="yes";
			if(cd.equals(ans))
			{
				orderprice=+f+pbcl;
				System.out.println(" Total Amount : "+orderprice);
			}
			else
			{	
				orderprice=+pbcl;
				System.out.println(" Total Amount : "+orderprice);
			}	
			 
		}	
	 	 	

	 		
	 }

		 public static void nvatoppings()
		 {

	 		String toppings1=Driver.topping;
			switch(toppings1)
			{
				case "chicken tikka":		System.out.println(" Chiken Tikka price is Rs.35 ");
								   			System.out.println(" total amount : "+(orderprice+35));break;

				case "barbeque chicken":    System.out.println("  Barbeque Chicken price is Rs.45 ");
								   			System.out.println(" total amount : "+(orderprice+25));break;

				case "grilled chicken":     System.out.println(" Grilled Chicken price is Rs.40 ");
								   			System.out.println(" total amount : "+(orderprice+40));break;
 												   				   	

			}
		}


		public static double coldDrinks()
		{
			Scanner sc10 = new Scanner(System.in);
			double cd = 55 ;	
			String y="yes";
			System.out.print(" Would You like to have Cold Drink : ");
			ans=sc10.nextLine();
			if(y.equals(ans))
			{
				orderprice=orderprice+cd;
			}
			else
			{
				System.out.println(" ");
			}	
			 

			return orderprice;

		}
}
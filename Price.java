import java.util.*;
class Price
{
 	
	static double orderprice ;
		static double a,b,c ;
	      
		static String ans,cd,s1,s2,s3;
	 public static void dvamount()
	 {

	 	 a=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+a);
	 	System.out.println();
	 	s1= "regular";
	 	s2= "medium";
	 	s3= "large";
	 	if(Driver.size.equals(s1))
	 	{
	 		double dvr=150+a;
	 		orderprice=+dvr;
	 		atoppings();
			
	 	}
	 	else if(Driver.size.equals(s2))
	 	{
	 		 double dvm=200+a;
	 		 orderprice=+dvm;
	 		 atoppings();
		}
		else if(Driver.size.equals(s3))
		{
			double dvl=325;
			cd="yes";
			if(cd.equals(ans))
			{
				orderprice=+a+dvl;
				System.out.println(" Total Amount : "+orderprice);
			}
			else
			{	
				
				orderprice=+dvl;
				System.out.println(" Total Amount : " +orderprice);

			}
			 
		}	
		
	 	 	
	 }

	 public static void ccamount()
	 {
	 	 b=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+b);
	 	System.out.println();
	 	s1= "regular";
	 	s2= "medium";
	    s3= "large";
	 	if(Driver.size.equals(s1))
	 	{
	 		double ccr=175+b;
	 		orderprice=+ccr;
	 		atoppings();
			
	 	}
	 	else if(Driver.size.equals(s2))
	 	{
	 		 double ccm=375+b;
	 		 orderprice=+ccm;
	 		 atoppings();
		}
		else if(Driver.size.equals(s3))
		{
			double ccl=475;
			cd="yes";
			if(cd.equals(ans))
			{
				orderprice=+b+ccl;
				System.out.println(" Total Amount : " +orderprice);
			}
			else
			{
				orderprice=+ccl;	
				System.out.println(" Total Amount : " +orderprice);
			}
			
			 
			 
		}	
	 	 	

	 		
	 }
	 public static void ptamount()
	 {
	 	 c=coldDrinks();
	 	System.out.print(" Cold Drink price is : "+c);
	 	System.out.println();
	 	s1= "regular";
	 	s2= "medium";
	 	s3= "large";
	 	if(Driver.size.equals(s1))
	 	{
	 		double ptr=160+c;
	 		orderprice=+ptr;
	 		atoppings();
			
	 	}
	 	else if(Driver.size.equals(s2))
	 	{
	 		 double ptm=290+c;
	 		 orderprice=+ptm;
	 		 atoppings();
		}
		else if(Driver.size.equals(s3))
		{
			double ptl=340;
			cd="yes";
			if(cd.equals(ans))
			{
				orderprice=+c+ptl;
				System.out.println( " Total Amount : "+orderprice);
			}
			else
			{
				orderprice=+ptl;
				System.out.println( " Total Amount : "+orderprice);	
			}			
			 
		}	
	 	 	

	 		
	 }

	 

	 public static void atoppings()
	 {

	 		String toppings=Driver.topping;
			switch(toppings)
			{
				case "black olive":System.out.println(" Black Olive price is Rs.20 ");
								   System.out.println(" total amount : "+(orderprice+20));break;

				case "capsicum":   System.out.println(" Capsicum price is Rs.25 ");
								   System.out.println(" total amount : "+(orderprice+25));break;

				case "panner":     System.out.println(" Panner price is Rs.35 ");
								   System.out.println(" total amount : "+(orderprice+35));break;

				case "mushroom":   System.out.println(" Mushroom price is Rs.30 ");
								   System.out.println(" total amount : "+(orderprice+30));break;

				case "fresh tomato":System.out.println(" Fresh Tomato price is Rs.30 ");
								    System.out.println(" total amount : "+(orderprice+30));break;													   				   	

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
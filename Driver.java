import java.util.Scanner;
class Driver
{
	static int  echeese = 35;
	 static  String pname;
	static String size,topping,topping1,topping2,dcrust,size1,topping3;

	//Scanner sc1 = new Scanner(System.in);
	public static void welcome()
	{
		System.out.println("------------------------------");
		System.out.println(" Welcome To The Pizza Factory ");
		System.out.println("------------------------------");
	}

	public static void menu()
	{
		//Vegetarian Pizza:
 		
		
		
			System.out.println("");
			System.out.println(" The Menu   ");
			System.out.println("------------------------------");
			System.out.println(" 1  Pizzas  ");
			System.out.println(" 2  Sides   ");
	}

	public static void pizzaMenu()
	{
		System.out.println("");
		System.out.println(" Pizzas Menu ");
		System.out.println("------------------------------");
		System.out.println("");
		System.out.println(" Vegetarian Pizzas ");
		System.out.println("");
		System.out.println(" 1 : Deluxe Veggie ");
		System.out.println(" 2 : Cheese and Corn  ");
		System.out.println(" 3 : Panner Tikka ");
		System.out.println("");
//		Non-Vegetarian:



		System.out.println(" Non-Vegetarian Pizzas ");
		System.out.println(" ");
		System.out.println(" 1 : Non-Veg Supreme ");
		System.out.println(" 2 : Chicken Tikka ");
		System.out.println(" 3 : Pepper Barbeque Chicken ");
		System.out.println(" ");
		

	}
	public static void dvSize()   // dv stands for deluxe veggie 
	{
		Scanner sc1 = new Scanner(System.in);
		//	Deluxe Veggie: (Regular: Rs. 150 Medium: Rs. 200 Large: Rs. 325)
		System.out.println("");
		System.out.println(" Sizes                  Price ");
		System.out.println("------------------------------");
		System.out.println(" Regular                 150  ");
		System.out.println(" Medium                  200  ");
		System.out.println(" Large                   325  ");
	 	System.out.println("");
	 	System.out.print(" Enter the Size : ");
	    size = sc1.nextLine();
		System.out.println(" ");
	    dcrust=crust();					// dcurst stands for display crust
		vt();	
		displayorder();
						
		 

	}

	

	public static void ccSize()   // cc stands for cheese and corn 
	{
		Scanner sc2 = new Scanner(System.in);
		//	Cheese and corn: (Regular: Rs. 175 Medium: Rs. 375 Large: Rs. 475)
		System.out.println("");
		System.out.println(" Sizes                  Price ");
		System.out.println("------------------------------");
		System.out.println(" Regular                 175  ");
		System.out.println(" Medium                  375  ");
		System.out.println(" Large                   475  ");
		System.out.print(" Enter the Size : ");
	    size = sc2.nextLine();
		System.out.println(" ");
	    dcrust=crust();					// dcurst stands for display crust
		vt();	
		displayorder();

	}

	public static void ptSize()   // pt stands for Paneer tikka 
	{
		Scanner sc3 = new Scanner(System.in);
		 //	Paneer Tikka: (Regular: Rs. 160 Medium: Rs. 290 Large: Rs. 340)
		System.out.println("");
		System.out.println(" Sizes                  Price ");
		System.out.println("------------------------------");
		System.out.println(" Regular                 160  ");
		System.out.println(" Medium                  290  ");
		System.out.println(" Large                   340  ");
		System.out.print(" Enter the Size : ");
	    size = sc3.nextLine();
		System.out.println(" ");
	    dcrust=crust();					// dcurst stands for display crust
		vt();	
		displayorder();

	}

	public static void nvsSize()   // nvs stands for nin veg supreme 
	{
		Scanner sc4 = new Scanner(System.in);
		// Non-Veg Supreme: (Regular: Rs 190 Medium: Rs 325 Large: Rs 425)
		System.out.println("");
		System.out.println(" Sizes                  Price ");
		System.out.println("------------------------------");
		System.out.println(" Regular                 190  ");
		System.out.println(" Medium                  325  ");
		System.out.println(" Large                   425  ");
		System.out.println();
		System.out.print(" Enter The Size : ");
		size = sc4.nextLine();
		System.out.println(" ");
	    dcrust=crust();					// dcurst stands for display crust
		nvt();	
		displayorder();  
			

	}
	public static void ctSize()   // ct stands for chiken tikka 
	{
		Scanner sc5 = new Scanner(System.in);
		// Chicken Tikka: (Regular: Rs 210 Medium: Rs 370 Large: Rs 500)
		System.out.println("");
		System.out.println(" Sizes                  Price ");
		System.out.println("------------------------------");
		System.out.println(" Regular                 210  ");
		System.out.println(" Medium                  370  ");
		System.out.println(" Large                   500  ");
		System.out.println();
		System.out.print(" Enter The Size : ");
		size = sc5.nextLine();
		System.out.println(" ");
	    dcrust=crust();					// dcurst stands for display crust
		nvt();	
		displayorder(); 
	}
	public static void pbcSize()   // pbc stands for Pepper barbecue chiken
	{
		Scanner sc6 = new Scanner(System.in);
		// Pepper Barbecue Chicken (Regular: Rs 220 Medium: Rs 380 Large: Rs 525
		
		System.out.println("");
		System.out.println(" Sizes                  Price ");
		System.out.println("------------------------------");
		System.out.println(" Regular                 220  ");
		System.out.println(" Medium                  380  ");
		System.out.println(" Large                   525  ");
		System.out.println();
		System.out.print(" Enter The Size : ");
		size = sc6.nextLine();
		System.out.println();
	    dcrust=crust();					// dcurst stands for display crust
		nvt();	
		displayorder(); 
	}

	public  static String crust()
	{	
		Scanner sc7 = new Scanner(System.in);
		System.out.println(" Type Of Crust");
		System.out.println("------------------------------");
		System.out.println(" 1 : New hand tossed ");
		System.out.println(" 2 : Wheat thin crust ");
		System.out.println(" 3 : Cheese Burst ");
		System.out.println(" 4 : Fresh pan pizza ");
		System.out.println(" ");

		System.out.print(" Select only 1 crust : ");
		String cname = sc7.nextLine();
		return cname;
	}

	public static void vt()				// vt stands for veg topping
	{
		 
		System.out.println("");
		System.out.println(" Veg Toppings           Price ");
		System.out.println("------------------------------");
		System.out.println(" Black Olive               20 ");
		System.out.println(" Capsicum                  25 ");
		System.out.println(" Panner                    35 ");
		System.out.println(" Mushroom                  30 ");
		System.out.println(" Fresh Tomato              10 ");
		System.out.println(" ");
		
		 size1="large";
		 Scanner sc8 =new Scanner(System.in);
		if(size.equals(size1))
		{
			System.out.println(" Select Two Toppings   ");
			System.out.print(" Topping 1 : ");
			 topping1 = sc8.nextLine();
			System.out.print(" Topping 2 : ");
			 topping2 = sc8.nextLine();
		}
		else
		{
			System.out.print(" Select Only one topping : ");
		    topping=sc8.nextLine();
			
		}
	}


	public static void nvt()				// nvt stands for non-veg topping
	{
 			
 		Scanner sc9 = new Scanner(System.in);	
		System.out.println("");
		System.out.println(" Non-Veg Toppings           Price ");
		System.out.println("----------------------------------");
		System.out.println(" Chicken Tikka                 35 ");
		System.out.println(" Barbeque Chicken              45 ");
		System.out.println(" Grilled  Chicken              40 ");
		System.out.println(" ");
		 size1="large";
		if(size.equals(size1))
		{
			System.out.println(" Select Two Toppings   ");
			System.out.print(" Topping 1 : ");
			 topping1 = sc9.nextLine();
			System.out.print(" Topping 2 : ");
			 topping2 = sc9.nextLine();
		}
		else
		{
			System.out.print(" Select Only one topping : ");
		    topping=sc9.nextLine();
		}

	}
	
	public static void displayorder()
	{

		System.out.println(" Confirm Your Order ");
		System.out.println();
		System.out.println(" Your Pizza is : "+pname);
		System.out.println(" Size is "+size);
		System.out.println(" Crust is "+dcrust);
	    if(size.equals(Driver.size1))
		{
			System.out.println(" Topping is "+topping1+" & "+topping2);
	    }
		else
		{
			System.out.println(" Topping is "+topping);
		}		
    }



	public static void main(String[] args)
	{
		
		 	
		welcome();
		menu();
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{ 
		System.out.print(" Enter the Category that you would like to order  : ");
		String option1 = sc.nextLine();
		
			
		switch(option1)
		{
			case "pizzas" : pizzaMenu();
							System.out.print(" Select the Pizza that you want : ");
							pname = sc.nextLine();
							switch(pname)
							{
								case "deluxe veggie":dvSize();
													 Price.dvamount();
													// Price.coldDrinks();	
													 break;
								case "cheese and corn":ccSize();
													   Price.ccamount();
													  // Price.coldDrinks();	
													   break;
								case "panner tikka":ptSize();
													Price.ptamount();
												//	Price.coldDrinks();
													break;
								case "nonveg supreme":nvsSize();
													  NvPrice.nvsamount();
												//	  Price.coldDrinks();	
													  break;
								case "chicken tikka":ctSize();
													NvPrice.ctamount();
												//	Price.coldDrinks();
													break;
								case "pepper barbeque chicken":pbcSize();
  															  NvPrice.pbcamount();
  												//			  Price.coldDrinks();		
															  break;
								case " back":System.exit(0);							  	
							}
							break;

			case "sides" :
		}

		//System.out.println(" There are 2 types of pizza available here ");
		//System.out.println(" 1 : Vegetarian Pizzas ");
		//System.out.println(" 2 : Non-Vegetarian Pizzas ");
		//System.out.println("Enter the Category you would like to order: ");
        //int pizzas = sc.nextInt();

		}
	}
}
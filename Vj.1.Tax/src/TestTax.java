import java.util.Arrays;

public class TestTax {

	public static void main(String[] args) {
		
		/*if(args.length!=3) {
			
			System.out.println("Sample usage of the program:"+" java TestTax 50000 NJ 2");
			
			System.exit(0);
		}
		
		double grossIncome=Double.parseDouble(args[0]);
		String state=args[1];
		int dependents=Integer.parseInt(args[2]);
		*/
		
		Tax tab[]= new Tax[5];
		
		//Tax t= new Tax(50000,"NY",3);
		
		tab[0]=new Tax(1000,"NY",2);
		tab[1]=new Tax(5000,"NY",1);
		tab[2]=new Tax(7000,"NJ",5);
		tab[3]=new Tax(5000,"NB",0);
		tab[4]=new Tax(5000,"CA",3);
		
		
		//double yourTax = t.calcTax();
		for(Tax n:tab) {
			
			
			if(n instanceof NJTax) {
			double yourTax=n.calcTax();
			System.out.println("Income: "+n.getGrossIncom());
			System.out.println("State: "+n.getState());
			System.out.println("Dependants: "+n.getDependents());
			System.out.println("Your tax is "+yourTax);
			Tax.convertToEuros(yourTax);
			continue;
			}
			System.out.println(">>>>>Nema NJ tax obracuna<<<<<");
		}
		
		//System.out.println("Your tax is "+yourTax);
		
		//Tax.convertToEuros(yourTax);
		
	/*	Tax t2= new Tax(65000,"TX",4);
		
		double hisTax = t2.calcTax();
		
		System.out.println("His tax is "+hisTax);
		
		Tax.convertToEuros(hisTax);*/
		

	}

}

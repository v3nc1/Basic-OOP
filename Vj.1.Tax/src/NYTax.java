
public class NYTax extends Tax {

	public NYTax(double grossIncom, String state, int dependents) {
		super(grossIncom, state, dependents);
		// TODO Auto-generated constructor stub
	}

	public NYTax(double grossIncom, int dependents) {
		super(grossIncom, dependents);
		// TODO Auto-generated constructor stub
	}
	
	double adjustForStudents (double stateTax) {
		
		double adjustedTax = stateTax - 500;
		
		return adjustedTax;
	}
	
public double calcTax() {
			
			double cTax;
			
			
			if (grossIncom<30000) {
				
				cTax = grossIncom *0.05;
			}
			else {
				cTax = grossIncom * 0.06;
			}
			
			
			return cTax-500;
		}

}

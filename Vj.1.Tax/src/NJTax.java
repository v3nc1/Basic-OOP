
public class NJTax extends Tax {
	
	

	public NJTax(double grossIncom, String state, int dependents) {
		super(grossIncom, state, dependents);
		
	}
	
	double adjustForStudents (double stateTax) {
			
			double adjustedTax = stateTax - 500;
			
			return adjustedTax;
		}
		
	public double calcTax() {
				
				double cTax;
				
				
				if (this.grossIncom<30000) {
					
					cTax = grossIncom *0.05;
				}
				else {
					cTax = grossIncom * 0.06;
				}
				
				
				return cTax-500;
			}
	
}

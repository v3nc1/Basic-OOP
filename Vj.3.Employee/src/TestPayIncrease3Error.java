import com.practicaljava.lesson6.*;


public class TestPayIncrease3Error {

	

	public static void main(String[] args) {
		
		Payable workers[]=new Payable[3]; 

		workers[0] = new Employee("Marko");
		workers[1] = new Contractor("Ive");
		workers[2] = new ForeignContractor("Mujo");
		
		for(Payable p:workers) {

			((Payable)p).increasePay(30);
			//p.promote(25);
		}
		
		
	}

}

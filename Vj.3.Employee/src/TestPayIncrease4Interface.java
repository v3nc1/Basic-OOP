import com.practicaljava.lesson7.tryit.*;


public class TestPayIncrease4Interface {

	public static void main(String[] args) {
		
		
		Payable workers[]=new Payable[3]; 

		workers[0] = new Employee("Marko");
		workers[1] = new Contractor("Ive");
		workers[2] = new Employee("Mujo");
		
		for(Payable p:workers) {

			((Payable)p).increasePay(30);
			//p.promote(25);
		}

	}

}

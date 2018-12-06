/*import com.practicaljava.lesson7.Contractor;
import com.practicaljava.lesson7.Employee;
import com.practicaljava.lesson7.Person;*/
import com.practicaljava.lesson6.*;

public class TestPayIncrease2 {

	public static void main(String[] args) {


		//Person workers[]=new Person[5];
		Payable workers[]=new Payable[5]; 

		workers[0] = new Employee("Marko");
		workers[1] = new Contractor("Ive");
		workers[2] = new Employee("Miro");
		workers[3] = new Contractor("Mujo");
		workers[4] = new Employee("Jakov");

		for(Payable p:workers) {
			
			p.increasePay(30);
			//p.promote(25);
		}

	}

}

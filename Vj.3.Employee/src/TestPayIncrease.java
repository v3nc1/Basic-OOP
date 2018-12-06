import com.practicaljava.lesson6.Contractor;
import com.practicaljava.lesson6.Employee;
import com.practicaljava.lesson6.Person;

public class TestPayIncrease {

	public static void main(String[] args) {

		Person workers[]=new Person[5];
	
		
		workers[0] = new Employee("Marko");
		workers[1] = new Contractor("Ive");
		workers[2] = new Employee("Miro");
		workers[3] = new Contractor("Mujo");
		workers[4] = new Employee("Jakov");
		
		Employee currentEmployee;
		Contractor currentContractor;
		
		for(Person p:workers) {
			
			if(p instanceof Employee) {
				currentEmployee = (Employee) p;
				currentEmployee.increasePay(30);
			}else if(p instanceof Contractor) {
				
				currentContractor = (Contractor) p;
				currentContractor.increasePay(30);
			}
		}
		
		

	}

}

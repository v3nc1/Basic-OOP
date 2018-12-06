import java.util.Arrays;

public class Cure {

	public static void main(String[] args) {

		String[][] friends = new String[10][2];
		int i=1;
		friends[0][0]="Masha";
		friends[1][0]="Rosa";
		friends[2][0]="Merry";
		friends[3][0]="Tina";
		friends[4][0]="Lisa";
		friends[5][0]="Nevenka";
		friends[6][0]="Mija";
		friends[7][0]="Maja";
		friends[8][0]="Irina";
		friends[9][0]="Kolinda";
		
		System.out.println("Niz ima "+friends.length+" imena.");
		
		System.out.println("The third girl name is "+friends[2][0]);
		System.out.println("The last girl name is "+friends[9][0]);
		
		System.out.println("____________FOR PETLJA:");
		for(String[] n:friends) {
			
			if(n[0]=="Irina") {
				//break;
				//System.out.println("Sad ide Irina");
				continue;
			}
			//System.out.println(Arrays.toString(n));
			System.out.println(i+" "+n[0]+" "+n[1]);
			i++;
			
		}
		System.out.println("______________WHILE PETLJA:");
		
		i=0;
		boolean var=false;
		
		while(var==false) {
			if (!(friends[i][0]=="Irina")) {
				
				i++;
				System.out.println(i+" Trazim Irinu");
				//break;
				continue;
			}
			System.out.println(i+1+" "+friends[i][0]);
			var=true;
			i++;
		}
		
	
		
		

	}

}

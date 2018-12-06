import javax.swing.JTextArea;

public class Print {
	
	int br;
	public void doPrint(String[] str,JTextArea txtF) {
		
		
		
		txtF.append("MAKSIMALNA NARUÐBA- 5 kom ------------"+"\n");
		
		for(String s:str) {
			br++;
			txtF.append(br+". "+s+"\n");
		}
		
		
	
	}
}

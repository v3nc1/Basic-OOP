import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class OrderEx {
	
	String[] orderList=new String[5];
	int br=0;
	Print pr=new Print();
	
	public OrderEx() {
		
		
	}
	
	public void addItem(String str,JTextArea txtF) throws Exception {
		
		
		try {
			
		
		orderList[br]=str;
		
		br++;
		}catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Nema više mijesta", "Error",JOptionPane.ERROR_MESSAGE);
			pr.doPrint(orderList,txtF);
			throw e;
		}
		
	}

}

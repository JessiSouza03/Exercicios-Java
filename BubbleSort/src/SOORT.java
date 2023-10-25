package aula;
import javax.swing.JOptionPane;

public class SOORT {

	public static void main(String[] args) {
		int num [] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i) + "º número: "));
		}
		
		////  Bubble Sort - O(n^2)
        int aux;
        for (int i=0; i < num.length; ++i){
            for (int j=i; j < num.length; ++j){
                if (num[i]>num[j]){
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
		
		String msg = "";
		for (int i = 0; i < 10; i++) {
			 msg = msg + (i+1) + " - " + num[i] + "\n";
			 
		}
		JOptionPane.showMessageDialog(null, msg);
	}
	
	

}
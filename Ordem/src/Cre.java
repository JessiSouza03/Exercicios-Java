import javax.swing.JOptionPane;
public class Cre {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número"));
		int menor = 0;
		int maior = 0;
		int meio1 = 0;
		int meio2 = 0;
		
		if (n1 <= n2 && n1 <= n3 && n1 <= n4) {
			 menor = n1;
			 if (n2 <= n3 && n2<= n4) {
				 meio1 = n2;
			 }else if (n3 <= n2 && n3<= n4) {
				meio2 = n3;
			  }else {
					maior = n4;
					
		if (n2 <= n1 && n2 <= n3 && n2 <= n4) {
			menor = n2;
			if (n1 <= n3 && n1<= n4) {
				meio1 = n1;
		    }else if (n3 <= n && n3<= n4) {
				meio2 = n3;
			}else {
				  maior = n4;
				 
				
				
				
				
			 }
		}else if (n2 <= n1 && n2 <= n3 && n2 <= n4) {
			menor = n2;
		}else if (n3 <= n1 && n3 <= n2 && n3 <= n4) {
			menor = n3;
		}else {
			menor = n4;
		}		
		
		else if (n4 <= n1 && n4 <= n2 && n4 <= n4) {
			menor = n3;
		} {
			maior = n4;
		}
		
		
		else if (n1 < n2) {
			meio1 = n2;
			meio2 = n1;
		} {
			meio1 = n1;
			meio2 = n2;
		}
		
		 if (n3 < n4) {
			meio1 = n4;
			meio2 = n3;
		}else {
			meio1 = n3;
			meio2 = n4;
		}
			
		
		JOptionPane.showMessageDialog(null, menor + "-" + meio1 + "-" + meio2 + "-" + maior);
}}

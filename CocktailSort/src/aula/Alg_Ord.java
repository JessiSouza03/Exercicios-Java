package aula;
import javax.swing.JOptionPane;

public class Alg_Ord {

	public static void main(String[] args) {
		int vetor [] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i) + "º número: "));
		}
		
		////  Cocktail Sort - O(n^2)
		    int tamanho, inicio, fim, swap, aux;
		    tamanho = 10;
		    inicio = 0;
		    fim = tamanho - 1;
		    swap = 0;
		    while (swap == 0 && inicio < fim)
		    {
		        swap = 1;
		        for (int i = inicio; i < fim; i = i + 1)
		        {
		            if (vetor[i] > vetor[i + 1])
		            {
		                aux = vetor[i];
		                vetor[i] = vetor[i + 1];
		                vetor[i + 1] = aux;
		                swap = 0;
		            }
		        }
		        fim = fim - 1;
		        for (int i = fim; i > inicio; i = i - 1)
		        {
		            if (vetor[i] < vetor[i - 1])
		            {
		                aux = vetor[i];
		                vetor[i] = vetor[i - 1];
		                vetor[i - 1] = aux;
		                swap = 0;
		            }
		        }
		        inicio = inicio + 1;
		    }
		
		
		String msg = "";
		for (int i = 0; i < 10; i++) {
			 msg = msg + (i+1) + " - " + vetor[i] + "\n";
			 
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}
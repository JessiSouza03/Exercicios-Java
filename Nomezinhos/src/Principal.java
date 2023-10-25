import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		String nome[] = new String[10];
		int pos = 0;
		boolean achou = false;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n" +
											"1 - Cadastrar\n" +
											"2 - Exibir Todos\n" +
											"3 - Pesquisar\n" +
											"4 - Alterar\n" +
											"5 - Excluir\n" +
											"0 - Sair"));
			switch (op) {
				case 1:
					if (pos < 10) {
						nome[pos] = JOptionPane.showInputDialog(null, "Digite o nome:");
						pos = pos + 1;
					}else {
						JOptionPane.showMessageDialog(null, "Vetor lotado!");
					}
					break;
					
				case 2:
					String msg = "";
					for(int i = 0; i < pos; i++) {
						msg += (i+1) + " - " + nome[i] + "\n";
					}
					if (msg.equals("")) {
						JOptionPane.showMessageDialog(null, "Vetor vazio!");
					}else {
						JOptionPane.showMessageDialog(null, msg);
					}
					break;
					
				case 3:
					achou = false;
					String pesq = JOptionPane.showInputDialog(null, "Digite o nome:");
					for(int i = 0; i < pos; i++){
						if(nome[i].equals(pesq)){
							JOptionPane.showMessageDialog(null, pesq + " est� na posi��o " + (i + 1));
							achou = true;
							break;
						}
					}
					if (!achou) {
							JOptionPane.showMessageDialog(null, "Nome n�o encontrado!");
					}
					
					break;
					
				case 4:
					achou = false;
					String alt = JOptionPane.showInputDialog(null, "Digite o nome para alterar:");
					for(int i = 0; i < pos; i++){
						if(nome[i].equals(alt)){
							nome[i] = JOptionPane.showInputDialog("Insira o novo nome");
							achou = true;
							break;
						}
					}
					if (!achou) {
							JOptionPane.showMessageDialog(null, "Nome n�o encontrado!");
					}
					
					break;
				
				case 5:
					achou = false;
					String del = JOptionPane.showInputDialog(null, "Digite o nome que quer excluir:");
					for(int p = 0; p < pos; p++){
						if(nome[p].equals(del)){
							for(int i = p; i < (pos - 1); i++) {
								nome[i] = nome[i + 1];
							}
							achou = true;
							break;
						}
					}
					if (!achou) {
							JOptionPane.showMessageDialog(null, "Nome n�o encontrado!");
					}
					pos = pos - 1;
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigado!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Op��o Inv�lida!");
					break;
			}
		}while(op != 0);
	}

}
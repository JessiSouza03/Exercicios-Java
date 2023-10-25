import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int op = 0;
		Clientes cli[] = new Clientes[10];
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
						cli[pos] = new Clientes();
						cli[pos].lerDados();
						pos = pos + 1;
					}else {
						JOptionPane.showMessageDialog(null, "Vetor lotado!");
					}
					break;
					
				case 2:
					for(int i = 0; i < pos; i++) {
						cli[i].exibirDados();
					}
					/*
					if (cli[pos].equals("")) {
						JOptionPane.showMessageDialog(null, "Vetor vazio!");
					}else {
						JOptionPane.showMessageDialog(null, cli[pos]);
					}*/
					break;
				case 3:
					achou = false;
					String pesq = JOptionPane.showInputDialog(null, "Digite o nome:");
					for(int i = 0; i < pos; i++){
						if(cli[i].getNome().equals(pesq)){
							JOptionPane.showMessageDialog(null, pesq + " está na posição " + (i + 1));
							achou = true;
							break;
						}
					}
					if (!achou) {
							JOptionPane.showMessageDialog(null, "Nome não encontrado!");
					}
					
					break;
					
				case 4:
					achou = false;
					String alt = JOptionPane.showInputDialog(null, "Digite o nome para alterar:");
					for(int i = 0; i < pos; i++){
						if(cli[i].getNome().equals(alt)){
							cli[i].lerDados();
							achou = true;
							break;
						}
					}
					if (!achou) {
							JOptionPane.showMessageDialog(null, "Nome não encontrado!");
					}
					
					break;
				
				case 5:
					achou = false;
					String del = JOptionPane.showInputDialog(null, "Digite o nome que quer excluir:");
					for(int p = 0; p < pos; p++){
						if(cli[p].getNome().equals(del)){
							for(int i = p; i < (pos - 1); i++) {
								cli[i] = cli[i + 1];
							}
							achou = true;
							break;
						}
					}
					if (!achou) {
							JOptionPane.showMessageDialog(null, "Nome não encontrado!");
					}
					pos = pos - 1;
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigado!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida!");
					break;
			}
		}while(op != 0);
	}

}
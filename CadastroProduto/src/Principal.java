import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		produto p[] = new produto[10];
		int op = 0;
		int pos = 0;
		boolean achou = false;
		
		/*p.lerDados();
		p.exibirDados();
        p.Comprar();*/
        
        do {
        	op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n" +
											"1 - Cadastrar Produto\n" +
											"2 - Exibir Dados do Produto\n" +
											"3 - Pesquisar\n" +
											"4 - Alterar\n" +
											"5 - Excluir\n" +
											"6 - Comprar\n" +
											"7 - Vender\n" +
											"0 - Sair"));
		
        	switch (op) {
			case 1:
				if (pos < 10) {
					p[pos] = new produto();
					p[pos].lerDados();
					pos = pos + 1;
				}else {
					JOptionPane.showMessageDialog(null, "Vetor lotado!");
				}
				break;
				
			case 2:
				for(int i = 0; i < pos; i++) {
					p[i].exibirDados();
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
					if(p[i].getNome().equals(pesq)){
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
					if(p[i].getNome().equals(alt)){
						p[i].lerDados();
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
				for(int i = 0; i < pos; i++){
					if(p[i].getNome().equals(del)){
						for(int j = i; i < (pos - 1); i++) {
							p[j] = p[j + 1];
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
				
			case 6:
				achou = false;
				String comprar = JOptionPane.showInputDialog(null, "Digite o nome do produto que quer comprar:");
				for(int i = 0; i < pos; i++){
					if(p[i].getNome().equals(comprar)){
						p[i].Comprar();
						achou = true;
						break;
					}
				}
				if (!achou) {
						JOptionPane.showMessageDialog(null, "Nome não encontrado!");
				}
				
				break;
				
			case 7:
				achou = false;
				String vender = JOptionPane.showInputDialog(null, "Digite o nome do produto que quer vender:");
				for(int i = 0; i < pos; i++){
					if(p[i].getNome().equals(vender)){
						p[i].Vender();
						achou = true;
						break;
					}
				}
				if (!achou) {
						JOptionPane.showMessageDialog(null, "Nome não encontrado!");
				}
				
				
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
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		//Produtos prod[] = new Produtos[10];
		ArrayList<Produto_array> prod = new ArrayList<Produto_array>();
		String pesq = "";
		
		boolean achou = false;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n" +
											"1 - Cadastrar\n" +
											"2 - Exibir Todos\n" +
											"3 - Pesquisar\n" +
											"4 - Alterar\n" +
											"5 - Excluir\n" +
											"6 - Comprar\n" +
											"7 - Vender\n" +
											"0 - Sair"));
			switch (op) {
				case 1:
					/*if (pos < 10) {
						prod[pos] = new Produtos();
						prod[pos].lerDados();
						pos = pos + 1;
					}else {
						JOptionPane.showMessageDialog(null, "Vetor lotado!");
					}*/
					Produto_array p = new Produto_array();
					p.lerDados();
					prod.add(p);
					
					break;
					
					
					
				case 2:
					String msg = "";
					/*for(int i = 0; i < prod.size(); i++) {
						Produtos x = prod.get(i);
						msg += x.getNome() + " - " + x.getQuantidade()
									 + " - " + x.getPreco() + "\n";
					}*/
					int cont = 1;
					for(Produto_array x : prod) {
						msg += cont + " - " + x.getNome() + " - " + x.getQuantidade()
									+ " - " + x.getPreco() + "\n";
						cont++;
					}
					if (msg.equals("")) {
						JOptionPane.showMessageDialog(null, "Vetor vazio!");
					}else {
						JOptionPane.showMessageDialog(null, msg);
					}
					break;
					
					
					
				case 3:
					achou = false;
					pesq = JOptionPane.showInputDialog(null, "Digite o nome:");
					for(int i = 0; i < prod.size(); i++) {
						Produto_array x = prod.get(i);
						if(x.getNome().equals(pesq)){
							JOptionPane.showMessageDialog(null, pesq + " está na posição " + (i + 1));
							achou = true;
							break;
						}
					}
					if (achou == false) {
							JOptionPane.showMessageDialog(null, "Nome não encontrado!");
					}
					
					break;
					
				case 4:
					achou = false;
					pesq = JOptionPane.showInputDialog(null, "Digite o nome:");
					for(Produto_array x : prod) {
						if(x.getNome().equals(pesq)){
							x.lerDados();
							achou = true;
							break;
						}
					}
					if (achou == false) {
							JOptionPane.showMessageDialog(null, "Nome não encontrado!");
					}
					
					break;
				
				case 5:
					achou = false;
					String del = JOptionPane.showInputDialog(null, "Digite o nome que quer excluir:");
					/*for(int i = 0; i < prod.size(); i++) {
						Produto_array x = prod.get(i);
						if(x.getNome().equals(pesq)){
							prod.remove(i);
							achou = true;
							break;
						}
					}*/
					for(Produto_array x : prod) {
						if(x.getNome().equals(pesq)){
							prod.remove(x);
							achou = true;
							break;
						}
					}
					if (!achou) {
							JOptionPane.showMessageDialog(null, "Nome não encontrado!");
					}
					
					break;
					
				case 6:
					achou = false;
					pesq = JOptionPane.showInputDialog(null, "Digite o nome:");
					for(Produto_array x : prod) {
						if(x.getNome().equals(pesq)){
							x.comprar();
							achou = true;
							break;
						}
					}
					if (achou == false) {
							JOptionPane.showMessageDialog(null, "Nome não encontrado!");
					}
									
					break;
					
				case 7:
					achou = false;
					pesq = JOptionPane.showInputDialog(null, "Digite o nome:");
					for(Produto_array x : prod) {
						if(x.getNome().equals(pesq)){
							x.vender();
							achou = true;
							break;
						}
					}
					if (achou == false) {
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
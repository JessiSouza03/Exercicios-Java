import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		ArrayList<Conta> cli = new ArrayList<Conta>();
		int pos = 0;
		String pesq;
		boolean achou = false;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n" +
											"1 - Cadastrar\n" +
											"2 - Exibir Todos\n" +
											"3 - Pesquisar\n" +
											"4 - Alterar\n" +
											"5 - Excluir\n" +
											"6 - Sacar\n" +
											"7 - Depositar\n" +
											"8 - Pagar Juros\n" +
											"0 - Sair"));
			
			switch (op) {
				case 1:
						Conta c = new Conta();
						c.lerDados();
						cli.add(c);
					pos += 1;
					break;
					
					
				case 2:
					String msg = "";
					int cont = 1;
					for(Conta x : cli) {
						msg += cont + " - " + x.getNome() + " - " + x.getNumConta()
									+ " - " + x.getSaldo() + "\n";
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
					pesq = JOptionPane.showInputDialog(null, "Digite o cliente para pesquisar:");
						for(int i = 0; i < cli.size(); i++) {
							Conta x = cli.get(i);
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
					pesq = JOptionPane.showInputDialog(null, "Digite o nome para alterar:");
					for(Conta x : cli) {
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
					String apagar = JOptionPane.showInputDialog(null, "Digite o nome cliente que quer deletar:");
							for(Conta x : cli) {
								if(x.getNome().equals(apagar)){
								cli.remove(x);
							}
							achou = true;
							JOptionPane.showMessageDialog(null, "Cliente apagado!");
							break;
						}
					
					if (achou == false) {
							JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
					}
					pos = pos - 1;
					break;
			
					
				case 6:
					achou = false;
					String numConta = JOptionPane.showInputDialog(null, "Digite o valor para sacar");
					for(int p = 0; p < pos; p++){
						if((cli.get(p).getNumConta()).equals(numConta)){
							cli.get(p).sacar();
							achou = true;
							break;
						}
					}
					if (achou == false) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!");
					}
					break;
					
					
				case 7:
					achou = false;
					String nmConta = JOptionPane.showInputDialog(null, "Digite o número da conta");
					for(int p = 0; p < pos; p++){
						if((cli.get(p).getNumConta()).equals(nmConta)){
							cli.get(p).depositar();
							achou = true;
							break;
						}
					}
					if (achou == false) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!");
					}
					break;
					
				
				case 8:
					achou = false;
					String nmrConta = JOptionPane.showInputDialog(null, "Digite o número da conta");
					for(int p = 0; p < pos; p++){
						if((cli.get(p).getNumConta()).equals(nmrConta)){
							cli.get(p).juros();
							achou = true;
							break;
						}
					}
					if (achou == false) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!");
					}
					break;
					
					
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigada!");
					break; 
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválide!");
					break;
			}
		}while(op != 0);
	}

}
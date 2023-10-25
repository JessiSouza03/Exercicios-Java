import javax.swing.JOptionPane;

public class Conta {
	private String nome;
	private String numConta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void lerDados() {
		this.nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
		this.numConta = JOptionPane.showInputDialog("Digite o número da conta:");
		JOptionPane.showMessageDialog(null, "Saldo: " + this.saldo + "R$");
	}
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + 
											"\nNúmero da Continha: " + this.getNumConta() + 
											"\nSaldinho: " + this.getSaldo());		
	}
	
	public void sacar() {
		double qtd = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia a ser sacada: "));
		this.saldo = saldo - qtd;
		JOptionPane.showMessageDialog(null, "Transação concluída");
	}
	
	public void depositar() {
		double qtd = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia a ser depositada: "));
		this.saldo = saldo + qtd;
		JOptionPane.showMessageDialog(null, "Transação concluída");
	}
	
	public void juros() {
		double qtd = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos juros em %: "));
			this.saldo = saldo + ((saldo * qtd)/100);
			JOptionPane.showMessageDialog(null, "Juros adicionado");		
	}
	
	
	
}

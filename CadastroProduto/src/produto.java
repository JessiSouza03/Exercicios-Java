import javax.swing.JOptionPane;

public class produto {
	private String nome;
	private int quantidade;
	private double preco;
	private int quantc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public produto() {
		this("", 0, 0);
	}
	
	public produto(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public void lerDados() {
		this.nome = JOptionPane.showInputDialog("Digite o nome do produto:");
		this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade no estoque:"));
		this.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Produto: " + this.getNome() + "\nQuantidade: " +
						this.getQuantidade() + "\nPreço: " + this.getPreco());		
	}
	
	public void Comprar() {
		this.quantc = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que quer comprar:"));
		
		double valor = quantc*preco;
		JOptionPane.showMessageDialog(null,"O valor da compra é: R$" + valor);		
		
	    quantidade = quantidade + quantc;
	    
	}
	public void Vender() {
		this.quantc = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que quer vender:"));
		
		double valor = quantc*preco;
		JOptionPane.showMessageDialog(null,"O valor da venda é: R$" + valor);		
		
	    quantidade = quantidade - quantc; 
	    
	}
}

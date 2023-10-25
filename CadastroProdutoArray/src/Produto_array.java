import javax.swing.JOptionPane;

public class Produto_array {
	private String nome;
	private int quantidade;
	private double preco;
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
	
	public Produto_array () {
		this("", 0, 0);
	}
	public Produto_array(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public void lerDados() {
		this.nome = JOptionPane.showInputDialog("Digite o nome:");
		this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
		this.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco:"));
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\nPreço: " + this.getPreco() + 
												"\nQuantidade: " + this.getQuantidade());	
	}
	
	public void comprar() {
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser comprada:"));
		JOptionPane.showMessageDialog(null, "Total:" + (qtde * this.getPreco()));
		this.setQuantidade(this.getQuantidade() + qtde);		
	}
	
	public void vender() {
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser vendida:"));
		JOptionPane.showMessageDialog(null, "Total:" + (qtde * this.getPreco()));
		this.setQuantidade(this.getQuantidade() - qtde);		
	}
}

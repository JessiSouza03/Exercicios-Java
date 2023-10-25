import javax.swing.JOptionPane;

public class Clientes {
	private String nome;
	private String endereco;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Clientes() {
		this("", "", "");
	}
	
	public Clientes(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public void lerDados() {
		this.nome = JOptionPane.showInputDialog("Digite o nome:");
		this.endereco = JOptionPane.showInputDialog("Digite o endereco:");
		this.telefone = JOptionPane.showInputDialog("Digite o telefone:");
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\nEndereço: " +
						this.getEndereco() + "\nTelefone: " + this.getTelefone());		
	}
}

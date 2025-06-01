/* 
 Crie uma classe chamada Vestuario, que é um tipo de loja, representando 
uma loja de vestuário. As lojas de vestuários possuem como atributo (além de 
tudo que uma Loja tem) um valor booleano chamado 
produtosImportados. Este atributo indica se a loja de vestuário vende 
roupas importadas ou não. Crie um construtor para a classe, que receba 
informações para inicializar todos os atributos. Além disso, crie os métodos de 
acesso dos atributos (os métodos que ainda não existem) e sobrescreva o 
método toString, incluindo a informação específica da classe
 */

public class Vestuario extends Loja {
    
    private boolean produtosImportados;
    
    // Construtor com todos os parâmetros da Loja
    public Vestuario(String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, boolean produtosImportados, int estoqueProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
		this.produtosImportados = produtosImportados;
	}
    
    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    
    @Override
    public String toString() {
        return "Vestuario{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", dataFundacao=" + getDataFundacao() +
                ", produtosImportados=" + produtosImportados +
                '}';
    }
}
/* 
Crie uma classe chamada Bijuteria, que é um tipo de loja, representando 
uma loja de bijuteria. As lojas de bijuteria possuem como atributo (além de tudo 
que uma Loja tem) um double chamado metaVendas, que representa a 
meta de vendas mensais desta loja. Crie um construtor para a classe, que receba 
informações para inicializar todos os atributos. Além disso, crie os métodos de 
acesso dos atributos (os métodos que ainda não existem) e sobrescreva o 
método toString, incluindo a informação específica da classe.
 */

public class Bijuteria extends Loja {
    
    private double metaVendas;
    
    // Construtor com todos os parâmetros da Loja
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                     Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }
    
    // Construtor sem salário base (usa o segundo construtor da Loja)
    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, 
                     Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas() {
        return metaVendas;
    }
    
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
    @Override
    public String toString() {
        return "Bijuteria{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", dataFundacao=" + getDataFundacao() +
                ", metaVendas=" + metaVendas +
                '}';
    }
}
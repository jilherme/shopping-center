/* Crie uma classe chamada Cosmetico, que é um tipo de loja, representando 
uma loja de cosméticos. 

As lojas de cosméticos possuem o atributo 
taxaComercializacao, do tipo double (além de tudo que uma Loja
tem). 

Esta taxa é aplicada para as lojas que comercializam produtos de beleza. 
Crie um construtor para a classe, que receba informações para inicializar todos 
os atributos. 

Além disso, crie os métodos de acesso dos atributos (os métodos 
que ainda não existem) e sobrescreva o método toString, incluindo a 
informação específica da classe. */
public class Cosmetico extends Loja {
    
    private double taxaComercializacao;
    
    // Construtor com todos os parâmetros da Loja
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                     Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    // Construtor sem salário base (usa o segundo construtor da Loja)
    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, 
                     Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    // Métodos de acesso para taxaComercializacao
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
    
    @Override
    public String toString() {
        return "Cosmetico{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", dataFundacao=" + getDataFundacao() +
                ", taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
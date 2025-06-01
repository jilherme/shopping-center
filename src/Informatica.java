/* 
 Crie uma classe chamada Informatica, que é um tipo de loja, representando 
uma loja de informática. As lojas de informática possuem como atributos (além 
de tudo que uma Loja tem) um valor do tipo double chamado 
seguroEletronicos, que representa um seguro que lojas que vendem 
aparelhos eletrônicos devem pagar mensalmente. Crie um construtor para a 
classe, que receba informações para inicializar todos os atributos. Além disso, crie 
os métodos de acesso dos atributos (os métodos que ainda não existem) e 
sobrescreva o método toString, incluindo a informação específica da classe.
 */

public class Informatica extends Loja {
    
    private double seguroEletronicos;
    
    // Construtor com todos os parâmetros da Loja
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                       Endereco endereco, Data dataFundacao, double seguroEletronicos, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    // Construtor sem salário base (usa o segundo construtor da Loja)
    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, 
                       Data dataFundacao, double seguroEletronicos, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }
    
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
    
    @Override
    public String toString() {
        return "Informatica{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", dataFundacao=" + getDataFundacao() +
                ", seguroEletronicos=" + seguroEletronicos +
                '}';
    }
}
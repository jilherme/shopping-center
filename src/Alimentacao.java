/* 
Crie uma classe chamada Alimentacao, que é um tipo de loja, representando 
uma loja de alimentação. As lojas de alimentação possuem como atributo (além 
de tudo que uma Loja tem) um valor do tipo Data chamado dataAlvara, 
que indica a data que a loja de alimentação recebeu o alvará de funcionamento. 
Crie um construtor para a classe, que receba informações para inicializar todos 
os atributos. Além disso, crie os métodos de acesso dos atributos (os métodos 
que ainda não existem) e sobrescreva o método toString, incluindo a 
informação específica da classe
 */

public class Alimentacao extends Loja {
    
    private Data dataAlvara;
    
    // Construtor com todos os parâmetros da Loja
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                       Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }
    
    // Construtor sem salário base (usa o segundo construtor da Loja)
    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, 
                       Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara() {
        return dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
    
    @Override
    public String toString() {
        return "Alimentacao{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", dataFundacao=" + getDataFundacao() +
                ", dataAlvara=" + dataAlvara +
                '}';
    }
}
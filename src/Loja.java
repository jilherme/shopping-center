/* 
Etapa 2. Associação entre classes
Atualize as classes criadas anteriormente para contemplar o que é solicitado
abaixo:
• Uma Loja possui, além dos atributos já criados, um endereço (do tipo
Endereco) e uma data de fundação (do tipo Data). Crie os métodos de acesso
destes atributos. Além disso, atualize os construtores para receberem o endereço
e a data de fundação da loja.

 */
public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario; // Nome corrigido para manter consistência
    private Endereco endereco;
    private Data dataFundacao;

    // Métodos Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco,  Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario < 0) {
            return -1; // Salário base não definido
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    // Correção principal: método deve retornar char, não double
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    @Override
    public String toString() {
        return "Loja{"
                + "nome='" + nome + '\''
                + ", quantidadeFuncionarios=" + quantidadeFuncionarios
                + ", salarioBaseFuncionario=" + salarioBaseFuncionario
                + ", endereco=" + endereco
                + ", dataFundacao=" + dataFundacao
                + '}';
    }
}

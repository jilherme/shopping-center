
import java.util.Arrays;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    // Métodos Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];

    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco,  Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];

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

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
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

    public void imprimeProdutos() {
        if (estoqueProdutos.length == 0) {
            System.out.println("Sem produtos cadastrados.");
        } else {
            for (Produto produto : estoqueProdutos) {
                if (produto != null) {
                    System.out.println(produto);
                }
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false; // Estoque cheio
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i< estoqueProdutos.length; i++) {
            Produto produto = estoqueProdutos[i];
            if (produto != null &&  produto.getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    } 

    @Override
    public String toString() {
        return "Loja{"
                + "nome='" + nome + '\''
                + ", quantidadeFuncionarios=" + quantidadeFuncionarios
                + ", salarioBaseFuncionario=" + salarioBaseFuncionario
                + ", endereco=" + endereco
                + ", dataFundacao=" + dataFundacao
                + ", estoqueProduto=" + Arrays.toString(estoqueProdutos)
                + '}';
    }
}

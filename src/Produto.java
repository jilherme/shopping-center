/* 
Um Produto possui, além dos atributos já criados, uma data de validade (do
tipo Data). Crie os métodos de acesso deste atributo. Além disso, atualize o
construtor para receber a data de validade do produto

Na classe Produto, crie um método chamado estaVencido, que recebe uma
data por parâmetro (objeto do tipo Data) e retorna verdadeiro caso o produto
esteja vencido em relação a esta data ou falso caso contrário.
 */

public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    // Método Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data data) { 
        this.dataValidade = data;
    }

    public boolean estaVencido(Data dataVericacao) {
     // Checa se o ano da validade é anterior ao ano de verificação
    if (this.dataValidade.getAno() < dataVericacao.getAno()) {
        return true;
    } else if (this.dataValidade.getAno() > dataVericacao.getAno()) {
        return false;
    }
    
    // Checa se o mês da validade é anterior ao mês de verificação no mesmo ano
    if (this.dataValidade.getMes() < dataVericacao.getMes()) {
        return true;
    } else if (this.dataValidade.getMes() > dataVericacao.getMes()) {
        return false;
    }

    // Finalmente, checa se o dia da validade é anterior ao dia de verificação no mesmo mês e ano
    return this.dataValidade.getDia() < dataVericacao.getDia();
       
    }



    @Override
    public String toString() {
        return "Produto{"
                + "nome='" + nome + '\''
                + ", preco=" + preco
                + '}';
    }
}

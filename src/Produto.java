/* 
Um Produto possui, além dos atributos já criados, uma data de validade (do
tipo Data). Crie os métodos de acesso deste atributo. Além disso, atualize o
construtor para receber a data de validade do produto

Na classe Produto, crie um método chamado estaVencido, que recebe uma
data por parâmetro (objeto do :po Data) e retorna verdadeiro caso o produto
esteja vencido em relação a esta data ou falso caso contrário.
 */
public class Produto {

    private String nome;
    private double preco;

    // Método Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "Produto{"
                + "nome='" + nome + '\''
                + ", preco=" + preco
                + '}';
    }
}

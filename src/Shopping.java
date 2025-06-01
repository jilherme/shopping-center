
import java.util.Arrays;

/* 
  Crie uma classe chamada Shopping. Um Shopping possui os atributos nome
(do tipo String), endereco (do tipo Endereco) e lojas (que deve ser um 
array de Loja). No construtor de Shopping, receba informações para 
inicializar o nome, o endereço e, também, receba a quantidade máxima de lojas 
deste shopping (do tipo inteiro). No construtor de shopping, então, instancie o 
array lojas, informando a capacidade dele de acordo com o valor recebido por 
parâmetro. Naturalmente, quando um Shopping for criado, ele não terá lojas 
ainda, apenas o espaço em memória necessário para armazená-las. Crie os 
métodos de acesso dos atributos. Implemente o método toString nesta 
classe, retornando uma String formatada da forma que você desejar, desde 
que contenha as informações de todos os atributos da classe. 

• Na classe Shopping, crie os seguintes métodos:
o insereLoja: este método recebe um objeto do tipo Loja por 
parâmetro e insere esta loja no array lojas, na primeira posição livre do 
array (ou seja, a primeira posição nula). O método retorna verdadeiro caso 
a loja seja inserida corretamente e falso caso contrário (ou seja, caso não 
haja lugar no array).
o removeLoja: este método recebe uma String que representa o nome 
de uma loja e remove a loja com este nome do array lojas. O método 
retorna verdadeiro caso a loja seja removida e falso caso contrário (caso 
não haja a loja com o nome solicitado no array).
o quantidadeLojasPorTipo: este método recebe como parâmetro 
uma String que indica o tipo de loja que deve ser buscado (Cosmé:co, 
Vestuário, Bijuteria, Alimentação ou Informáca). Deve-se então retornar 
a quan:dade de lojas desse tipo que existem no shopping. Caso seja 
recebida uma String que não corresponde a nenhuma das opções 
anteriores, o método retorna –1.
o lojaSeguroMaisCaro: este método não recebe parâmetros e retorna 
a loja do tipo Informatica que paga o maior valor de seguro de 
eletrônicos do shopping. Caso não haja lojas deste tipo, o método retorna 
null.
 */
public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return this.lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
            return "Shopping{"
                + "nome='" + nome + '\''
                + ", endereço=" + endereco
                + ", lojas=" + Arrays.toString(lojas)
                + '}';
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true; // Loja inserida com sucesso
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for (int i = 0; i< lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                return true; // Loja removida com sucesso
            }
        }
        return false; // Loja não encontrada
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                if (tipo.equalsIgnoreCase("Cosmetico") && loja instanceof Cosmetico) {
                    count++;
                } else if (tipo.equalsIgnoreCase("Vestuário") && loja instanceof Vestuario) {
                    count++;
                } else if (tipo.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) {
                    count++;
                } else if (tipo.equalsIgnoreCase("Alimentação") && loja instanceof Alimentacao) {
                    count++;
                } else if (tipo.equalsIgnoreCase("Informática") && loja instanceof Informatica) {
                    count++;
                }
            }
        }
        return count > 0 ? count : -1; // Retorna -1 se não houver lojas do tipo especificado
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaiorSeguro = null;
        double maiorValor = 0;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica informatica) {
                double valorSeguro = informatica.getSeguroEletronicos();
                if (valorSeguro > maiorValor) {
                    maiorValor = valorSeguro;
                    lojaMaiorSeguro = (Informatica) loja; // donwcasting, o java nao infere que é uma subclasse  de loja mesmo apos o instanceof
                }
            }
        }
        
        return lojaMaiorSeguro;
    }
}

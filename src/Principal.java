/* 
Crie uma classe chamada Principal e, nela, coloque o método main. Neste
método, crie um menu para ser exibido para o usuário, desta forma:
(1) criar uma loja
(2) criar um produto
(3) sair
Todas as informações para criação da loja e do produto devem ser solicitadas ao usuário pelo Teclado.
Depois de criados os 2 objetos corretamente, seu programa deve:
- imprimir a mensagem "PRODUTO VENCIDO" ou "PRODUTO NÃO VENCIDO" 
- caso o produto criado esteja vencido na data de 20/10/2023 (utilizando o método criado anteriormente para isso)
- imprimir as informações da loja criada
 */
public class Principal {
    
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // Criação de objetos Loja e Produto
        Loja loja = null;
        Produto produto = null;
        int opcao = 0;
        int objetosCriados = 0;

        /* Depois de criados os 2 objetos corretamente, seu programa deve:
- imprimir a mensagem "PRODUTO VENCIDO" ou "PRODUTO NÃO VENCIDO" 
- caso o produto criado esteja vencido na data de 20/10/2023 (utilizando o método criado anteriormente para isso)
- imprimir as informações da loja criada */

        while (opcao != 3 && objetosCriados != 2) {
            System.out.println(MENU);

            opcao = scanner.nextInt(); 
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao ) {
                case 1 -> {
                    loja = criarLoja(scanner);
                    objetosCriados++;
                }
                case 2 -> {
                    produto = criarProduto(scanner); 
                    objetosCriados++;
                }
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            
            
        }
        Data dataAtual = new Data(20, 10, 2023);
        if (produto != null && produto.estaVencido(dataAtual)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
        if (loja != null) loja.toString();
    }

    private static final String MENU = """
            Escolha uma opção:
            (1) Criar uma loja
            (2) Criar um produto
            (3) Sair
            """;

    private static Loja criarLoja(java.util.Scanner scanner) {
        System.out.print("Digite o nome da loja: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();
        System.out.print("Digite o salário base dos funcionários: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome da rua: ");
        String nomeRua = scanner.nextLine();
        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Digite o estado: ");
        String estado = scanner.nextLine();
        System.out.print("Digite o país: ");
        String pais = scanner.nextLine();
        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();
        System.out.print("Digite o complemento (opcional): ");
        String complemento = scanner.nextLine();


        System.out.print("Digite a data de fundação (dd/mm/aaaa): ");
        String[] dataFundacaoStr = scanner.nextLine().split("/");
        int dia = Integer.parseInt(dataFundacaoStr[0]);
        int mes = Integer.parseInt(dataFundacaoStr[1]);
        int ano = Integer.parseInt(dataFundacaoStr[2]);

        Data dataFundacao = new Data(dia, mes, ano);
        Endereco enderecoObj = new Endereco(nomeRua,cidade  ,estado ,pais ,cep ,numero ,complemento );

        Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBase, enderecoObj, dataFundacao);
        System.out.println("Loja criada com sucesso: " + loja);
        return loja;
    }

    private static Produto criarProduto(java.util.Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite a data de validade do produto (dd/mm/aaaa): ");
        String[] dataValidadeStr = scanner.nextLine().split("/");
        int dia = Integer.parseInt(dataValidadeStr[0]);
        int mes = Integer.parseInt(dataValidadeStr[1]);
        int ano = Integer.parseInt(dataValidadeStr[2]);

        Data dataValidade = new Data(dia, mes, ano);
        dataValidade.getDia(); // Verifica se a data é válida
        dataValidade.getMes(); // Verifica se o mês é válido
        dataValidade.getAno(); // Verifica se o ano é válido
        
        Produto produto = new Produto(nomeProduto, preco, dataValidade);

        /* Data dataAtual = new Data(20, 10, 2023);
        if (produto.estaVencido(dataAtual)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        } */

        System.out.println("Produto criado com sucesso: " + produto);
        return produto;
    }
    
}

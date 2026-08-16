// Define o pacote onde a classe está localizada
package exercicio;

// Importa a classe Scanner
// O Scanner permite receber informações digitadas pelo usuário
import java.util.Scanner;

// Cria a classe Principal
public class Principal {

    // Método principal do programa
    // A execução do programa começa pelo método main
    public static void main(String[] args) {

        // Cria um objeto chamado entrada da classe Scanner
        // System.in indica que os dados serão digitados pelo teclado
        Scanner entrada = new Scanner(System.in);

        // Cria um objeto chamado produto
        // Esse objeto é criado a partir da classe Produto
        Produto produto = new Produto();

        // Mostra uma mensagem na tela
        System.out.println("=== CADASTRO DE PRODUTO ===");

        // Solicita o nome do produto
        // print mostra a mensagem sem pular para a próxima linha
        System.out.print("Nome do produto: ");

        // Lê o texto digitado pelo usuário
        // O valor digitado será armazenado no atributo nome
        produto.nome = entrada.nextLine();

        // Solicita o preço do produto
        System.out.print("Preço do produto: ");

        // Lê um número do tipo double
        // O valor será armazenado no atributo preco
        produto.preco = entrada.nextDouble();

        // Solicita a quantidade do produto
        System.out.print("Quantidade: ");

        // Lê um número inteiro
        // O valor será armazenado no atributo quantidade
        produto.quantidade = entrada.nextInt();

        // Pula uma linha e mostra um título
        // \n representa uma quebra de linha
        System.out.println("\n=== PRODUTO CADASTRADO ===");

        // Mostra o nome armazenado no objeto produto
        System.out.println("Nome: " + produto.nome);

        // Mostra o preço armazenado no objeto produto
        System.out.println("Preço: R$ " + produto.preco);

        // Mostra a quantidade armazenada no objeto produto
        System.out.println("Quantidade: " + produto.quantidade);

        // Calcula o valor total dos produtos disponíveis no estoque
        // O cálculo realizado é: preço x quantidade
        double valorTotal = produto.preco * produto.quantidade;

        // Mostra o resultado do cálculo na tela
        System.out.println("Valor total em estoque: R$ " + valorTotal);

        // Fecha o Scanner após terminar a leitura dos dados
        entrada.close();
    }
}
// Define o pacote onde nossa classe está localizada
package exercicio;

// Importa a classe Scanner para receber dados pelo teclado
import java.util.Scanner;

// Cria a classe VerificarEstoque
public class VerificarEstoque {

    // Método principal
    // O programa começa sua execução por aqui
    public static void main(String[] args) {

        // Cria o Scanner para receber informações pelo teclado
        Scanner entrada = new Scanner(System.in);

        // Cria um objeto da classe Produto
        Produto produto = new Produto();

        // Exibe o título do programa
        System.out.println("=== VERIFICAÇÃO DE ESTOQUE ===");

        // Solicita o nome do produto
        System.out.print("Nome do produto: ");

        // Guarda o nome digitado no objeto produto
        produto.nome = entrada.nextLine();

        // Solicita a quantidade disponível
        System.out.print("Quantidade em estoque: ");

        // Guarda a quantidade digitada no objeto produto
        produto.quantidade = entrada.nextInt();

        // Verifica se a quantidade é maior que zero
        if (produto.quantidade > 0) {

            // Este código será executado se a condição for verdadeira
            System.out.println("Produto disponível em estoque.");

        } else {

            // Este código será executado se a condição for falsa
            System.out.println("Produto sem estoque.");
        }

        // Fecha o Scanner
        entrada.close();
    }
}
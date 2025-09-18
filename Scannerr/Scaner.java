import java.util.Scanner;

public class Scaner {
    public static void scaner(String[] args) {
        // Scanner para ler dados do usuário
        Scanner cin = new Scanner(System.in);

        // Lendo uma String
        System.out.print("Digite seu nome: ");
        String nome = cin.nextLine();

        // Lendo um número inteiro usando Wrapper Integer
        System.out.print("Digite sua idade: ");
        Integer idade = null;
        if (cin.hasNextInt()) {
            idade = cin.nextInt(); // Integer encapsula o tipo int
        }

        // Lendo um número decimal usando Wrapper Double
        System.out.print("Digite sua altura (ex: 1.70): ");
        Double altura = null;
        if (cin.hasNextDouble()) {
            altura = cin.nextDouble(); // Double encapsula o tipo double
        }

        // Usando métodos da String
        System.out.println("Olá " + nome.toUpperCase()); // nome em maiúsculas
        System.out.println("Seu nome tem " + nome.length() + " letras."); // tamanho

        // Exibindo informações lidas
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        // Convertendo Integer para String usando valueOf
        String idadeTexto = String.valueOf(idade);
        System.out.println("Idade em texto: " + idadeTexto);

        cin.close(); // fechando o Scanner
    }
}

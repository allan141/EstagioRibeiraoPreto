import java.util.Scanner;

public class ContagemLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int quantidade = contarA(texto);
        System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");

        scanner.close();
    }

    public static int contarA(String texto) {
        int contagem = 0;

        String textoLower = texto.toLowerCase();

        for (char c : textoLower.toCharArray()) {
            if (c == 'a') {
                contagem++;
            }
        }
        return contagem;
    }
}


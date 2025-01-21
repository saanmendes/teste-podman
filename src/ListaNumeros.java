import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os números (digite 'fim' para terminar):");
        while (scanner.hasNextInt()) {
            numeros.add(scanner.nextInt());
        }

        if (numeros.size() > 0) {
            int soma = 0;
            int maior = numeros.get(0);
            int menor = numeros.get(0);

            for (int num : numeros) {
                soma += num;
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }

            double media = soma / (double) numeros.size();
            System.out.println("Média: " + media);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }

        scanner.close();
    }
}

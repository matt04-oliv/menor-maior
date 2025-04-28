import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > maior){
                maior = numeros[i];
            }

            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}
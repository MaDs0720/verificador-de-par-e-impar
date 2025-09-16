import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor:");
        int valor = scanner.nextInt();
        if (valor % 2 == 0){
            System.out.println("é par");
        } else { System.out.print("é impar");
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite seu saldo: ");
        double saldo = n.nextDouble();
        double result = saldo*1.01;
        System.out.println(result);
    }
}

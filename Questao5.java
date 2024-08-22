import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        double salarioMinimo = 1400;
        System.out.println("DIGITE O VALOR DO SEU SALÁRIO: ");
        double salario = l.nextDouble();

        double quantSalario = salario/salarioMinimo;
        System.out.println(quantSalario);
    }
}

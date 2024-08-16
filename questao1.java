import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? : ");
        int anos = n.nextInt();
        System.out.println("Em que mês você nasceu? : ");
        int mes = n.nextInt();
        System.out.println("Em que dia você nasceu? :");
        int dias = n.nextInt();
        int somaanos = anos * 365;
        int somames = mes * 30;
        double resultado = somaanos + somames + dias;
        System.out.printf("você tem %,.0f em dias ", resultado);
    }
}
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Qual a porcentagem do IPI?: ");
        double porc = l.nextDouble();
        System.out.println("Qual o código do peça 1?: ");
        int c1 = l.nextInt();
        System.out.println("Digite valor unitário da peça 1:");
        double vu1 = l.nextDouble();
        System.out.println("Quantidade de peças 1: ");
        int qp1 = l.nextInt();
        System.out.println("Qual o código do peça 2?: ");
        int c2 = l.nextInt();
        System.out.println("Digite valor unitário da peça 2:");
        double vu2 = l.nextDouble();
        System.out.println("Quantidade de peças 2: ");
        int qp2 = l.nextInt();

        System.out.println((vu1*qp1+vu2*qp2)*(porc/100+1));


    }
}

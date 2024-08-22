import java.util.Scanner;

public class questao6 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        int numero = l.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O ANTECESSOR DE " + numero + " É " + antecessor);
        System.out.println("O SUUCESSOR DE " + numero + " É " + sucessor);
    }
}

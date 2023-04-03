import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n1 = 0,n2 = 0;

        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("O maior número é: "+ n1);
        }else{
            System.out.println("O maior número é: "+ n2);
        }
    }
}

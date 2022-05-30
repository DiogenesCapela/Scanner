import java.util.Scanner;

public class AppScanner {
    public static void main (String[]args){
        Scanner scanner;
        scanner = new Scanner(System.in);

        int num1;
        int num2;
        float coeficiente;
        String nome;
        char inicial;

        System.out.println("Insira um primeiro numero");
        num1 = scanner.nextInt();
        System.out.println("Insira um segundo numero");
        num2 = scanner.nextInt();

        System.out.println("Insira o coeficiente");
        coeficiente = scanner.nextFloat();

        System.out.println("Insira o seu nome");
        nome = scanner.next();
        inicial = nome.charAt(0);

        System.out.println("A primeira letra do seu nome comeca com " + inicial);



    }
}

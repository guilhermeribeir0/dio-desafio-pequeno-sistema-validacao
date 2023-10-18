import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int parametroUm = input.nextInt();
        int parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new RuntimeException(ParametrosInvalidosException.PARAMETROS_INVALIDOS);
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
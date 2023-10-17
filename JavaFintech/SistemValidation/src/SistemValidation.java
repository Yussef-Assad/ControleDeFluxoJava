import java.util.Scanner;

public class SistemValidation{
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        if (validarParametros(parametroUm, parametroDois)) {
            try {
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());
            }
        } else {
            System.out.println("Parâmetros inválidos. O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static boolean validarParametros(int parametroUm, int parametroDois) {
        return parametroUm <= parametroDois;
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm + 1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
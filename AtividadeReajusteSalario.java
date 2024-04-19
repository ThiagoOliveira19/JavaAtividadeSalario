import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do colaborador: ");
        double salario = scanner.nextDouble();

        double percentual;
        if (salario <= 280) {
            percentual = 20;
        } else if (salario <= 700) {
            percentual = 15;
        } else if (salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double aumento = (salario * percentual) / 100;
        double novoSalario = salario + aumento;

        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Percentual aplicado: " + percentual + "%");
        System.out.println("Novo salário após a aplicação: R$ " + novoSalario);
    }
}

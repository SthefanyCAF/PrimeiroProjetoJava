import java.util.Scanner;

public class PrimeiroProjetoJava {
    public static void main(String[] args) {
        String nome = "Bruce Wayne";
        String tipoConta = "Corrente";
        double saldo = 9699.00;
        int opcao = 0;

        System.out.println("***************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n***************************");

        String menu = """
                ** Digite sua opção: **
                1 - Consultar Saldo
                2 - Transferir
                3 - Receber
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: " + saldo);
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");

            }
        }
    }
}

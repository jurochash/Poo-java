package projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaCartao sistema = new SistemaCartao();
        Scanner scanner = new Scanner(System.in);

        // Adicionar alguns funcionários de exemplo
        sistema.adicionarFuncionario(1, new Funcionario("João", "Silva", "Poeira", "Nenhum", "123456789", "joao@example.com"));
        sistema.adicionarFuncionario(2, new Funcionario("Maria", "Santos", "Nenhuma", "Problema no coração", "987654321", "maria@example.com"));

        // Loop para interação com o usuário
        while (true) {
            System.out.println("Digite o ID do funcionário para gerar o cartão (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int id = Integer.parseInt(entrada);
                sistema.gerarCartao(id);
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Tente novamente.");
            }
        }

        scanner.close();
    }
}


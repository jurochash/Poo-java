package projeto;

import java.util.HashMap;
import java.util.Map;

public class SistemaCartao {
    private Map<Integer, Funcionario> funcionarios;

    public SistemaCartao() {
        funcionarios = new HashMap<>();
    }

    public void adicionarFuncionario(int id, Funcionario funcionario) {
        funcionarios.put(id, funcionario);
    }

    public Funcionario obterFuncionario(int id) {
        return funcionarios.get(id);
    }

    public void gerarCartao(int id) {
        Funcionario funcionario = obterFuncionario(id);
        if (funcionario != null) {
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}

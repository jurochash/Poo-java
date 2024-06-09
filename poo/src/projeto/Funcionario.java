package projeto;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String alergias;
    private String problemasMedicos;
    private String telefone;
    private String email;

    public Funcionario(String nome, String sobrenome, String alergias, String problemasMedicos, String telefone, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getProblemasMedicos() {
        return problemasMedicos;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " " + sobrenome +
               "\nAlergias: " + alergias +
               "\nProblemas Médicos: " + problemasMedicos +
               "\nTelefone: " + telefone +
               "\nEmail: " + email;
    }
}

class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase;

        public Funcionario(String nome, String matricula, double salarioBase) {
            this.nome = nome;
            this.matricula = matricula;
            this.salarioBase = salarioBase;
        
        }

        public double calcularSalario(){
            return salarioBase;
        }

        public void exibirDados(){
            System.out.println("Nome: " + nome);
            System.out.println("Matricula: " + matricula);
            System.out.println("Salário: R$" + calcularSalario());
            System.out.println("__________________");
        }
}

class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 20.0 / 100.0); 
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}

public class Teste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = new Gerente("Joel Caldas", "001", 5000);
        funcionarios[1] = new Vendedor("João Souza", "002", 3000, 800);

        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}


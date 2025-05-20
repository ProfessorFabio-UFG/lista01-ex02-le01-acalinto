import java.util.Scanner;

public class CadastroMorador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Morador m = new Morador();

        System.out.print("Nome: ");
        m.nome = sc.nextLine();
        System.out.print("CPF: ");
        m.cpf = sc.nextLine();
        System.out.print("Celular: ");
        m.celular = sc.nextLine();
        System.out.print("Data de Nascimento: ");
        m.dataNascimento = sc.nextLine();
        System.out.print("Sexo (M/F): ");
        m.sexo = sc.next().charAt(0);
        System.out.print("Bloco: ");
        m.bloco = sc.nextInt();
        System.out.print("Apartamento: ");
        m.apto = sc.nextInt();
        sc.nextLine(); // limpar buffer
        System.out.print("Código de Acesso: ");
        m.codigoAcesso = sc.nextLine();

        System.out.println("\nMorador cadastrado:");
        System.out.println("Nome: " + m.nome + ", CPF: " + m.cpf + ", Celular: " + m.celular);
    }
}

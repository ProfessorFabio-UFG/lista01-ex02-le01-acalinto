import java.util.Scanner;

public class CadastroMoradorVetor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Morador[] moradores = new Morador[100];
        int i = 0;

        while (true) {
            Morador m = new Morador();
            System.out.print("Nome: ");
            m.nome = sc.nextLine();
            System.out.print("CPF: ");
            m.cpf = sc.nextLine();
            System.out.print("Celular: ");
            m.celular = sc.nextLine();
            System.out.print("Data de Nascimento: ");
            m.dataNascimento = sc.nextLine();
            System.out.print("Sexo: ");
            m.sexo = sc.next().charAt(0);
            System.out.print("Bloco: ");
            m.bloco = sc.nextInt();
            System.out.print("Apto: ");
            m.apto = sc.nextInt();
            sc.nextLine();
            System.out.print("Código de Acesso: ");
            m.codigoAcesso = sc.nextLine();

            moradores[i++] = m;

            System.out.print("Deseja cadastrar outro morador? (s/n): ");
            if (!sc.nextLine().equalsIgnoreCase("s")) break;
        }

        System.out.println("\nLista de moradores:");
        for (int j = 0; j < i; j++) {
            System.out.println("Nome: " + moradores[j].nome + ", Apto: " + moradores[j].apto);
        }
    }
}

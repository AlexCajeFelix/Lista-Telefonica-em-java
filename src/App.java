import java.math.BigInteger;
import java.util.Scanner;
import Agenda.Agenda;
import Agenda.Interface.RepositorioContato;
import Agenda.Pessoa.Pessoa;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepositorioContato agenda = new Agenda();

        while (true) {
            System.out.println("(1) Adicionar um contato");
            System.out.println("(2) Visualizar todos os contatos");
            System.out.println("(3) Visualizar por nome");
            System.out.println("(4) Excuir por numero");
            System.out.println("(5) Sair");
            System.out.println("Digite a opção que você deseja:");
            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String name = sc.nextLine();
                    System.out.println("Digite o número:");
                    BigInteger numero = sc.nextBigInteger(); 
                    Pessoa pessoa = new Pessoa(name, numero);
                    agenda.adicionarPessoa(pessoa);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    agenda.listarPessoas();
                    break;

                case 3:
                    System.out.println("Digite o nome do contato que deseja visualizar:");
                    String nameVisu = sc.nextLine();
                    agenda.buscarPorNome(nameVisu);
                    break;
                case 4:
                    System.out.println("Digite o numero que voce deseja excluir:");
                    BigInteger number = sc.nextBigInteger();
                    agenda.removerPessoa(number);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return; 

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}

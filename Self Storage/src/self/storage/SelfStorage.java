/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package self.storage;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class SelfStorage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner Entrada = new Scanner(System.in);

        ArrayList<Client> clientes = new ArrayList<>();
        ArrayList<Garage> garagens = new ArrayList<>();
        ArrayList<Locacao> locacoes = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n<<<<< SELF STORAGE >>>>>");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Garagem");
            System.out.println("4 - Listar Garagens");
            System.out.println("5 - Realizar Locação");
            System.out.println("6 - Listar Locações");
            System.out.println("7 - Excluir Cliente");
            System.out.println("8 - Excluir Garagem");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = Entrada.nextInt();
            Entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = Entrada.nextLine();

                    System.out.print("CPF: ");
                    String cpf = Entrada.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = Entrada.nextLine();

                    Client cliente = new Client(nome, cpf, telefone);
                    clientes.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Client c : clientes) {
                            System.out.println("------------------");
                            System.out.println("Nome: " + c.getNome());
                            System.out.println("CPF: " + c.getCpf());
                            System.out.println("Telefone: " + c.getTelefone());
                        }
                    }
                    break;
                    
                    case 3:
                     System.out.print("Número da garagem: ");
                     int numero = Entrada.nextInt();
                     
                     System.out.print("Valor mensal: ");
                     double valor = Entrada.nextDouble();
                     
                     Garage garagem = new Garage(numero, valor);
                     garagens.add(garagem);
                     System.out.println("Garagem cadastrada com sucesso!");

                    break;
                    
                    case 4:
                     if (garagens.isEmpty()) {
                     System.out.println("Nenhuma garagem cadastrada.");
                     } else {    
                         for (Garage g : garagens) {
                         System.out.println("------------------");
                         System.out.println("Número: " + g.getNumero());
                         System.out.println("Valor Mensal: R$ " + g.getValorMensal());
                         System.out.println("Disponível: " + g.isDisponivel());
                         }
                     }
                     break;
                     
                     case 5:
                         if (clientes.isEmpty() || garagens.isEmpty()) {
                             System.out.println("Cadastre clientes e garagens primeiro.");
                             break;
                         }
                         System.out.println("Clientes:");
                         for (int i = 0; i < clientes.size(); i++) {
                             Client c = clientes.get(i);
                             System.out.println(i + " - " + c.getNome());
                         }
                         System.out.print("Escolha o cliente: ");
                         int clienteEscolhido = Entrada.nextInt();
                         
                         System.out.println("Garagens disponíveis:");
                         for (int i = 0; i < garagens.size(); i++) {
                             Garage g = garagens.get(i);
                             
                             if (g.isDisponivel()) {
                                 System.out.println(i + " - Garagem " + g.getNumero());
                             }
                         }
                         System.out.print("Escolha a garagem: ");
                         int garagemEscolhida = Entrada.nextInt();
                         
                         Garage garagemSelecionada = garagens.get(garagemEscolhida);
                         garagemSelecionada.setDisponivel(false);
                         
                         Locacao locacao = new Locacao(
                                 clientes.get(clienteEscolhido),
                                 garagemSelecionada
                         );
                         locacoes.add(locacao);
                         System.out.println("Locação realizada com sucesso!");
                         
                     break;
                     
                     case 6:
                         
                         if (locacoes.isEmpty()) {
                             System.out.println("Nenhuma locação cadastrada.");
                         } else {
                             for (Locacao l : locacoes) {
                                 System.out.println("------------------");
                                 System.out.println("Cliente: "
                                         + l.getCliente().getNome());
                                 
                                 System.out.println("Garagem: "
                                         + l.getGaragem().getNumero());
                                 
                                 System.out.println("Valor Mensal: R$ "
                                         + l.getGaragem().getValorMensal());
                             }
                         }
                         break;
                     
                     case 7:
                         if (clientes.isEmpty()) {
                             System.out.println("Nenhum cliente cadastrado.");
                         } else {
                             System.out.println("Clientes cadastrados:");
                             
                             for (int i = 0; i < clientes.size(); i++) {
                                 Client c = clientes.get(i);
                                 System.out.println(i + " - " + c.getNome());
                             }
                             System.out.print("Digite o número do cliente para excluir: ");
                             int indiceCliente = Entrada.nextInt();

                             if (indiceCliente >= 0 && indiceCliente < clientes.size()) {
                                 clientes.remove(indiceCliente);
                                 System.out.println("Cliente excluído com sucesso!");
                             } else {
                                 System.out.println("Cliente inválido.");
                             }
                         }
                         break;
                     
                     case 8:
                         if (garagens.isEmpty()) {
                             System.out.println("Nenhuma garagem cadastrada.");
                         } else {
                             System.out.println("Garagens cadastradas:");
                             for (int i = 0; i < garagens.size(); i++) {
                                 Garage g = garagens.get(i);
                                 
                                 System.out.println(i + " - Garagem " + g.getNumero());
                             }
                             System.out.print("Digite o número da garagem para excluir: ");
                             int indiceGaragem = Entrada.nextInt();
                             
                             if (indiceGaragem >= 0 && indiceGaragem < garagens.size()) {
                                 garagens.remove(indiceGaragem);
                                 
                                 System.out.println("Garagem excluída com sucesso!");
                             } else {
                                 System.out.println("Garagem inválida.");
                             }
                         }
                         break; 
                          
                            case 0:
                                System.out.println("Encerrando sistema...");
                                
                                break;
                    
                            default:
                                System.out.println("Opção inválida!");
            }
        }
        while (opcao != 0);
        Entrada.close();
    }
}
    
    

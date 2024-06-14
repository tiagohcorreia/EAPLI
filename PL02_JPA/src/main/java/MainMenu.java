import GA.GA.ContratoAluguerUI;
import GA.GA.GrupoAutomovelUI;
import util.Console;

import java.util.Scanner;

public class MainMenu {
    public static void mainLoop() {

        int opcao = 0;

        do {
            ContratoAluguerUI contratoAluguerUI = new ContratoAluguerUI();
            GrupoAutomovelUI ui = new GrupoAutomovelUI();
            opcao = menu();

            switch (opcao) {

                case 0:
                    System.out.println("fim ...");
                    break;

                case 1:
                    ui.registarGA();
                    break;

                case 2:
                    ui.listarGAs();
                    break;

                case 3:
                    Scanner scanner = new Scanner(System.in);
                    ui.procurarGAPorID(scanner.nextInt());
                    break;

                case 4:
                    contratoAluguerUI.registarContratoAluguer();
                    break;

                case 5:
                    contratoAluguerUI.listarContratos();
                    break;

                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao != 0);

    }

    private static int menu() {

        int option = -1;
        System.out.println("");
        System.out.println("=============================");
        System.out.println(" Rent a Car ");
        System.out.println("=============================\n");
        System.out.println("1.Registar Grupo Automóvel");
        System.out.println("2.Listar todos os Grupos Automóveis");
        System.out.println("3.Procurar Automóveis pelo ID");
        System.out.println("4.Registar Contrato de Automovel");
        System.out.println("5.Listar Contratos de Automovel");

        System.out.println("=============================");
        System.out.println("0. Sair\n\n");
        option = Console.readInteger("Por favor escolha opção");
        return option;
    }
}

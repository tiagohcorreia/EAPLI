package GA.GA;

import domain.GrupoAutomovel;
import util.Console;

public class GrupoAutomovelUI {

    private final GrupoAutomovelController controller = new GrupoAutomovelController();
    
    public void registarGA() {

        System.out.println("*** Registo Grupo Automóvel ***\n");
        String nome = Console.readLine("Nome:");
        int portas = Console.readInteger("Número de portas");
        String classe = Console.readLine("Classe:");

        GrupoAutomovel grupoAutomovel = controller.registarGrupoAutomóvel(nome, portas, classe);

        System.out.println("Grupo Automóvel" + grupoAutomovel);
    }
    public void listarGAs() {
        System.out.println(controller.listarGruposAutomoveis());
	}

	public void procurarGAPorID(long id) {
		controller.procurarGrupoAutomovel(id);
	}
}

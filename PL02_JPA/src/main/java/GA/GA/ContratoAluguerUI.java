package GA.GA;

import util.Console;

public class ContratoAluguerUI {

    private ContratoAluguerController controller;

    public void registarContratoAluguer() {

        System.out.println("=====Registar Contrato Automovel=====");
        int automovelID = Console.readInteger("Automovel ID: ");

    }

    public void listarContratos() {

        System.out.println(controller.listarContratos());
    }
}

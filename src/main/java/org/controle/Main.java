package org.controle;

import org.controle.ControleRemoto.ControleRemoto;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.abirMenu();
        c.fecharMenu();

    }

}

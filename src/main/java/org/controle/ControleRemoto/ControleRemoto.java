package org.controle.ControleRemoto;

import org.controle.Controlador.Controlador;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("A TV está ligada...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("A TV está desligada...");
    }

    @Override
    public void abirMenu() {
        if (this.getLigado()) {
            System.out.println("_____ MENU _____");
            System.out.print("Está ligado? " + this.getLigado() + "\nEstá tocando? " + this.getTocando() + "\nVolume: " + this.getVolume());
            for (int i = 0; i <= getVolume(); i += 10) {
                System.out.print(" |");
            }
            System.out.println("");
        } else {
            System.out.println("Controle desligado...");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume...");
        }

    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume...");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }else {
            System.out.println("Não foi possivel ligar o mudo...");
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }else {
            System.out.println("Não foi possivel desligar o mudo...");
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não conseguir reproduzir...");
        }
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()) {
            setTocando(false);
        } else {
            System.out.println("Não conseguir pausar...");
        }
    }
}

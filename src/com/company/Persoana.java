package com.company;

public class Persoana {
    private final String numePersoana;
    private final String prenumePersoana;
    private final Comanda comandaPersoanei;

    public Persoana(String numePersoana, String prenumePersoana, Comanda comandaPersoanei) {
        this.numePersoana = numePersoana;
        this.prenumePersoana = prenumePersoana;
        this.comandaPersoanei = comandaPersoanei;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public String getPrenumePersoana() {
        return prenumePersoana;
    }

    public Comanda getComandaPersoanei() {
        return comandaPersoanei;
    }

    public void afiseazaComanda(){
        System.out.println(numePersoana + " " + prenumePersoana + " a comandat:");
        comandaPersoanei.afiseazaElementul();
    }
}

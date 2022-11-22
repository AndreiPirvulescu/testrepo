package com.company;

public class Pizza extends Mancare{
    private final String tipPizza;
    private final int timpPreparare;

    public String getTipPizza() {
        return tipPizza;
    }

    public Pizza(String numeMancare, double pretMancare, String tipPizza) {
        super(numeMancare, pretMancare);
        this.tipPizza = tipPizza;
        timpPreparare=5;
    }

    @Override
    public void afiseazaElementul() {
        System.out.println("\t" + numeMancare + " " + tipPizza + " la pret de " + pretMancare + "lei!");
    }
}

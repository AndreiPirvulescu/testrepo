package com.company;

public class Main {

    public static void main(String[] args) {
        Comanda primaComanda = new Comanda(
                new Paste("Paste", 40.0, "Carbonara"),
                    new Comanda(new Pizza("Pizza", 50.0, "Diavola"),
                                new Salate("Salata", 25.0, "Caesar")));

        Persoana primaPersoana = new Persoana("Pirvulescu", "Andrei", primaComanda);
        primaPersoana.afiseazaComanda();


    }
}

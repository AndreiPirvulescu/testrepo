package com.company;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements ElementeComposite{
    private final List<ElementeComposite> listaElemente = new ArrayList<>();

    public Comanda(ElementeComposite... listaElemente){
        this.listaElemente.addAll(List.of(listaElemente));
    }
    public void afiseazaElementul(){
        System.out.println("Comanda formata din: ");
        listaElemente.forEach(ElementeComposite::afiseazaElementul);
    }
}

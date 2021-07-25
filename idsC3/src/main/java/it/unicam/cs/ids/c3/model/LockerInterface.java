package it.unicam.cs.ids.c3.model;

import java.util.Set;

public interface LockerInterface {

    /**
     *
     * @return
     */
   Set<Armadietto> visualizzaArmadietti();


    /**
     *
     * @param IDOrdine
     * @return
     */
   int cercaOrdine(int IDOrdine);

    /**
     *
     * @param IDOrdine
     */
   void aggiornaStatoOrdine(int IDOrdine);

    /**
     *
     * @param ordine
     */
   void aggiungiOrdine(Ordine ordine);
}
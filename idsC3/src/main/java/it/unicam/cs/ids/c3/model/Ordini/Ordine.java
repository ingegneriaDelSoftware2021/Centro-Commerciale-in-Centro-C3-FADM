package it.unicam.cs.ids.c3.model.Ordini;

import it.unicam.cs.ids.c3.model.Clienti.Carrello;
import it.unicam.cs.ids.c3.model.Corriere.Corriere;

public class Ordine {

    private final int IDCliente;

    private StatoOrdine statoOrdine;

    private String destinazione;

    private  int IDOrdine;

    private Corriere corriere;

    private final Carrello carrello;


    /**
     *
     * @param idCliente
     * @param statoOrdine
     * @param destinazione
     * @param codiceRitiro
     */
    public Ordine(int idCliente, StatoOrdine statoOrdine, String destinazione, int codiceRitiro) {
        IDCliente = idCliente;
        this.statoOrdine = statoOrdine;
        this.destinazione = destinazione;
        this.IDOrdine = codiceRitiro;
        statoOrdine = StatoOrdine.ORDINECREATO;
        //TODO aggiustare questo costruttore
        this.carrello = null;
    }

    public Ordine(Carrello carrello){
        this.IDCliente = carrello.getIDCarrello();
        this.statoOrdine = StatoOrdine.ORDINECREATO;
        this.carrello = carrello;
    }

    /**
     *
     * @return
     */
    public int getIDCliente() {
        return IDCliente;
    }

    /**
     *
     * @return
     */
    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    /**
     *
     * @return
     */
    public String getDestinazione() {
        return destinazione;
    }

    /**
     *
     * @return
     */
    public int getIDOrdine() {
        return IDOrdine;
    }


    /**
     *
     * @param statoOrdine
     */
    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public Corriere getCorriere() {
        return corriere;
    }

    public void setCorriere(Corriere corriere) {
        this.corriere = corriere;
    }

    public void setDestinazione(String destinazione){
        this.destinazione = destinazione;
    }
}

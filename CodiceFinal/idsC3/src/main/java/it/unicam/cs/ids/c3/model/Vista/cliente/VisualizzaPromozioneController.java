package it.unicam.cs.ids.c3.model.Vista.cliente;

import it.unicam.cs.ids.c3.model.Esercente.Prodotto;
import it.unicam.cs.ids.c3.model.Esercente.Promozioni;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class VisualizzaPromozioneController implements Initializable {

    @FXML
    TableView<Promozioni> tabellaPromozioni;

    @FXML
    TableColumn<Promozioni, String> prodottoColonna;



    @FXML
    TableColumn<Promozioni,String> scontoColonna;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.prodottoColonna.setResizable(false);
        this.scontoColonna.setResizable(false);
    }




    public void setTabellaPromozioni(List<Promozioni> list){

        for(Promozioni p : list){
            this.prodottoColonna.setCellValueFactory(x->new ReadOnlyStringWrapper(x.getValue().getProdotto().getNome()));
            this.scontoColonna.setCellValueFactory(new PropertyValueFactory<>("sconto"));
            this.tabellaPromozioni.getItems().add(p);
        }

    }
}

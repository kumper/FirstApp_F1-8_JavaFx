package Kontrolery;

import javafx.fxml.FXML;
import java.io.IOException;

public class OptionsContr {

    private MainContr mainContr;
    @FXML
    public void onPowrotBtnAction() throws IOException {
        mainContr.loadMenuScreen();
    }

    public void setMainContr(MainContr mainContr) {
        this.mainContr = mainContr;
    }
}

package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.List;

public class FahrradController {
    private List<Fahrrad> fahrradListe;

    public FahrradController() {
        fahrradListe = new ArrayList<>();
        fahrradListe.add(new Fahrrad(1, "Trek Emonda", "Trek"));
        // Weitere Fahrräder hinzufügen...
    }

    public Fahrrad getFahrradById(int id) {
        for (Fahrrad fahrrad : fahrradListe) {
            if (fahrrad.getId() == id) {
                return fahrrad;
            }
        }
        return null;
    }
}

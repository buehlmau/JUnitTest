package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Fahrrad> searchFahrradByName(String name, boolean caseSensitive) {
    if (caseSensitive) {
        return fahrradListe.stream()
                .filter(f -> f.getName().contains(name))
                .collect(Collectors.toList());
    } else {
        String lowerCaseName = name.toLowerCase();
        return fahrradListe.stream()
                .filter(f -> f.getName().toLowerCase().contains(lowerCaseName))
                .collect(Collectors.toList());
    }
}

}

package Java.BaseClasses;

import java.time.LocalDate;

public class Abwesenheit {
    Mitarbeiter mitarbeiter;
    LocalDate anfang;
    LocalDate ende;

    public Abwesenheit(Mitarbeiter mitarbeiter, LocalDate anfang, LocalDate ende) {
        this.mitarbeiter = mitarbeiter;
        this.anfang = anfang;
        this.ende = ende;
    }

    public boolean istVerfügbar(LocalDate localDate){
        if(localDate.isBefore(anfang) && localDate.isAfter(ende)){
            return true;
        }
        return false;
    }
}

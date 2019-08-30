package Java.BaseClasses;

import java.time.LocalDate;

public class Abwesenheit {
    LocalDate anfang;
    LocalDate ende;

    public Abwesenheit(LocalDate anfang, LocalDate ende) {
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

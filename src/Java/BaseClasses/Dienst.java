package Java.BaseClasses;

import java.time.LocalDateTime;
import java.util.List;

public class Dienst {
    private LocalDateTime dateTime;
    private List<Mitarbeiter> mitarbeiterList;

    public Dienst(LocalDateTime dateTime, List<Mitarbeiter> mitarbeiterList) {
        this.dateTime = dateTime;
        this.mitarbeiterList = mitarbeiterList;
        checkAbwesenheit();
    }

    public String debugDienst(){
        return dateTime.toString() + " -- Mitarbeiter: " + mitarbeiterList.toString();
    }

    private void checkAbwesenheit (){
        for (Mitarbeiter m: mitarbeiterList){
            if(m.prüfeAbwesenheit(dateTime.toLocalDate())){
                mitarbeiterList.remove(m);
            }
        }
    }

}

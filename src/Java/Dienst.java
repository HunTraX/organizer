package Java;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Dienst {
    private LocalDateTime dateTime;
    private List<Mitarbeiter> mitarbeiterList;

    public Dienst(LocalDateTime dateTime, List<Mitarbeiter> mitarbeiterList) {
        this.dateTime = dateTime;
        this.mitarbeiterList = mitarbeiterList;
    }

    public String debugDienst(){
        return dateTime.toString() + " -- Mitarbeiter: " + mitarbeiterList.toString();
    }


}

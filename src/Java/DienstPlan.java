package Java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DienstPlan {
    private List<DienstTemplate> dienstTemplateList = new ArrayList<>();
    private LocalDate von;
    private LocalDate bis;
    private List<Dienst> dienstList;
    private List<Mitarbeiter> mitarbeiterList;

    public DienstPlan(LocalDate von, LocalDate bis, List<Mitarbeiter> mitarbeiterList) {
        this.von = von;
        this.bis = bis;
        this.mitarbeiterList = mitarbeiterList;
    }

    private void populateDienstList(){
        while(von.isBefore(bis) || von.isEqual(bis)){
            von.getDayOfWeek();
            Dienst d = new Dienst();
        }
    }

    private List<Mitarbeiter> getMitarbeiterForWeekday (DayOfWeek day){
        
    }
}

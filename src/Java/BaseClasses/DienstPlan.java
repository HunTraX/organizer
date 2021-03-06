package Java.BaseClasses;

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
        populateDienstList();
    }

    public DienstPlan(DienstPlan dienstPlan){
        this.von = dienstPlan.von;
        this.bis = dienstPlan.bis;
        this.mitarbeiterList = dienstPlan.mitarbeiterList;
        this.dienstList = dienstPlan.dienstList;
    }

    private void populateDienstList(){
        while(von.isBefore(bis) || von.isEqual(bis)){
            for(DienstTemplate dienstTemplate: dienstTemplateList){
                if (von.getDayOfWeek() == dienstTemplate.getDay()){
                    Dienst d = new Dienst(von.atTime(dienstTemplate.getStart()), getMitarbeiterForWeekday(von.getDayOfWeek()));
                }
            }
        }
    }

    private List<Mitarbeiter> getMitarbeiterForWeekday (DayOfWeek day){
        List<Mitarbeiter> returnList = new ArrayList<>();
        for(Mitarbeiter m: mitarbeiterList){
            for(DayOfWeek d: m.getDayList()){
                if(day == d){
                    returnList.add(m);
                }
            }
        }
        return returnList;
    }
}

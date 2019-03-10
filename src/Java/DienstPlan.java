package Java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DienstPlan {
    private List<Dienst> dienstList = new ArrayList<>();
    private LocalDate von;
    private LocalDate bis;

    public DienstPlan(LocalDate von, LocalDate bis) {
        this.von = von;
        this.bis = bis;
    }

    public void addDienst(Dienst d){
        if(!von.isBefore(d.getStartDate().toLocalDate()) && !bis.isAfter(d.getEndDate().toLocalDate())){
            dienstList.add(d);
        }
        else{
            System.out.println("Fehler: Datum passt nicht!");
        }
    }


}

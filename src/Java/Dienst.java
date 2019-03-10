package Java;

import javax.xml.stream.events.StartElement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dienst {
    private List mitarbeiterListe = new ArrayList();
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int mindestBelegung;
    private int optimalBelegung;

    public Dienst(List mitarbeiterListe, LocalDateTime startDate, LocalDateTime endDate) {
        this.mitarbeiterListe = mitarbeiterListe;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getMindestBelegung() {
        return mindestBelegung;
    }

    public void setMindestBelegung(int mindestBelegung) {
        this.mindestBelegung = mindestBelegung;
    }

    public int getOptimalBelegung() {
        return optimalBelegung;
    }

    public void setOptimalBelegung(int optimalBelegung) {
        this.optimalBelegung = optimalBelegung;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }
}

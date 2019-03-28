package Java;

import javax.xml.stream.events.StartElement;
import java.nio.channels.NonReadableChannelException;
import java.sql.Time;
import java.time.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

public class DienstTemplate {
    private DayOfWeek day;
    private List mitarbeiterListe = new ArrayList();
    private LocalTime start;
    private Double länge;
    private int mindestBelegung;
    private int optimalBelegung;

    public DienstTemplate(List mitarbeiterListe, LocalTime start, Double dauer) {
        this.mitarbeiterListe = mitarbeiterListe;
        this.start = start;
        this.länge = dauer;
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


}

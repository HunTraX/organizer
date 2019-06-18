package Java.BaseClasses;

import java.time.*;

public class DienstTemplate {
    private DayOfWeek day;
    private LocalTime start;
    private Double länge;
    private int mindestBelegung;
    private int optimalBelegung;

    public DienstTemplate(LocalTime start, Double dauer, DayOfWeek day) {
        this.start = start;
        this.day = day;
        this.länge = dauer;
    }

    public DienstTemplate (DienstTemplate copyTemplate){
        this.day = copyTemplate.day;
        this.länge = copyTemplate.länge;
        this.start = copyTemplate.start;
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

    public DayOfWeek getDay() {
        return day;
    }

    public LocalTime getStart() {
        return start;
    }

    public Double getLänge() {
        return länge;
    }
}

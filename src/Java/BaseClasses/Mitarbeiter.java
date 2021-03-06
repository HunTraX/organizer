package Java.BaseClasses;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mitarbeiter implements Serializable {
    private static int nextID =0;
    private int ID;
    private String name;
    private String vorName;
    private LocalDate geburtsDatum;
    private double stdBeschränkung=0;
    private List<DayOfWeek> dayList = new ArrayList<DayOfWeek>();
    private HashMap<LocalDate, Abwesenheit> abwesenheitHashMap;


    public Mitarbeiter(String name, String vorName, LocalDate geburtsDatum) {
        ID = nextID;
        nextID++;
        this.name = name;
        this.vorName = vorName;
        this.geburtsDatum = geburtsDatum;
        this.abwesenheitHashMap = new HashMap<>();
    }
    public Mitarbeiter(Mitarbeiter mitarbeiter){
        ID = nextID;
        nextID++;
        this.name = mitarbeiter.getName();
        this.vorName = mitarbeiter.getVorName();
        this.geburtsDatum = mitarbeiter.geburtsDatum;
        this.dayList = mitarbeiter.getDayList();
        this.abwesenheitHashMap = mitarbeiter.getAbwesenheitHashMap();
    }


    public boolean prüfeAbwesenheit(LocalDate localDate){
        if(abwesenheitHashMap.containsKey(localDate)){
            return true;
        }
        else{
            return false;
        }
    }

    public void addDayToDayList(DayOfWeek day){
        if(!dayList.contains(day)){
            dayList.add(day);
        }
        else {
            System.out.println("Tag schon vorhanden.");
        }
    }
    public static int getNextID() {
        return nextID;
    }

    public int getID() {
        return ID;
    }

    public void debugMitarbeiter(){
        System.out.println(this.ID + " " + this.name + " " + this.geburtsDatum.toString());
    }

    public String getName() {
        return name;
    }

    public HashMap<LocalDate, Abwesenheit> getAbwesenheitHashMap() {
        return abwesenheitHashMap;
    }

    public String getVorName() {
        return vorName;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public double getStdBeschränkung() {
        return stdBeschränkung;
    }

    public List<DayOfWeek> getDayList() {
        return dayList;
    }
}

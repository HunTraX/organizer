package Java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mitarbeiter {
    private static int nextID =0;
    private int ID;
    private String name;
    private String vorName;
    private LocalDate geburtsDatum;
    private double stdBeschränkung=0;
    private List<DayOfWeek> dayList = new ArrayList<DayOfWeek>();

    public Mitarbeiter(String name, String vorName, LocalDate geburtsDatum) {
        ID = nextID;
        nextID++;
        this.name = name;
        this.vorName = vorName;
        this.geburtsDatum = geburtsDatum;
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
}

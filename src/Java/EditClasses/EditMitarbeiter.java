package Java.EditClasses;

import Java.BaseClasses.Mitarbeiter;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Scanner;

public class EditMitarbeiter {
    private static  Scanner sc = new Scanner(System.in);
    private EditMitarbeiter(){
    }

    public static void editMitarbeiter(ArrayList<Mitarbeiter> liste, int mitarbeiterID){
        for(Mitarbeiter m: liste){
            if(m.getID() == mitarbeiterID){
                switch (sc.next()){
                    case "1":
                        setzeArbeitsTag(m);
                }
            }
        }
    }

    private static void setzeArbeitsTag(Mitarbeiter m){
        m.addDayToDayList(setDay());
    }

    private static DayOfWeek setDay (){
        switch(sc.nextInt()){
            case 1:
                return DayOfWeek.MONDAY;
            case 2:
                return DayOfWeek.TUESDAY;
            case 3:
                return DayOfWeek.WEDNESDAY;
            case 4:
                return DayOfWeek.THURSDAY;
            case 5:
                return DayOfWeek.FRIDAY;
            case 6:
                return DayOfWeek.SATURDAY;
            case 7:
                return DayOfWeek.SUNDAY;
            default:
                System.out.println("Fehler bei Eingabe! Bitte erneut versuchen.");
                return setDay();

        }
    }
}

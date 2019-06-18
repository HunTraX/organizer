package Java.CreaterClasses;

import Java.BaseClasses.DienstTemplate;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public final class CreateTemplate {
    private final static Scanner sc = new Scanner(System.in);
    private static DayOfWeek day;
    private static LocalTime start;
    private static double duration;

    private CreateTemplate(){

    }

    public static void createTemplate(ArrayList<DienstTemplate> dienstTemplates){
        System.out.println("Geben Sie bitte die nummer eines Tags ein: ");
        setDay();
        System.out.println("Startzeitpunkt eingeben:");
        start = LocalTime.parse(sc.next());
        System.out.println("Länge des Dienstes eingeben");
        duration = sc.nextDouble();
        DienstTemplate dT = new DienstTemplate(start, duration, day);
        dienstTemplates.add(dT);
    }
    private static void setDay (){
        switch(sc.nextInt()){
            case 1:
                day =DayOfWeek.MONDAY;
                break;
            case 2:
                day =DayOfWeek.TUESDAY;
                break;
            case 3:
                day =DayOfWeek.WEDNESDAY;
                break;
            case 4:
                day =DayOfWeek.THURSDAY;
                break;
            case 5:
                day =DayOfWeek.FRIDAY;
                break;
            case 6:
                day =DayOfWeek.SATURDAY;
                break;
            case 7:
                day =DayOfWeek.MONDAY;
                break;
                default:
                    System.out.println("Fehler bei Eingabe! Bitte erneut versuchen.");
                    setDay();
                    break;
        }
    }

}

package Java.CreaterClasses;

import Java.DienstPlan;
import Java.DienstTemplate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateDienstpläne {
    private static LocalDate start;
    private static LocalDate ende;
    private static Scanner sc = new Scanner(System.in);

    private CreateDienstpläne(){
    }

    public static void createTemplate(ArrayList<DienstTemplate> dienstTemplates){
        System.out.println("Startdatum eingeben:");
        start = LocalDate.parse(sc.next());
        System.out.println("Enddatum eingeben");
        ende  = LocalDate.parse(sc.next());
        DienstPlan dienstPlan = new DienstPlan(start, ende);
    }
}

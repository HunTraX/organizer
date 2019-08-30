package Java.CreaterClasses;

import Java.BaseClasses.DienstPlan;
import Java.BaseClasses.DienstTemplate;
import Java.BaseClasses.Mitarbeiter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateDienstpläne {
    private static LocalDate start;
    private static LocalDate ende;
    private static Scanner sc = new Scanner(System.in);

    private CreateDienstpläne(){
    }

    public static void create(ArrayList<DienstTemplate> dienstTemplates, List<Mitarbeiter> mitarbeiterList){
        System.out.println("Startdatum eingeben:");
        start = LocalDate.parse(sc.next());
        System.out.println("Enddatum eingeben");
        ende  = LocalDate.parse(sc.next());
        DienstPlan dienstPlan = new DienstPlan(start, ende, mitarbeiterList);
    }
}

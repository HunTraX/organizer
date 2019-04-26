package Java.CreaterClasses;

import Java.Mitarbeiter;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateMitarbeiter {
    private static Scanner sc;
    private static String name;
    private static String vorName;
    private static String geburtsDatumAsString;
    private static double stdBeschränkung=0;
    private static LocalDate geburtsDatum;
    
    private CreateMitarbeiter(ArrayList<Mitarbeiter> mList){

    }

    public static void createMitarbeiter(ArrayList<Mitarbeiter> liste){
        sc = new Scanner(System.in);
        System.out.println("Bitte geben sie ihren Nachnamen ein:");
        name = sc.nextLine();
        System.out.println("Bitte geben sie ihren Voramen ein:");
        vorName = sc.nextLine();
        // Geburtsdatum muss nach YYYY-MM-DD angegeben werden.
        System.out.println("Bitte geben sie ihr Geburtsdatum ein: (YYYY-MM-DD)");
        geburtsDatumAsString = sc.next();
        System.out.println(geburtsDatumAsString);

        geburtsDatum = LocalDate.parse(geburtsDatumAsString);

        Mitarbeiter m1 = new Mitarbeiter(name, vorName, geburtsDatum);
        liste.add(m1);
    }


}

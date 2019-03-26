package Java.CreaterClasses;

import Java.Mitarbeiter;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateMitarbeiter {
    Scanner sc;
    private String name;
    private String vorName;
    private String geburtsDatumAsString;
    private double stdBeschränkung=0;
    private LocalDate geburtsDatum;

    // TODO: Geburtsdatum erfassen
    public CreateMitarbeiter(ArrayList<Mitarbeiter> mList){
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
        mList.add(m1);
    }


}

package Java;

import java.time.LocalDate;
import java.util.Scanner;

public class CreateMitarbeiter {
    Scanner sc;
    private String name;
    private String vorName;
    private LocalDate geburtsDatum;
    private double stdBeschränkung=0;

    // TODO: Geburtsdatum erfassen
    public CreateMitarbeiter(){
        sc = new Scanner(System.in);
        System.out.println("Bitte geben sie ihren Nachnamen ein:");
        name = sc.nextLine();
        System.out.println("Bitte geben sie ihren Voramen ein:");
        vorName = sc.nextLine();
        //System.out.println("Bitte geben sie ihr Geburtsdatum ein:");
    }


}

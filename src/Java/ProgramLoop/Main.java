package Java.ProgramLoop;

import Java.BaseClasses.DienstPlan;
import Java.BaseClasses.DienstTemplate;
import Java.BaseClasses.Mitarbeiter;
import Java.CreaterClasses.CreateMitarbeiter;
import Java.CreaterClasses.CreateTemplate;
import Java.IOClasses.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Mitarbeiter> mitarbeiterList;
    ArrayList<DienstTemplate> dienstTemplates;
    DienstPlan dienstPlanList;


    public Main() throws Exception {
        mitarbeiterList = LoadMitarbeiter.load();
        dienstTemplates = LoadTemplate.load();
        dienstPlanList = LoadDienstPlan.getDienstPlan();
        try{
            menueLoop();
        }catch(Exception e){
            SaveMitarbeiter.saveMitarbeiter(mitarbeiterList);
            SaveTemplate.saveTemplate(dienstTemplates);
            SaveDienstPlan.SaveDienstPlan(dienstPlanList);
            System.out.println(e.getMessage());
        }
    }

    private void menueLoop() {
        Scanner sc = new Scanner(System.in);
        int whileAnker = 1;
        System.out.println("1: Lege Mitarbeiter an.\n2: Lege eine Dienstvorlage an.\n3: Generiere DienstPlan." +
                "\n4: Liste Mitarbeiter auf.\n5: Liste Templates auf.\n99: BeendenS");
        while (whileAnker == 1) {
            switch (sc.next()) {
                case "1":
                    CreateMitarbeiter.createMitarbeiter(mitarbeiterList);
                    break;
                case "2":
                    CreateTemplate.createTemplate(dienstTemplates);
                    break;
                case "3":
                    break;
                case "4":
                    listeMitarbeiterAuf();
                    break;
                case "5":
                    listeDienstTemplatesAuf();
                    break;
                case "99":
                    SaveMitarbeiter.saveMitarbeiter(mitarbeiterList);
                    SaveTemplate.saveTemplate(dienstTemplates);
                    SaveDienstPlan.SaveDienstPlan(dienstPlanList);
                    whileAnker = 0;
                    break;
            }
        }
    }

    private void listeMitarbeiterAuf() {
        for (Mitarbeiter m : mitarbeiterList) {
            System.out.println(m.getID() + " -- " + m.getName() + ", " + m.getVorName() + " geboren: " + m.getGeburtsDatum().toString());
        }
    }

    private void listeDienstTemplatesAuf() {
        for (DienstTemplate dt : dienstTemplates) {
            System.out.println(dt.getDay() + " --- " + " von: " + dt.getStart() + " Dauer: " + dt.getLänge());
        }
    }
}

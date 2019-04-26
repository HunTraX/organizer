package Java;

import Java.CreaterClasses.CreateMitarbeiter;
import Java.CreaterClasses.CreateTemplate;
import Java.IOClasses.LoadMitarbeiter;
import Java.IOClasses.LoadTemplate;
import Java.IOClasses.SaveMitarbeiter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DebugClass {
    public DebugClass() {

        Scanner sc = new Scanner(System.in);

        ArrayList<DienstTemplate> dienstTemplateArrayList = LoadTemplate.load();
        ArrayList<Mitarbeiter> mList = LoadMitarbeiter.load();
        while(true){
            CreateMitarbeiter.createMitarbeiter(mList);
            if (sc.next().equals("X")){
                break;
            }
        }
        CreateTemplate.createTemplate(dienstTemplateArrayList);
        for(Mitarbeiter mitarbeiter: mList){
            mitarbeiter.debugMitarbeiter();
        }


        SaveMitarbeiter.saveMitarbeiter(mList);

    }
}

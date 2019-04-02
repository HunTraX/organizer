package Java;

import Java.CreaterClasses.CreateMitarbeiter;
import Java.IOClasses.LoadMitarbeiter;
import Java.IOClasses.SaveMitarbeiter;

import java.io.IOException;
import java.util.ArrayList;

public class DebugClass {
    public DebugClass() {


        ArrayList<Mitarbeiter> mList = LoadMitarbeiter.load();
        CreateMitarbeiter.createMitarbeiter(mList);
        for(Mitarbeiter mitarbeiter: mList){
            mitarbeiter.debugMitarbeiter();
        }


        SaveMitarbeiter.saveMitarbeiter(mList);

    }
}

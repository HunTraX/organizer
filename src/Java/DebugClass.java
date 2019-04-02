package Java;

import Java.CreaterClasses.CreateMitarbeiter;
import Java.IOClasses.LoadMitarbeiter;
import Java.IOClasses.SaveMitarbeiter;

import java.io.IOException;
import java.util.ArrayList;

public class DebugClass {
    public DebugClass() {
        CreateMitarbeiter

        ArrayList<Mitarbeiter> mList = LoadMitarbeiter.load();
        for(Mitarbeiter mitarbeiter: mList){
            mitarbeiter.debugMitarbeiter();
        }


        SaveMitarbeiter saveMitarbeiter = new SaveMitarbeiter(mList);

    }
}

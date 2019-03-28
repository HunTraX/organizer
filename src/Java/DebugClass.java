package Java;

import Java.IOClasses.LoadMitarbeiter;
import Java.IOClasses.SaveMitarbeiter;

import java.io.IOException;
import java.util.ArrayList;

public class DebugClass {
    public DebugClass() throws IOException {
        ArrayList<Mitarbeiter> mList = LoadMitarbeiter.load();
        for(Mitarbeiter mitarbeiter: mList){
            mitarbeiter.debugMitarbeiter();
        }


        SaveMitarbeiter saveMitarbeiter = new SaveMitarbeiter(mList);

    }
}

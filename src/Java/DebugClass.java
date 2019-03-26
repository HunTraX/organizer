package Java;

import Java.CreaterClasses.CreateDienst;
import Java.CreaterClasses.CreateMitarbeiter;
import Java.CreaterClasses.LoadMitarbeiter;
import Java.CreaterClasses.SaveMitarbeiter;

import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DebugClass {
    public DebugClass() throws IOException {
        ArrayList<Mitarbeiter> mList = new ArrayList();
        LoadMitarbeiter loadMitarbeiter = new LoadMitarbeiter(mList);
        for(Mitarbeiter mitarbeiter: mList){
            mitarbeiter.debugMitarbeiter();
        }


        SaveMitarbeiter saveMitarbeiter = new SaveMitarbeiter(mList);

    }
}

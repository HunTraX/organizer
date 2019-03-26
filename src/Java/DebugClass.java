package Java;

import Java.CreaterClasses.CreateDienst;
import Java.CreaterClasses.CreateMitarbeiter;
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
        Mitarbeiter m = new Mitarbeiter("Patrick", "Leonhardt", LocalDate.of(1995, 4, 14));
        mList.add(m);
        Dienst d = new Dienst(mList, LocalDateTime.of(2019, 3, 10, 14, 0), LocalDateTime.of(2019, 3, 10, 18, 0));
        CreateDienst createD = new CreateDienst();

        CreateMitarbeiter createMitarbeiter = new CreateMitarbeiter(mList);
        for(Mitarbeiter mitarbeiter: mList){
            mitarbeiter.debugMitarbeiter();
        }

        SaveMitarbeiter saveMitarbeiter = new SaveMitarbeiter(mList);

    }
}

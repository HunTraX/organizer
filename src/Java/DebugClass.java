package Java;

import Java.CreaterClasses.CreateDienst;
import Java.CreaterClasses.CreateMitarbeiter;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DebugClass {
    public DebugClass(){
        ArrayList<Mitarbeiter> mList = new ArrayList();
        Mitarbeiter m = new Mitarbeiter("Patrick", "Leonhardt", LocalDate.of(1995, 4, 14));
        mList.add(m);
        Dienst d = new Dienst(mList, LocalDateTime.of(2019, 3, 10, 14, 0), LocalDateTime.of(2019, 3, 10, 18, 0));
        CreateDienst createD = new CreateDienst();

        CreateMitarbeiter createMitarbeiter = new CreateMitarbeiter(mList);

    }
}

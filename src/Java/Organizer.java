package Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Organizer {
    public static void main(String[] args){
        List mList = new ArrayList();
        Mitarbeiter m = new Mitarbeiter("Patrick", "Leonhardt", LocalDate.of(1995, 4, 14));
        mList.add(m);
        Dienst d = new Dienst(mList, LocalDateTime.of(2019, 3, 10, 14, 0), LocalDateTime.of(2019, 3, 10, 18, 0));
    }
}

package Java.IOClasses;

import Java.Mitarbeiter;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoadMitarbeiter {
    private LoadMitarbeiter() {}

    public static ArrayList<Mitarbeiter> load() {
        ArrayList<Mitarbeiter> mList = new ArrayList<>();
        try {
            File dir = new File("C:/Organizer/Data/MitarbeiterData.txt");
            InputStream in = new FileInputStream(dir);
            ObjectInputStream reader = new ObjectInputStream(in);
            while (true) {
                Mitarbeiter m = (Mitarbeiter) reader.readObject();

                if (m != null) {
                    Mitarbeiter mNew = new Mitarbeiter(m);
                    mList.add(mNew);
                } else {
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return mList;
    }
}

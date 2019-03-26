package Java.CreaterClasses;

import Java.Mitarbeiter;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoadMitarbeiter {
    public LoadMitarbeiter(ArrayList<Mitarbeiter> mList){
        try {
        File dir = new File("C:/Organizer/Data/MitarbeiterData.txt");
            InputStream in = new FileInputStream(dir);
            ObjectInputStream reader = new ObjectInputStream(in);
            while(true){
                Mitarbeiter m =  (Mitarbeiter) reader.readObject();

                if (m != null){
                    Mitarbeiter mNew = new Mitarbeiter(m);
                    mList.add(mNew);
                }else {
                    break;
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

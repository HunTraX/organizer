package Java.IOClasses;

import Java.BaseClasses.Mitarbeiter;

import java.io.*;
import java.util.ArrayList;

public class SaveMitarbeiter {
    private SaveMitarbeiter(ArrayList<Mitarbeiter> list) {

    }

    public static void saveMitarbeiter(ArrayList<Mitarbeiter> list){
        try {
            File dir = new File("C:/Organizer/Data/Mitarbeiter");
            dir.mkdirs();
            OutputStream out = new FileOutputStream(dir.getAbsolutePath()+"Data.txt");
            ObjectOutputStream writer = new ObjectOutputStream(out);

            for (Mitarbeiter m: list) {
                writer.writeObject(m);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

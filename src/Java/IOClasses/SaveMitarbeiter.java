package Java.IOClasses;

import Java.Mitarbeiter;

import java.io.*;
import java.util.ArrayList;

public class SaveMitarbeiter {
    public SaveMitarbeiter(ArrayList<Mitarbeiter> list) {
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

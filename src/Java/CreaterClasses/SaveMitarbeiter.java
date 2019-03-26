package Java.CreaterClasses;

import Java.Mitarbeiter;

import java.io.*;
import java.util.ArrayList;

public class SaveMitarbeiter {
    public SaveMitarbeiter(ArrayList<Mitarbeiter> list)throws FileNotFoundException, IOException {
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

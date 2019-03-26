package Java.CreaterClasses;

import Java.Mitarbeiter;

import java.io.*;

public class LoadMitarbeiter {
    public LoadMitarbeiter(){
        try {
        File dir = new File("C:/Organizer/Data/Mitarbeiter");
            InputStream in = new FileInputStream(dir);
            ObjectInputStream input = new ObjectInputStream(in);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

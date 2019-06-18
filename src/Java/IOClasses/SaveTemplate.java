package Java.IOClasses;

import Java.BaseClasses.DienstTemplate;
import Java.BaseClasses.Mitarbeiter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class SaveTemplate {
    private SaveTemplate(ArrayList<Mitarbeiter> list) {

    }

    public static void saveTemplate (ArrayList<DienstTemplate> list){
        try {
            File dir = new File("C:/Organizer/Data/Template");
            dir.mkdirs();
            OutputStream out = new FileOutputStream(dir.getAbsolutePath()+"Data.txt");
            ObjectOutputStream writer = new ObjectOutputStream(out);

            for (DienstTemplate dienstTemplate: list) {
                writer.writeObject(dienstTemplate);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

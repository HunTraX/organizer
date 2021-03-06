package Java.IOClasses;

import Java.BaseClasses.DienstPlan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SaveDienstPlan {
    private SaveDienstPlan() {
    }

    public static void SaveDienstPlan(DienstPlan dienstPlan) {
        try {
            File dir = new File("C:/Organizer/Data/dienstPlan");
            dir.mkdirs();
            OutputStream out = new FileOutputStream(dir.getAbsolutePath()+"Data.txt");
            ObjectOutputStream writer = new ObjectOutputStream(out);
            writer.writeObject(dienstPlan);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

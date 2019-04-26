package Java.IOClasses;

import Java.DienstTemplate;
import Java.Mitarbeiter;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LoadTemplate {
    private LoadTemplate() {}

    public static ArrayList<DienstTemplate> load() {
        ArrayList<DienstTemplate> dTList = new ArrayList<>();
        try {
            File dir = new File("C:/Organizer/Data/TemplateData.txt");
            InputStream in = new FileInputStream(dir);
            ObjectInputStream reader = new ObjectInputStream(in);
            while (true) {
                DienstTemplate dT = (DienstTemplate) reader.readObject();

                if (dT != null) {
                    DienstTemplate dTNew = new DienstTemplate(dT);
                    dTList.add(dTNew);
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Fehler: "+e.getMessage());
        }
        return dTList;
    }
}

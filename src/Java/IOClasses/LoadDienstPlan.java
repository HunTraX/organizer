package Java.IOClasses;

import Java.BaseClasses.DienstPlan;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class LoadDienstPlan {
    private LoadDienstPlan() {
    }

    public static DienstPlan getDienstPlan() {
        try{
            File dir = new File("C:/Organizer/Data/DienstPlanData.txt");
            InputStream in = new FileInputStream(dir);
            ObjectInputStream reader = new ObjectInputStream(in);
            DienstPlan dienstPlan = new DienstPlan((DienstPlan) reader.readObject());
            if(dienstPlan != null){
            return dienstPlan;
            }
        } catch (Exception e){
            return null;
        }
        return null;
    }
}

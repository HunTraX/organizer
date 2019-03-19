package Java.CreaterClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateDienst {
    String datetime = "14-04-1995 11:04";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    LocalDateTime start = LocalDateTime.parse(datetime, formatter);
    public CreateDienst(){
        System.out.println(start.toString());
    }
}

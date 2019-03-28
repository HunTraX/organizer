package Java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DienstPlan {
    private List<DienstTemplate> dienstTemplateList = new ArrayList<>();
    private LocalDate von;
    private LocalDate bis;

    public DienstPlan(LocalDate von, LocalDate bis) {
        this.von = von;
        this.bis = bis;
    }
}

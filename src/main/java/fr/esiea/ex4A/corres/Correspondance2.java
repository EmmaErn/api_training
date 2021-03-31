package fr.esiea.ex4A.corres;
import fr.esiea.ex4A.corres.Correspondance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Correspondance2 extends ArrayList<Correspondance> {


    public Correspondance2(List<Correspondance> correspondance){
        super();
        this.addAll(correspondance);
    }

    public Correspondance2(Correspondance... correspondance){
        super();
        this.addAll(Arrays.asList(correspondance));
    }
}

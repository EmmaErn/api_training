package fr.esiea.ex4A.corres;
import fr.esiea.ex4A.corres.Correspondance;
import fr.esiea.ex4A.corres.Utilisateur;
import fr.esiea.ex4A.corres.Correspondance2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Match {
    @PostMapping(path = "api/inscription")
    void registerUser(@RequestBody Utilisateur user){
        System.out.println(user);
    }

    @GetMapping(path = "api/correspondance", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Correspondance> getCorrespondance(String name, String country){

        return new Correspondance2(new Correspondance("cam", "camille"),
            new Correspondance("max", "maxime"),
            new Correspondance("nael", "emma"));
    }


}

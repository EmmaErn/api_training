package fr.esiea.ex4A.corres;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Match {
    @PostMapping(path = "api/inscription")
    void registerUtilisateur(@RequestBody Utilisateur utilisateur){
        System.out.println(utilisateur);
    }

    @GetMapping(path = "api/correspondance", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Correspondance> getCorrespondance(String name, String country){

        return new Correspondance2(new Correspondance("cam", "camille"),
            new Correspondance("max", "maxime"),
            new Correspondance("nael", "emma"));
    }


}

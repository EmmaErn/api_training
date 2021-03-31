package fr.esiea.ex4A.corres;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestCorrespondance2{
    @ParameterizedTest
    @ValueSource(strings = {"""
        Nom1,Twitter1
        Smith,Will
        Canet ,Guillaume
        """, """
        Belmondo,JP
        Canet,Guillaume
        Niney,Pierre
        """
    })
    void correspondanceresponse_filling_list_test(String NomNTwitter){
        List<Correspondance> identifiants = Arrays.stream(NomNTwitter.split("\n")).map(s -> {
            String[] kv = s.split(",");
            return new Correspondance(kv[0],kv[1]);
        }).collect(Collectors.toList());

        Correspondance2 correspondance = new Correspondance2(identifiants);

        correspondance.forEach(m -> assertTrue(identifiants.contains(m)));

    }
    @ParameterizedTest
    @CsvSource({
        "Belmondo,JP,Canet,Guillaume,Niney,Guillaume"
    })
    void correspondanceresponse_mult_val_test(String Nom1, String Twitter1, String Nom2, String Twitter2, String Nom3, String Twitter3){
        List<Correspondance> identifiants = Arrays.asList(new Correspondance(Nom1, Twitter1),
            new Correspondance(Nom2, Twitter2),
            new Correspondance(Nom3, Twitter3));
        Correspondance2 correspondance = new Correspondance2(identifiants.get(0),
            identifiants.get(1),
            identifiants.get(2));

        correspondance.forEach(m -> assertTrue(identifiants.contains(m)));
    }

}

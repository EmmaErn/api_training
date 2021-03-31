package fr.esiea.ex4A.corres;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class TestUtilisateur {

    @ParameterizedTest
    @ValueSource(strings = {"{\"userEmail\":\"test@mail.fr\",\"userName\":\"camille\",\"userTweeter\":\"camillalamilla\",\"userCountry\":\"FR\",\"userSex\":\"F\",\"userSexPref\":\"M\"}"
    })
    void user_from_Json_test(String json){
        try {
            Utilisateur utilisateur = new ObjectMapper().readValue(json, Utilisateur.class);
            System.out.println(utilisateur.toString());
            Assertions.assertTrue(json.contains(utilisateur.userCountry));
            Assertions.assertTrue(json.contains(utilisateur.userEmail));
            Assertions.assertTrue(json.contains(utilisateur.userName));
            Assertions.assertTrue(json.contains(utilisateur.userTweeter));
            Assertions.assertTrue(json.contains(utilisateur.userSex.name()));
            Assertions.assertTrue(json.contains(utilisateur.userSexPref.name()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }
}

package fr.esiea.ex4A.corres;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.esiea.ex4A.corres.Sexe;

public class Utilisateur {

    public final String userEmail;
    public final String userName;
    public final String userTweeter;
    public final String userCountry;
    public final Sexe userSex;
    public final Sexe userSexPref;


    public Utilisateur(@JsonProperty("userEmail") String userEmail,@JsonProperty("userName")  String userName,
                @JsonProperty("userTweeter") String userTweeter,@JsonProperty("userCountry")  String userCountry,
                @JsonProperty("userSex") Sexe userSex,@JsonProperty("userSexPref")  Sexe userSexPref) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userTweeter = userTweeter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
            "userEmail='" + userEmail + '\'' +
            ", userName='" + userName + '\'' +
            ", userTweeter='" + userTweeter + '\'' +
            ", userCountry='" + userCountry + '\'' +
            ", userSex=" + userSex +
            ", userSexPref=" + userSexPref +
            '}';
    }
}

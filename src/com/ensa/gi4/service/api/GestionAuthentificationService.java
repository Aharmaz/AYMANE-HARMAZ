package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.User;

import java.util.List;

public interface GestionAuthentificationService {

    User chercherUser (List<String> userCredentials);

}

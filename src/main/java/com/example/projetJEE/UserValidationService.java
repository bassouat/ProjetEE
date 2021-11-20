package com.example.projetJEE;

public class UserValidationService {
    public boolean isUserValid(String user, String password) {
        if (user.equals("ouattara") && password.equals("reussite"))
            return true;
        return false;

    }
}

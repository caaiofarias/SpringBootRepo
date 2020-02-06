package com;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Bcrypt {
    

    public static String gerarBcrypt(String senha) {
        if (senha == null){
            return senha;
        }
        BCryptPasswordEncoder bEncoder = new BCryptPasswordEncoder();
        return bEncoder.encode(senha);
    }

    public static boolean validatePasswd(String senha,String senhaCrypt) {
        BCryptPasswordEncoder bEncoder = new BCryptPasswordEncoder();
        return bEncoder.matches(senha, senhaCrypt);
    }
}
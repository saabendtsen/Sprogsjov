package com.company;

public class French implements Dialog{

    private String s = "french";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "appuyez sur q pour arrêter ";
    }

    @Override
    public String selectedLanguage() {
        return "la langue sélectionnée est ";
    }
}

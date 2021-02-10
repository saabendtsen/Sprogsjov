package com.company;

public class Norsk implements Dialog{


    private String s = "norsk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "trykk på q for å stoppe ";
    }

    @Override
    public String selectedLanguage() {
        return "det valgte språket er ";
    }
}
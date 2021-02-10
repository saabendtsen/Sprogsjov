package com.company;

public class Piratsprog implements Dialog {

    final String s = "PiratSprog";


    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "“Ill skewer yer gizzard, ye salty sea bass... Avast!”";
    }

    @Override
    public String selectedLanguage() {
        return "th' selected language be ";
    }
}



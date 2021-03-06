package com.company;

import java.util.HashMap;

public class Sprog  {

    private HashMap<String, Dialog> dialoger = new HashMap<>();

    public Sprog() {


        // her tilføjer du ny sprog
        dialoger.put("da", new Dansk());
        dialoger.put("eng", new English());
        dialoger.put("no", new Norsk());
        dialoger.put("pi", new Piratsprog());
        dialoger.put("fr", new French());
        dialoger.put("cn", new Chinese());

    }
    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }
}

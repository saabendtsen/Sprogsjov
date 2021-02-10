package com.company;

public class Chinese implements Dialog{

    private String s ="中文";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "输入q退出";
    }

    @Override
    public String selectedLanguage() {
        return "您选择了"+s;
    }
}

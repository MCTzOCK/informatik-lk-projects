package com.bensiebert.informatik;

public class Argument {

    public String name;
    public String description;
    public String value;

    public Argument(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static String[] argArrayToArgs(Argument[] args) {
        String[] result = new String[args.length];
        for(int i = 0; i < args.length; i++) {
            result[i] = args[i].value;
        }
        return result;
    }
}

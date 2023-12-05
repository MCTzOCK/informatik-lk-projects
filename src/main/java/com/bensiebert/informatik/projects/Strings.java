package com.bensiebert.informatik.projects;

import com.bensiebert.informatik.Argument;
import com.bensiebert.informatik.Project;

public class Strings extends Project {


    public Strings() {
        super("Strings");

        this.args = new Argument[] {};
    }

    @Override
    public void launch() {
        super.launch();

        String str = "String";

        console.println("Der angegebene String ist: " + str);
        console.println("");
        console.println("Methode length():" + str.length());
        console.println("\tGibt die Länge des gegebenen Strings zurück.");
        console.println("");
        console.println("Methode indexOf(String):" + str.indexOf("ri"));
        console.println("\tGibt den Index des ersten Vorkommens des gegebenen Strings zurück.");
        console.println("");
        console.println("Methode substring(int):" + str.substring(2));
        console.println("\tGibt den Teilstring ab dem gegebenen Index zurück.");
        console.println("");
        console.println("Methode substring(int, int):" + str.substring(2, 4));
        console.println("\tGibt den Teilstring ab dem ersten Index bis zum zweiten Index zurück.");
        console.println("");
        console.println("Methode charAt(int):" + str.charAt(2));
        console.println("\tGibt das Zeichen an der gegebenen Position zurück.");
        console.println("");
        console.println("Methode equals(String):" + str.equals("String"));
        console.println("\tGibt true zurück, wenn der gegebene String gleich dem gegebenen String ist.");
        console.println("");
        console.println("Methode startsWith(String):" + str.startsWith("Str"));
        console.println("\tGibt true zurück, wenn der gegebene String mit dem gegebenen String beginnt.");
        console.println("");
        console.println("Methode compareTo(String):" + str.compareTo("String"));
        console.println("\tGibt 0 zurück, wenn der gegebene String gleich dem gegebenen String ist.");
        console.println("\tGibt einen negativen Wert zurück, wenn der gegebene String vor dem gegebenen String kommt.");
        console.println("\tGibt einen positiven Wert zurück, wenn der gegebene String nach dem gegebenen String kommt.");

    }
}

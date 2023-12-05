package com.bensiebert.informatik;

import com.bensiebert.informatik.console.ConsoleSession;

public abstract class Project {

    public String name;
    public Argument[] args;
    public ConsoleSession console;

    public Project(String name) {
        this.name = name;
    }

    public void launch() {
        this.console = new ConsoleSession(this.name);
        this.console.showConsoleSession();
    }

}

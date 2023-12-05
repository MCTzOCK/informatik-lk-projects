package com.bensiebert.informatik.projects.hanoi;

import com.bensiebert.informatik.Argument;
import com.bensiebert.informatik.Project;
import sun.reflect.ReflectionFactory;

public class Hanoi extends Project {
    public Hanoi() {
        super("Türme von Hanoi");
        this.args = new Argument[] {
                new Argument("n", "Anzahl der Scheiben")
        };
    }

    @Override
    public void launch() {
        super.launch();
        String[] args = Argument.argArrayToArgs(this.args);
        int n = Integer.parseInt(args[0]);
        hanoi(n, 1, 3);
    }

    private void hanoi(int n, int a, int z) {
        if(n == 1) {
            this.console.println("Bewege Scheibe von " + a + " nach " + z);
        } else {
            int h = 6 - a - z;
            hanoi(n - 1, a, h);
            this.console.println("Bewege Scheibe von " + a + " nach " + z);
            hanoi(n - 1, h, z);
        }
    }

}

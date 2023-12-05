package com.bensiebert.informatik.projects;

import com.bensiebert.informatik.Argument;
import com.bensiebert.informatik.Project;

public class Fibonacci extends Project {

    public Fibonacci() {
        super("Fibonacci");
        this.args = new Argument[] {
                new Argument("n", "Max. Iteration")
        };
    }

    @Override
    public void launch() {
        super.launch();
        String[] args = Argument.argArrayToArgs(this.args);
        int n = Integer.parseInt(args[0]);
        for(int i = 0; i < n; i++) {
            this.console.println(String.valueOf(fibonacci(i)));
        }
    }

    public int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


}

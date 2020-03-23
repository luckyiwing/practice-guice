package org.example.helloworlddemo;

import java.io.PrintStream;

public class PrintStringWriter implements MyDestination {

    private PrintStream destination;

    public PrintStringWriter(PrintStream destination) {
        this.destination = destination;
    }

    @Override
    public void write(String string) {
        destination.println(string);
    }
}

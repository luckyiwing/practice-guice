package org.example.helloworlddemo;

public class StringWriteApplet implements MyApplet {


    private MyDestination destination;
    private StringProvider stringProvider;

    public StringWriteApplet(MyDestination destination, StringProvider stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;

    }

    private void writeString() {
        destination.write(stringProvider.get());
    }

    @Override
    public void run() {
        writeString();
    }
}

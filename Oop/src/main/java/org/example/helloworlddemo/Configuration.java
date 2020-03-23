package org.example.helloworlddemo;

public class Configuration {

    public static MyApplet getMainApplet() {
        return new StringWriteApplet(
                new PrintStringWriter(System.out),
                new StringProvider() {
                    @Override
                    public String get() {
                        return "Hello World!";
                    }
                });
    }
}
